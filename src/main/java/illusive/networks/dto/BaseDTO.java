package illusive.networks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Created by alon on 1/3/2020.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseDTO {

    protected UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}
