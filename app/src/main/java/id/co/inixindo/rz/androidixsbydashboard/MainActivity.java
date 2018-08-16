package id.co.inixindo.rz.androidixsbydashboard;

import android.content.res.TypedArray;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    RecyclerView recyclerView;
    String navTitles[];
    TypedArray navIcons;
    ActionBarDrawerToggle drawerToggle;
    RecyclerView.Adapter recyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setup untuk toolbar
        setupToolbar();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerMainActivity);

        // setting title dan icon dari navigration drawer
        navTitles = getResources().getStringArray(R.array.navDrawerItems);
        navIcons = getResources().obtainTypedArray(R.array.navDrawerIcons);

        // membuat adapter utk title dan icon
        recyclerViewAdapter = new RecyclerViewAdapter(navTitles, navIcons, this);
        recyclerView.setAdapter(recyclerViewAdapter);

        // membutuhkan Layout Manager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // memunculkan Toggle
        setupDrawerToggle();

        // setting tampilan pertama
        // menu yg muncul utk pertama kali
        Fragment connectFragment = new ConnectFragment();
        FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.containerView, connectFragment, null);
        fragmentTransaction.commit();
    }

    private void setupDrawerToggle() {
        drawerToggle = new ActionBarDrawerToggle(this,
                drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerToggle.syncState();
    }

    private void setupToolbar() {
        toolbar = (Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
