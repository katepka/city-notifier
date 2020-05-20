package org.katepka.citynotifier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Opens menu activity
     * @param view
     */
    public void onClickOpenMenu(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    /**
     * Starts AddAdressActivity
     * @param view
     */
    public void onClickCreateMessage(View view) {
        Intent intent = new Intent(this, AddAddressActivity.class);
        startActivity(intent);
    }

    public void onClickCreateIdea(View view) {
    }
}
