package illusive.networks.dto.setting;

import illusive.networks.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Created by alon on 1/2/2020.
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SettingDTO extends BaseDTO {

    private String data;

}
