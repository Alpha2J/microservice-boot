package cn.alpha2j.mb_archetype_quickstart.dal.repository;

import cn.alpha2j.mb_archetype_quickstart.dal.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

//    Optional<UserEntity> getById(Long id);
}
