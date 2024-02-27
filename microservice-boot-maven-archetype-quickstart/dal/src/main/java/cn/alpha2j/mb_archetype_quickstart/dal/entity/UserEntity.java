package cn.alpha2j.mb_archetype_quickstart.dal.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Author: Jeb.Wang
 * Time: 2022/12/21 22:57:43
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
// 更新或插入部分字段
@DynamicInsert
@DynamicUpdate
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "avatar")
    private String avatar;
    @Basic
    @Column(name = "gender")
    private byte gender;
    @Basic
    @Column(name = "nickname")
    private String nickname;
    @Basic
    @Column(name = "region")
    private String region;
    @Basic
    @Column(name = "open_id")
    private String openId;
    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && gender == that.gender && Objects.equals(avatar, that.avatar) && Objects.equals(nickname, that.nickname) && Objects.equals(region, that.region) && Objects.equals(openId, that.openId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, avatar, gender, nickname, region, openId, createdAt, updatedAt);
    }
}
