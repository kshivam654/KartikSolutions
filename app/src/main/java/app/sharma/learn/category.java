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
        maincats.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Syntax", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Variables", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Data Types", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Input/ Output", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Strings", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Maths", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Booleans", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Conditions", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Switch", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("While", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("For", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Do-While", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Break/ Continue", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Arrays", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("References", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Pointers", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Functions", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Structure", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Classes", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Constructor", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Encapsulation", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Inheritance", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Polymorphism", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Files", "IHNzOHi8sJs", "this is a Demo Context"));
        maincats.add(new maincategories("Exceptions", "IHNzOHi8sJs", "this is a Demo Context"));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getApplicationContext(),maincats);
        myrv.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        myrv.setAdapter(myAdapter);
    }
}