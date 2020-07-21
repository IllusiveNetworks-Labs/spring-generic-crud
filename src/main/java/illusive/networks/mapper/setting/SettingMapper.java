package illusive.networks.mapper.setting;

import illusive.networks.dto.setting.SettingDTO;
import illusive.networks.entity.setting.Setting;
import illusive.networks.mapper.IOrikaMapper;
import ma.glasnost.orika.MapperFactory;
import org.springframework.stereotype.Component;

/**
 * Created by alon on 1/4/2020.
 */
@Component
public class SettingMapper implements IOrikaMapper {

    @Override
    public void addMapping(MapperFactory mapperFactory) {
        mapperFactory.classMap(Setting.class, SettingDTO.class)
                .byDefault()
                .register();
    }
}
