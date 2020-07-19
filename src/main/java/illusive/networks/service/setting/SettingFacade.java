package illusive.networks.service.setting;

import illusive.networks.dto.setting.SettingDTO;
import illusive.networks.entity.setting.Setting;
import illusive.networks.mapper.CrudMapper;
import illusive.networks.service.SimpleCrudFacade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created by alon on 1/3/2020.
 */
@Component
public class SettingFacade extends SimpleCrudFacade<SettingDTO, Setting> implements ISettingFacade {

    public SettingFacade(CrudRepository<Setting, UUID> dao, CrudMapper<SettingDTO, Setting> crudMapper) {
        super(dao, crudMapper);
    }

    @Override
    public Iterable<SettingDTO> otherMethod() {
        return StreamSupport.stream(dao.findAll().spliterator(), false)
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }
}
