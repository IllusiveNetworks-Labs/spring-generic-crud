package illusive.networks.service.setting;

import illusive.networks.dto.setting.SettingDTO;
import illusive.networks.service.CrudFacade;

/**
 * Created by alon on 1/3/2020.
 */
public interface ISettingFacade extends CrudFacade<SettingDTO> {

    Iterable<SettingDTO> otherMethod();
}
