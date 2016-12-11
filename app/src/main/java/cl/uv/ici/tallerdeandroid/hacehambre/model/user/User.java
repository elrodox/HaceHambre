package cl.uv.ici.tallerdeandroid.hacehambre.model.user;

/**
 * Created by Rodolfo on 08/12/2016.
 */
abstract class User implements IUser{
    private String name;
    private String email;
    private String password;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }


}
