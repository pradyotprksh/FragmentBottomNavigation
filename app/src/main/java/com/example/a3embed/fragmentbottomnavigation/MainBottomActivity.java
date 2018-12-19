package com.example.a3embed.fragmentbottomnavigation;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.a3embed.fragmentbottomnavigation.Fragment.HomeFragment;
import com.example.a3embed.fragmentbottomnavigation.Fragment.NotificationFragment;
import com.example.a3embed.fragmentbottomnavigation.Fragment.ProfileFragment;

public class MainBottomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bottom);

        BottomNavigationView mainBottom = findViewById(R.id.mainBottom);

        final HomeFragment homeFragment = new HomeFragment();
        final NotificationFragment notificationFragment = new NotificationFragment();
        final ProfileFragment profileFragment = new ProfileFragment();

        mainBottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.menu_item :
                        setupFragment(homeFragment);
                        return true;
                    case R.id.notification_item:
                        setupFragment(notificationFragment);
                        return true;
                    case R.id.profile_item:
                        setupFragment(profileFragment);
                        return true;
                    default:
                        return false;
                }

            }
        });

    }

    private void setupFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mainFrame, fragment);
        fragmentTransaction.commit();

    }
}
