package illusive.networks.entity.setting;

import illusive.networks.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.UUID;

/**
 * Created by alon on 1/2/2020.
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Setting extends BaseEntity {

    private String member;

    public Setting(UUID id, String member) {
        super(id);
        this.member = member;
    }
}
