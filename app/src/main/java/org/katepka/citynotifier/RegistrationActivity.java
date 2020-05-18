package org.katepka.citynotifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    /**
     * on click button back to Authorization
     * @param view
     */
    public void onClickBackToAuth(View view) {
        Intent intent = new Intent(this, AuthorizationActivity.class);
        startActivity(intent);
    }
}
