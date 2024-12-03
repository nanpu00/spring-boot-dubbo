package priv.nanpu.dubboprovide.constant;

import priv.nanpu.dubboapi.domain.vo.UserInfoVO;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    public static List<UserInfoVO> userMockList = new ArrayList<>();

    static {
        UserInfoVO u1 = new UserInfoVO("tom", "123456", 1);
        UserInfoVO u2 = new UserInfoVO("jack", "111111", 2);
        userMockList.add(u1);
        userMockList.add(u2);
    }
}
