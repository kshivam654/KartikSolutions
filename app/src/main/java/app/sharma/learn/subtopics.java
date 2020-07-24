package app.sharma.learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class subtopics extends AppCompatActivity {
    private List<maincategories>yay;
    private int position;
    private List<maincategories>yay2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        List<maincategories> maincats ;
        Bundle extras = getIntent().getExtras();
       position= extras.getInt("position");
        maincats=new ArrayList<>();
        yay=new ArrayList<>();
        yay2=new ArrayList<>();
        maincats.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Syntax", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Variables", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Data Types", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Input/ Output", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Strings", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Maths", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Booleans", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Conditions", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Switch", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("While", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("For", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Do-While", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Break/ Continue", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Arrays", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("References", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Pointers", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Functions", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Structure", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Classes", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Constructor", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Encapsulation", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Inheritance", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Polymorphism", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Files", "IHNzOHi8sJs", "this is a Demo Context",yay));
        maincats.add(new maincategories("Exceptions", "IHNzOHi8sJs", "this is a Demo Context",yay));

        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));
        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));
        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));
        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));
        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));
        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));
        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));
        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));
        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));
        yay.add(new maincategories("Introduction", "IHNzOHi8sJs", "this is a Demo Context",yay2));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(getApplicationContext(),maincats.get(position).getSubtopic());

        myrv.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        myrv.setAdapter(myAdapter);
    }
}