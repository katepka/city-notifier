package org.katepka.citynotifier.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.katepka.citynotifier.R;

public class AddAddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_address);
    }

    public void onClickBackToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickAddMessageDetails(View view) {
        Intent intent = new Intent(this, AddMessageDetailsActivity.class);
        startActivity(intent);
    }
}
