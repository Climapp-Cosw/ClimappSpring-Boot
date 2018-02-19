package eci.cosw.climapp.services;

import eci.cosw.climapp.models.User;

import java.util.List;

/**
 * Created by laura on 11/02/2018.
 */
public interface UserService {

    public List<User> getUsers();

    public User getUser( Long id );

    public User updateUser( User user,String email );

    public User createUser( User user );

    public User findUserByEmail( String email );

    public User findUserByEmailAndPassword( String email, String password );
}
