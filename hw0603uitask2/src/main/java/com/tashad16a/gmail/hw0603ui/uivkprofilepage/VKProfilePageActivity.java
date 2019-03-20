package com.tashad16a.gmail.hw0603ui.uivkprofilepage;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import com.tashad16a.gmail.hw0603_ui.R;

public class VKProfilePageActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_vk_profile_page);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        collapsingToolbarLayout = findViewById(R.id.toolbar_collapsing);
        collapsingToolbarLayout.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.real_white));
        collapsingToolbarLayout.setContentScrimColor(ContextCompat.getColor(this, R.color.text_vk_active));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);

        return super.onCreateOptionsMenu(menu);
    }
}
