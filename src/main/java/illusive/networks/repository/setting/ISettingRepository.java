package illusive.networks.repository.setting;

import illusive.networks.entity.setting.Setting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by alon on 1/2/2020.
 */
@Repository
public interface ISettingRepository extends CrudRepository<Setting, UUID> {
}
