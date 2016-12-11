package cl.uv.ici.tallerdeandroid.hacehambre.model.user;

import android.app.Activity;

import java.io.Serializable;

/**
 * Created by Rodolfo on 08/12/2016.
 */
public interface IUser extends Serializable {
    String getName();
    String getEmail();
    String getPassword();

    boolean hasPermission(Activity activity);
    Class<?> getHomeActivityClass();
}
