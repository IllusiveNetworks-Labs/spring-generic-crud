package illusive.networks.mapper.impl;

import illusive.networks.dto.BaseDTO;
import illusive.networks.entity.BaseEntity;
import illusive.networks.mapper.ICrudMapper;
import illusive.networks.mapper.IOrikaMapper;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by alon on 1/3/2020.
 */
@Component
public class CrudMapper<DTO extends BaseDTO, Entity extends BaseEntity> implements ICrudMapper<DTO, Entity> {

    protected MapperFacade mapper = null;

    @Autowired
    private List<IOrikaMapper> mappers;

    @PostConstruct
    public void init() {
        if (mapper == null) {
            final MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
            mappers.forEach(mappingSupplier -> mappingSupplier.addMapping(mapperFactory));
            this.mapper = mapperFactory.getMapperFacade();
        }
    }

    @Override
    public Entity toEntity(DTO dto) {
        return (Entity) mapper.map(dto, BaseEntity.class);
    }

    @Override
    public DTO toDTO(Entity entity) {
        return (DTO) mapper.map(entity, BaseDTO.class);
    }
}
