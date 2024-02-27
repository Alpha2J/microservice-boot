package cn.alpha2j.mb_archetype_quickstart.api.site;

import cn.alpha2j.mb_archetype_quickstart.domain.vo.UserVO;
import cn.alpha2j.mb_archetype_quickstart.provider.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String world(@RequestParam("userId") Long userId) {
        UserVO userVO = userService.getById(userId);
        return userVO.getNickname();
    }
}
