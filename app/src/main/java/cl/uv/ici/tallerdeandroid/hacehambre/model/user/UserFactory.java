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
    private static IUser currentUser = null;
    public static IUser createUser(String email, String password, UserType userType){
        switch (userType){
            case ADMIN:
                currentUser = new AdminUser(email, password);
                break;
            case CLIENT:
                currentUser = new ClientUser(email, password);
                break;
            case GUATON:
                currentUser = new GuatonUser(email, password);
                break;
        }
        return currentUser;
    }

    public static IUser getCurrentUser() {
        return currentUser;
    }
}
