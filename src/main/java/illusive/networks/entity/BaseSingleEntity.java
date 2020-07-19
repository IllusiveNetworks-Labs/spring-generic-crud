package illusive.networks.entity;

import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by alon on 1/7/2020.
 */
@NoArgsConstructor
public abstract class BaseSingleEntity extends BaseEntity {

    public BaseSingleEntity(UUID id) {
        super(id);
    }

    public abstract UUID getUniqueIdentifier();

}
