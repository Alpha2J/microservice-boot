package cn.alpha2j.mb_archetype_quickstart.api.site;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PingController {
    @GetMapping("ping")
    public String ping() {
        return "pong";
    }
}
