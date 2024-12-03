package priv.nanpu.dubboapi.api;

import priv.nanpu.dubboapi.domain.vo.UserInfoVO;

import java.util.List;

public interface UserApiService {
    UserInfoVO saveUser(UserInfoVO user);
    List<UserInfoVO> list();
}
