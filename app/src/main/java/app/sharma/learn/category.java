package app.sharma.learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;


import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        List<maincategories> maincats ;
        maincats=new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        maincats.add(new maincategories("fv"));
        maincats.add(new maincategories("kndjn"));
        maincats.add(new maincategories("ddsc"));
        maincats.add(new maincategories("dds"));
        maincats.add(new maincategories("dcdc"));
        maincats.add(new maincategories("dcs"));
        maincats.add(new maincategories("dsc"));
        maincats.add(new maincategories("dcdc"));
        maincats.add(new maincategories("dcd"));
        maincats.add(new maincategories("dcd"));
        maincats.add(new maincategories("cdc"));
        maincats.add(new maincategories("cdcd"));
        maincats.add(new maincategories("dc"));
        maincats.add(new maincategories("dc"));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getApplicationContext(),maincats);
        myrv.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        myrv.setAdapter(myAdapter);
    }
}