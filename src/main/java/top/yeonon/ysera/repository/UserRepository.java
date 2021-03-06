package top.yeonon.ysera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.yeonon.ysera.entity.User;

/**
 * @author: yeonon
 * @date: 2019/12/23
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
