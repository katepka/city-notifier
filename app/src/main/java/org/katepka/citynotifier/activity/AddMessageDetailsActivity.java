package org.katepka.citynotifier.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.katepka.citynotifier.R;

public class AddMessageDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_message_details);
    }

    public void onClickBackToAddress(View view) {
        Intent intent = new Intent(this, AddAddressActivity.class);
        startActivity(intent);
    }

    public void onClickSendMessage(View view) {
        // TODO: Sending message to storage
    }


    public void onClickChooseCategory(View view) {
        Intent intent = new Intent(this, CategoryListActivity.class);
        startActivity(intent);
    }
}
