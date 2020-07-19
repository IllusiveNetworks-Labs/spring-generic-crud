package illusive.networks.controller.setting;

import illusive.networks.controller.CrudController;
import illusive.networks.dto.setting.SettingDTO;
import illusive.networks.service.setting.ISettingFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alon on 6/24/2019.
 */
@RestController
@RequestMapping("/setting")
public class SettingController extends CrudController<SettingDTO> {

    @Autowired
    private ISettingFacade settingFacade;

    public SettingController(ISettingFacade facade) {
        super(facade);
    }

}
