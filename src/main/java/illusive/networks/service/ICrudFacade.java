package illusive.networks.service;

import illusive.networks.dto.BaseDTO;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by alon on 1/2/2020.
 */
@NoRepositoryBean
public interface ICrudFacade<DTO extends BaseDTO> {

    Optional<DTO> find(UUID id);

    List<DTO> findAll();

    UUID create(DTO dto);

    void createBulk(List<DTO> dtos);

    void edit(UUID id, DTO dto);

    void delete(UUID id);

}
