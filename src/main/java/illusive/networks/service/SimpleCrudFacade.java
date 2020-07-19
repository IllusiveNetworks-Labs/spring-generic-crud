package illusive.networks.service;

import illusive.networks.dto.BaseDTO;
import illusive.networks.entity.BaseEntity;
import illusive.networks.mapper.CrudMapper;
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
public class SimpleCrudFacade<DTO extends BaseDTO, Entity extends BaseEntity> implements CrudFacade<DTO> {

    protected final CrudRepository<Entity, UUID> dao;
    protected final CrudMapper<DTO, Entity> mapper;

    public SimpleCrudFacade(CrudRepository<Entity, UUID> dao, CrudMapper<DTO, Entity> mapper) {
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
    public void create(DTO dto) {
        Entity entity = mapper.toEntity(dto);
        dao.save(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void createBulk(List<DTO> dtos) {
        List<Entity> entities = dtos.stream().map(mapper::toEntity).collect(Collectors.toList());
        dao.saveAll(entities);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void edit(DTO dto) {
        dao.deleteById(dto.getId());
        Entity entity = mapper.toEntity(dto);
        dao.save(entity);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(UUID id) {
        dao.deleteById(id);
    }
}
