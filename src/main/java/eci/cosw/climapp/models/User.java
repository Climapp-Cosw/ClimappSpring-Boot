package eci.cosw.climapp.models;

/**
 * Created by laura on 11/02/2018.
 */
public class User {

    private long id;
    private String name;
    private String email;
    private String password;
    private String confirmPassword;
    private String image;
    

    public User() {
    }

    /**
     * 
     * @param email
     * @param password
     * @param name
     * @param image
     * @param confirmPassword 
     */
    public User( String email, String password, String name, String image, String confirmPassword ) {
        this.email = email;
        this.password = password;
        this.image = image;
        this.name = name;
        this.confirmPassword = confirmPassword;
    }


    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
    
    @Override
    public String toString() {
        return "User{" + "id=" + getId() + ", email='" + getEmail() + '\'' + ", password='" + getPassword() + '\'' + ", firstname='"
                + name + '\'' + '}';
    }

    /**
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
