package illusive.networks.dto.setting;

import illusive.networks.dto.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

/**
 * Created by alon on 1/2/2020.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class SettingDTO extends BaseDTO {

    private String member;

    public SettingDTO(UUID id, String member) {
        super(id);
        this.member = member;
    }
}
