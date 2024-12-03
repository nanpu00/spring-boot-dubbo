package priv.nanpu.dubboapi.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class UserInfoVO implements Serializable {

    private String username;
    private String password;
    private Integer id;
}
