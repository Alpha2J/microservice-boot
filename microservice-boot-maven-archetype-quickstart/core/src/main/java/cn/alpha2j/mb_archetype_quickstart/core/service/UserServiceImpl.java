package cn.alpha2j.mb_archetype_quickstart.core.service;

import cn.alpha2j.mb_archetype_quickstart.core.converter.UserConverter;
import cn.alpha2j.mb_archetype_quickstart.dal.entity.UserEntity;
import cn.alpha2j.mb_archetype_quickstart.dal.repository.UserRepository;
import cn.alpha2j.mb_archetype_quickstart.domain.vo.UserVO;
import cn.alpha2j.mb_archetype_quickstart.provider.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl() {

    }

    @Override
    public UserVO getById(Long userId) {
        Optional<UserEntity> userEntityOptional = userRepository.findById(userId);
        if (!userEntityOptional.isPresent()) {
            throw new RuntimeException("not found");
        }

        UserEntity user = userEntityOptional.get();
        return UserConverter.entityToVO(user);
    }
}

