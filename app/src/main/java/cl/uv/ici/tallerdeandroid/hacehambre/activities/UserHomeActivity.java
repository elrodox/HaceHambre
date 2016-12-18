package cl.uv.ici.tallerdeandroid.hacehambre.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import cl.uv.ici.tallerdeandroid.hacehambre.R;

public class UserHomeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        ((Button)findViewById(R.id.userButtonComprarCombos)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.userButtonComprarCombos:
                Log.i("Button","ComprarCombos");
                Intent homeIntent = new Intent(UserHomeActivity.this, PurchaseFoodActivity.class);
                startActivity(homeIntent);
                break;
        }
    }
}
