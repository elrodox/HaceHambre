package cl.uv.ici.tallerdeandroid.hacehambre.model.user;

import android.app.Activity;

//import cl.uv.ici.tallerdeandroid.hacehambre.activities.AdminHome;
import cl.uv.ici.tallerdeandroid.hacehambre.activities.ClientHome;

/**
 * Created by Rodolfo on 08/12/2016.
 */
class ClientUser extends User {

    public ClientUser(String email, String password) {
        super(email, password);
    }

    @Override
    public boolean hasPermission(Activity activity) {
        return false;
    }

    @Override
    public Class<?> getHomeActivityClass() {
        return ClientHome.class;
    }
}
