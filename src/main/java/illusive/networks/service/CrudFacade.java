package illusive.networks.service;

import illusive.networks.dto.BaseDTO;
import illusive.networks.entity.BaseEntity;
import illusive.networks.mapper.ICrudMapper;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by alon on 1/2/2020.
 */
public class CrudFacade<DTO extends BaseDTO, Entity extends BaseEntity> implements ICrudFacade<DTO> {

    protected final CrudRepository<Entity, UUID> dao;
    protected final ICrudMapper<DTO, Entity> mapper;

    public CrudFacade(CrudRepository<Entity, UUID> dao, ICrudMapper<DTO, Entity> mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<DTO> find(UUID id) {
        Optional<Entity> entity = dao.findById(id);
        return entity.map(mapper::toDTO);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DTO> findAll() {
        return StreamSupport.stream(dao.findAll().spliterator(), false)
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public UUID create(DTO dto) {
        Entity entity = mapper.toEntity(dto);
        entity.setId(UUID.randomUUID());
        dao.save(entity);
        return entity.getId();
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createBulk(List<DTO> dtos) {
        List<Entity> entities = dtos.stream().map(mapper::toEntity).collect(Collectors.toList());
        entities.forEach(entity -> entity.setId(UUID.randomUUID()));
        dao.saveAll(entities);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void edit(UUID id, DTO dto) {
        dao.deleteById(id);
        Entity entity = mapper.toEntity(dto);
        entity.setId(id);
        dao.save(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(UUID id) {
        dao.deleteById(id);
    }
}
