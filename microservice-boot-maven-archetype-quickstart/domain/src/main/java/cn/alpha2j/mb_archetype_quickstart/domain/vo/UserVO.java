package cn.alpha2j.mb_archetype_quickstart.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
    private long id;
    private String avatar;
    private byte gender;
    private String nickname;
    private String region;
    private String openId;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}

