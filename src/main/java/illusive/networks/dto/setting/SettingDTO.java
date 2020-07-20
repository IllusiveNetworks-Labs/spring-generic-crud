package illusive.networks.dto.setting;

import illusive.networks.dto.BaseDTO;

import java.util.Objects;
import java.util.UUID;

/**
 * Created by alon on 1/2/2020.
 */
public class SettingDTO extends BaseDTO {

    private String member;

    public SettingDTO(UUID id, String member) {
        super(id);
        this.member = member;
    }

    public SettingDTO() {
        super();
    }

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SettingDTO that = (SettingDTO) o;
        return Objects.equals(member, that.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), member);
    }
}
