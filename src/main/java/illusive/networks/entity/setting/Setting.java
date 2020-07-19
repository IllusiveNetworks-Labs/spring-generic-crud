package illusive.networks.entity.setting;

import illusive.networks.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.UUID;

/**
 * Created by alon on 1/2/2020.
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Setting extends BaseEntity {

    private String member;

    public Setting(UUID id, String member) {
        super(id);
        this.member = member;
    }
}
