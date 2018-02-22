package eci.cosw.climapp.services;

import eci.cosw.climapp.models.User;
import eci.cosw.climapp.models.Zone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laura on 11/02/2018.
 */
@Service
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();


    @Autowired
    public UserServiceImpl() {
        users.add(new User(new Long(1),"prueba@mail.com","password","name","http://www.your3dsource.com/images/facepic2.jpeg"
                ,"password"));
    }

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public User getUser(Long id) {
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getId()==id){
                return users.get(i);
            }
        }
        return null;
    }
    @Override
    public User updateUser(User user,String email){
        User u=this.findUserByEmail(email);
        u.setImage(user.getImage());
        u.setPassword(user.getPassword());
        u.setEmail(user.getEmail());
        u.setName(user.getName());
        u.setConfirmPassword(user.getConfirmPassword());
        return u;
    }

    @Override
    public User createUser(User user) {
        users.add(user);
        user.setId(new Long(users.size()));
        return user;
    }

    @Override
    public User findUserByEmail(String email) {
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getEmail().trim().equalsIgnoreCase(email)){
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public User findUserByEmailAndPassword(String email, String password) {
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getEmail().trim().equalsIgnoreCase(email) && users.get(i).getPassword().trim().equalsIgnoreCase(password)){
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public User addZone(Zone zone, String email) throws ServicesException{
         User u = this.findUserByEmail(email);
         List<Zone> zon = u.getZones();
         for(int i=0; i<zon.size(); i++){
             if(zon.get(i).getId()==zone.getId()){
                 throw new ServicesException("You're already subscribed to the "+zone.getName()+" zone");
             }
         }
         zon.add(zone);
         u.setZones(zon);
         return u;
    }

    @Override
    public User deleteZone(Zone zone,  String email) {
        User u = this.findUserByEmail(email);
        u.deleteZone(zone);
        return u;
    }
}