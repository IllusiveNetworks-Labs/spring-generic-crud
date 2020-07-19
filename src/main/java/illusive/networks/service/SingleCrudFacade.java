package illusive.networks.service;

import illusive.networks.dto.BaseDTO;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

/**
 * Created by alon on 1/6/2020.
 */
@NoRepositoryBean
public interface SingleCrudFacade<DTO extends BaseDTO> {

    Optional<DTO> find();

    void createOrUpdate(DTO dto);

    void delete();

}
