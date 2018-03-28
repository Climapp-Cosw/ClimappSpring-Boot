
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
    
    @Query(value ="select * from Users u where u.id = ?1", nativeQuery = true)
    User findUserById(int id);
    
    @Modifying
    @Query(value = "update Users u set u.name = ?1, u.email = ?2, u.password = ?3, u.image = ?4  where u.id = ?5", nativeQuery = true )
    User updateUser(String name, String email, String password, String image, int id);
	


}

