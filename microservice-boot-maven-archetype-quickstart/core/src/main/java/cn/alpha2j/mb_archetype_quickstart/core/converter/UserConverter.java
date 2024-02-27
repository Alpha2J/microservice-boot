package cn.alpha2j.mb_archetype_quickstart.core.converter;

import cn.alpha2j.mb_archetype_quickstart.dal.entity.UserEntity;
import cn.alpha2j.mb_archetype_quickstart.domain.vo.UserVO;

public class UserConverter {
    public static UserVO entityToVO(UserEntity userEntity) {
        return UserVO.builder()
                .id(userEntity.getId())
                .avatar(userEntity.getAvatar())
                .gender(userEntity.getGender())
                .nickname(userEntity.getNickname())
                .region(userEntity.getRegion())
                .openId(userEntity.getOpenId())
                .createdAt(userEntity.getCreatedAt())
                .updatedAt(userEntity.getUpdatedAt())
                .build();
    }
}
