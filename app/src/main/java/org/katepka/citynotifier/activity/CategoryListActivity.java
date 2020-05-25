package org.katepka.citynotifier.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.katepka.citynotifier.R;

public class CategoryListActivity extends AppCompatActivity {

    private ListView listViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);

        listViewCategory = findViewById(R.id.listViewCategory);
        int items = listViewCategory.getCount();

        listViewCategory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(), AddMessageDetailsActivity.class);
                intent.putExtra("category", listViewCategory.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });
    }

    public void onClickBackToMessageDetails(View view) {
        Intent intent = new Intent(this, AddMessageDetailsActivity.class);
        startActivity(intent);
    }
}
