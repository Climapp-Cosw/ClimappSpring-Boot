package eci.cosw.climapp.services;

import eci.cosw.climapp.models.User;
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
    public User createUser(User user) {
        users.add(user);
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
}