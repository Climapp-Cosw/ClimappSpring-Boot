package eci.cosw.climapp.services;

import eci.cosw.climapp.models.User;

import java.util.List;

/**
 * Created by laura on 11/02/2018.
 */
public interface UserService {
    /**
     * @return
     */
    public List<User> getUsers();

    /**
     * @param id
     * @return
     */
    public User getUser( Long id );


    /**
     * @param user
     * @param email
     * @return
     */
    public User updateUser(User user, String email ) throws ServicesException;

    /**
     * @param user
     * @return
     */
    public User createUser( User user );

    /**
     * @param email
     * @return
     */
    public User findUserByEmail( String email );

    /**
     * @param email
     * @param password
     * @return
     */
    public User findUserByEmailAndPassword( String email, String password );

}
