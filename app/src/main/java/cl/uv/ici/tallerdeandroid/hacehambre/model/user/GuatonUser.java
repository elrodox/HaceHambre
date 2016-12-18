package cl.uv.ici.tallerdeandroid.hacehambre.model.user;

import android.app.Activity;

import cl.uv.ici.tallerdeandroid.hacehambre.activities.GuatonHome;

/**
 * Created by Rodolfo on 08/12/2016.
 */
class GuatonUser extends User{
    public GuatonUser(String email, String password) {
        super(email, password);
    }

    @Override
    public boolean hasPermission(Activity activity) {
        return false;
    }

    @Override
    public Class<?> getHomeActivityClass() {
        return GuatonHome.class;
    }
}
