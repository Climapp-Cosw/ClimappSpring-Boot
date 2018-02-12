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
        return null;
    }

    @Override
    public User getUser(Long id) {
        return null;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public User findUserByEmailAndPassword(String email, String password) {
        return null;
    }
}