package illusive.networks.service.setting.impl;

import illusive.networks.dto.setting.SettingDTO;
import illusive.networks.entity.setting.Setting;
import illusive.networks.mapper.ICrudMapper;
import illusive.networks.service.SimpleCrudFacade;
import illusive.networks.service.setting.ISettingFacade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by alon on 1/3/2020.
 */
@Component
public class SettingFacade extends SimpleCrudFacade<SettingDTO, Setting> implements ISettingFacade {

    public SettingFacade(CrudRepository<Setting, UUID> dao, ICrudMapper<SettingDTO, Setting> crudMapper) {
        super(dao, crudMapper);
    }
}
