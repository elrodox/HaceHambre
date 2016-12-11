package cl.uv.ici.tallerdeandroid.hacehambre.model.user;

/**
 * Created by Rodolfo on 08/12/2016.
 */
public class UserFactory {
//    private static UserFactory ourInstance = new UserFactory();
//
//    public static UserFactory getInstance() {
//        return ourInstance;
//    }
//
//    private UserFactory() {
//    }

    public static IUser createUser(String email, String password, UserType userType){
        IUser user = null;
        switch (userType){
            case ADMIN:
                user = new AdminUser(email, password);
                break;
            case CLIENT:
                user = new ClientUser(email, password);
                break;
        }
        return user;
    }

}
