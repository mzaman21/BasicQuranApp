package com.example.basicquranicapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements TabLayoutMediator.TabConfigurationStrategy {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;
    ArrayList<String> titles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpager);

        titles = new ArrayList<String>();
        titles.add("Parah");
        titles.add("Surah");
        setViewPagerAdapter();
        new TabLayoutMediator(tabLayout, viewPager,this).attach();
        //VPAdapter vpAdapter= new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        //vpAdapter.addFragmnet(new Para(),"Para");
        //vpAdapter.addFragmnet(new Surah(),"Surah");

    }
    public void setViewPagerAdapter() {
        VPAdapter vpAdapter = new
                VPAdapter(this);
        ArrayList<Fragment> fragmentlist= new ArrayList<>();
        fragmentlist.add(new Para());
        fragmentlist.add(new Surah());

        vpAdapter.setData(fragmentlist);
        viewPager.setAdapter(vpAdapter);

    }
    @Override
    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
        tab.setText(titles.get(position));
    }
}