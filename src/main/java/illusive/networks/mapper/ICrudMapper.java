package illusive.networks.mapper;

import illusive.networks.dto.BaseDTO;
import illusive.networks.entity.BaseEntity;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by alon on 1/2/2020.
 */
@NoRepositoryBean
public interface ICrudMapper<DTO extends BaseDTO, Entity extends BaseEntity> {

    Entity toEntity(DTO dto);

    DTO toDTO(Entity entity);

}
