package eci.cosw.climapp.services;

import eci.cosw.climapp.models.User;
import eci.cosw.climapp.models.Zone;
import eci.cosw.climapp.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 * Created by laura on 11/02/2018.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;


    @Override
    public List<User> getUsers() {
        return usersRepository.findAll();
    }

    @Override
    public User getUser(int id) {
        return usersRepository.getOne(id);
    }
    @Override
    public User updateUser(User user,User u){
       
        return usersRepository.updateUser(user.getName(), user.getEmail(), user.getPassword(), user.getImage(), u.getId());
    }

    @Override
    public User createUser(User user) {
        return usersRepository.save(user);
    }
    @Override
    public User findUserById(int id) {
        return getUser(id);
    }
    @Override
    public User findUserByEmail(String email) {
        return usersRepository.findUserByEmail(email);
    }

    @Override
    public User findUserByEmailAndPassword(String email, String password) {
        return usersRepository.findUserByEmailAndPassword(email, password);
    }

    @Override
    public User addZone(Zone zone, String email) throws ServicesException{
        return null;
    }

    @Override
    public User deleteZone(Zone zone,  String email) {
        return null;
    }
}