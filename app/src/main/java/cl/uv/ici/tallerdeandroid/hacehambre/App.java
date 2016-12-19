package cl.uv.ici.tallerdeandroid.hacehambre;

import android.app.Application;
import android.content.Context;


/**
 * Created by Rodolfo on 19/12/2016.
 */
public class App extends Application {


    private static Context context;

    public void onCreate() {
        super.onCreate();
        App.context = getApplicationContext();
    }

    public static Context getContext() {
        return App.context;
    }

}
