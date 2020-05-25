package org.katepka.citynotifier.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.katepka.citynotifier.R;

public class CategoryListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
    }

    public void onClickBackToMessageDetails(View view) {
        Intent intent = new Intent(this, AddMessageDetailsActivity.class);
        startActivity(intent);
    }
}
