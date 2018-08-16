package id.co.inixindo.rz.androidixsbydashboard;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
//import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.co.inixindo.rz.androidixsbydashboard.PagerAdapter;

public class SquadFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.squad_layout, container, false);

        /*Toolbar toolbar = (Toolbar)view.findViewById(R.id.toolbar1);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);*/

        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.tab_layout1);
        tabLayout.addTab(tabLayout.newTab().setText("Bar V"));
        tabLayout.addTab(tabLayout.newTab().setText("Bar H"));
        tabLayout.addTab(tabLayout.newTab().setText("Line"));
        tabLayout.addTab(tabLayout.newTab().setText("Pie"));
        tabLayout.addTab(tabLayout.newTab().setText("Combined"));
        tabLayout.addTab(tabLayout.newTab().setText("Bubble"));
        tabLayout.addTab(tabLayout.newTab().setText("Radar"));
        tabLayout.addTab(tabLayout.newTab().setText("Scatter"));
        tabLayout.addTab(tabLayout.newTab().setText("Candle"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager)view.findViewById(R.id.pager1);
        //final PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(),
          //      tabLayout.getTabCount());
        final PagerAdapter adapter = new PagerAdapter(
                getChildFragmentManager(), tabLayout.getTabCount()
        );
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }
}
