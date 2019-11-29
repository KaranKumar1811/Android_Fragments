package com.example.android_fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();
        BlueFragment blueFragment = new BlueFragment();
        fragmentTransaction.add(R.id.fragmentcontainer, blueFragment, "blue");
        fragmentTransaction.commit();
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_blue)
        {
            FragmentManager manager=getSupportFragmentManager();
            BlueFragment blueFrag;

                FragmentTransaction fragmentTransaction = manager.beginTransaction();
                BlueFragment blueFragment = new BlueFragment();
                fragmentTransaction.add(R.id.fragmentcontainer, blueFragment, "blue");
            fragmentTransaction.commit();

        }

        else if (item.getItemId()==R.id.action_maths)
        {
            FragmentManager manager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = manager.beginTransaction();
            AdditionFragment additionFragment = new AdditionFragment();
            fragmentTransaction.replace(R.id.fragmentcontainer,additionFragment,"Addition");
            fragmentTransaction.commit();
        }
        return super.onOptionsItemSelected(item);
    }
}
