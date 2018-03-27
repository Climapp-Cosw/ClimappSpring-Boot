package eci.cosw.climapp.repositories;

import eci.cosw.climapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Laura Ramos
 */
@Repository
public interface UsersRepository extends JpaRepository <User,Integer>{
    
    @Query(value ="select * from Users u where u.email = ?1", nativeQuery = true)
    User findUserByEmail(String email);
    
    @Query(value ="select * from Users u where u.email = ?1 and u.password = ?2", nativeQuery = true)
    User findUserByEmailAndPassword(String email, String password);
    
    @Modifying
    @Query(value = "update Users u set u.firstname = ?1 where u.lastname = ?2", nativeQuery = true )
    User updateUser(User user, User u);
}
