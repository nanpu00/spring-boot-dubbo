package priv.nanpu.dubboconsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import priv.nanpu.dubboapi.api.UserApiService;
import priv.nanpu.dubboapi.domain.vo.UserInfoVO;

import java.util.List;

@RestController
public class UserController {
    @DubboReference
    private UserApiService service;

    @GetMapping("/user")
    private List<UserInfoVO> list() {
        return service.list();
    }

    @PostMapping("/user")
    private UserInfoVO save(@RequestBody UserInfoVO user) {
        return service.saveUser(user);
    }
}
