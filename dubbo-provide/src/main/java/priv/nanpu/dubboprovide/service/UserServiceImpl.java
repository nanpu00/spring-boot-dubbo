package priv.nanpu.dubboprovide.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import priv.nanpu.dubboapi.api.UserApiService;
import priv.nanpu.dubboapi.domain.vo.UserInfoVO;
import priv.nanpu.dubboprovide.constant.UserData;

import java.util.List;

@DubboService
@Slf4j
public class UserServiceImpl implements UserApiService {
    /**
     * @param user
     * @return
     */
    @Override
    public UserInfoVO saveUser(UserInfoVO user) {
        log.info("start save user,userInfo:{}",user.toString());
        user.setId(UserData.userMockList.size() + 1);
        UserData.userMockList.add(user);
        return user;

    }

    /**
     * @return
     */
    @Override
    public List<UserInfoVO> list() {
        log.info("search user list");
        return UserData.userMockList;
    }
}
