package cn.alpha2j.mb_archetype_quickstart.provider;

import cn.alpha2j.mb_archetype_quickstart.domain.vo.UserVO;

public interface UserService {
    UserVO getById(Long userId);
}
