package eci.cosw.climapp.restController;

import eci.cosw.climapp.models.User;
import eci.cosw.climapp.services.UserService;
import eci.cosw.climapp.services.UsersException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import javax.servlet.ServletException;
import java.util.Date;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by laura on 11/02/2018.
 */
@RestController
@RequestMapping( "users" )
public class UserController  {

    @Autowired
    private UserService userService;
    @RequestMapping( value = "/login", method = RequestMethod.POST )
    public Token login( @RequestBody User login ) throws ServletException {

        String jwtToken = "";

        if ( login.getEmail() == null || login.getPassword() == null ){
            throw new ServletException( "Please fill in email and password" );
        }

        String username = login.getEmail();
        String password = login.getPassword();

        User user = userService.findUserByEmailAndPassword(username, password);

        if ( user == null ){
            throw new ServletException( "User email not found." );
        }

        String pwd = user.getPassword();

        if ( !password.equals( pwd ) ){
            throw new ServletException( "Invalid login. Please check your name and password." );
        }

        jwtToken = Jwts.builder().setSubject( username ).claim( "roles", "user" ).setIssuedAt( new Date() ).signWith(SignatureAlgorithm.HS256, "secretkey" ).compact();

        return new Token( jwtToken );
    }

    
    @RequestMapping( value = "/{email}", method = RequestMethod.GET )
    public User getUsersByEmail(@PathVariable("email") String email){
        System.out.println("Correo: "+email);
        return userService.findUserByEmail(email);
    }
    
    @RequestMapping( value = "/", method = RequestMethod.POST )
    public User setUsers(@RequestBody User user) throws UsersException{
        if(user.getName()==null || user.getName().trim().isEmpty()){
            throw new UsersException("Please fill in name");
        }
        else if(user.getEmail()==null || user.getEmail().trim().isEmpty()){
            throw new UsersException("Please fill in email");
        }
        else if(user.getPassword()==null || user.getPassword().trim().isEmpty()){
            throw new UsersException("Please fill in password");
        }
        else if(user.getConfirmPassword()==null || user.getConfirmPassword().trim().isEmpty()){
            throw new UsersException("Please fill in Confirm password");
        }
        else if(!user.getConfirmPassword().equals(user.getPassword())){
            throw new UsersException("Check your password and your confirm password. They are different");
        }
        else{
            return userService.createUser(user);
        }
    }

    public class Token{
        String access_token;

        public Token( String access_token ){
            this.access_token = access_token;
        }

        public String getAccessToken(){
            return access_token;
        }

        public void setAccessToken( String access_token ){
            this.access_token = access_token;
        }
    }



}
