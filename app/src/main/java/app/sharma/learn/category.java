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
        maincats.add(new maincategories("Introduction"));
        maincats.add(new maincategories("Syntax"));
        maincats.add(new maincategories("Variables"));
        maincats.add(new maincategories("Data Types"));
        maincats.add(new maincategories("Input/ Output"));
        maincats.add(new maincategories("Strings"));
        maincats.add(new maincategories("Maths"));
        maincats.add(new maincategories("Booleans"));
        maincats.add(new maincategories("Conditions"));
        maincats.add(new maincategories("Switch"));
        maincats.add(new maincategories("While"));
        maincats.add(new maincategories("For"));
        maincats.add(new maincategories("Do-While"));
        maincats.add(new maincategories("Break/ Continue"));
        maincats.add(new maincategories("Arrays"));
        maincats.add(new maincategories("References"));
        maincats.add(new maincategories("Pointers"));
        maincats.add(new maincategories("Functions"));
        maincats.add(new maincategories("Structure"));
        maincats.add(new maincategories("Classes"));
        maincats.add(new maincategories("Constructor"));
        maincats.add(new maincategories("Encapsulation"));
        maincats.add(new maincategories("Inheritance"));
        maincats.add(new maincategories("Polymorphism"));
        maincats.add(new maincategories("Files"));
        maincats.add(new maincategories("Exceptions"));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getApplicationContext(),maincats);
        myrv.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        myrv.setAdapter(myAdapter);
    }
}