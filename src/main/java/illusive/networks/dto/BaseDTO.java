package illusive.networks.dto;

import java.util.Objects;
import java.util.UUID;

/**
 * Created by alon on 1/3/2020.
 */
public abstract class BaseDTO {

    protected UUID id;

    public BaseDTO(UUID id) {
        this.id = id;
    }

    public BaseDTO() {

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDTO baseDTO = (BaseDTO) o;
        return Objects.equals(id, baseDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
