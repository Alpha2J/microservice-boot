package cn.alpha2j.mb_archetype_quickstart.rpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// todo: by archetype modify me
@EntityScan(basePackages = "cn.alpha2j.mb_archetype_quickstart.dal.entity")
@EnableJpaRepositories(basePackages = "cn.alpha2j.mb_archetype_quickstart.dal.repository")
@SpringBootApplication(scanBasePackages = "cn.alpha2j.mb_archetype_quickstart")
public class RPCApplication {

    public static void main(String[] args) {
        SpringApplication.run(RPCApplication.class, args);
    }

}
