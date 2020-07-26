package app.sharma.learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class subtopics extends AppCompatActivity {

    private String title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        List<subcategories> sg = new ArrayList<>();

        if(getIntent() != null){
            title = getIntent().getStringExtra("Title");
        }


        List<subcategories> catigories ;
        catigories = new ArrayList<subcategories>();

        switch (title){
            case "Introduction":
                catigories.add(new subcategories("History of C++", "The C++ programming language has a history going back to 1979, when Bjarne Stroustrup was doing work for his Ph. D. thesis. One of the languages Stroustrup had the opportunity to work with was a language called Simula, which as the name implies is a language primarily designed for simulations.", "JBjjnqG0BP8"));
                catigories.add(new subcategories("What is a compiler?", "A C++ compiler is itself a computer program who's only job is to convert the C++ program from our form to a form the computer can read and execute.", "uoawB1jj138"));
                catigories.add(new subcategories("What are the types of errors in C++?", "There are five kinds of errors: syntax errors,semantic errors,type errors, runtime errors, and logic errors.", "iraHn7WNIYA"));
                catigories.add(new subcategories("What are header files in C++?", "The files that tell the compiler how to call some functionality (without knowing how the functionality actually works) are called header files. They contain the function prototypes. ", "jm10sr0-hLI"));
                break;
            case "Basics":
                catigories.add(new subcategories("What are keywords and variables?", "Keyword is a predefined or reserved word in C++ library with a fixed meaning and used to perform an internal operation. C++ Language supports more than 64 keywords.A variable is a name given to a memory location. It is the basic unit of storage in a program.", "a69eeIhYuIU"));
                catigories.add(new subcategories("How to declare and initialize a variable?", "When you declare a variable, you should also initialize it. Two types of variable initialization exist: explicit and implicit. Variables are explicitly initialized if they are assigned a value in the declaration statement. Implicit initialization occurs when variables are assigned a value during processing.", "EOp9vcEDsaM"));
                catigories.add(new subcategories("What are comments?", "Comments are portions of the code ignored by the compiler which allow the user to make simple notes in the relevant areas of the source code. Comments come either in block form or as single lines.", "dc5o-ckAsfs"));
                break;
            case "Flow Control":
                catigories.add(new subcategories("if else", "Use if to specify a block of code to be executed, if a specified condition is true. Use else to specify a block of code to be executed, if the same condition is false. ", "7GTNacOlopI"));
                catigories.add(new subcategories("for loop", " A for loop is a repetition control structure that allows you to efficiently write a loop that needs to execute a specific number of times.", "fZ9-fDS6yVk"));
                catigories.add(new subcategories("do..while loop", "The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.\n", "4RwrpzLMoRI"));
                catigories.add(new subcategories("while loop", "The while loop loops through a block of code as long as a specified condition is true  ", "BavvLk70_o4"));
                catigories.add(new subcategories("break and continue", "break statement is used to terminate the loop in which it is used.continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop. ", "Aiccxyu0P_A"));
                catigories.add(new subcategories("switch statement", "A switch statement allows a variable to be tested for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case. ", "_CelY_ZBXb4"));
                catigories.add(new subcategories("goto statement", "A goto statement provides an unconditional jump from the goto to a labeled statement in the same function. ", "IGtez3XZips"));
                break;
            case "Arrays":
                catigories.add(new subcategories("What is an array?", "C++ provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type.", "BfAa2koJv64"));
                catigories.add(new subcategories("How to declare an Array?", "There are various ways in which we can declare an array. It can be done by specifying its type and size, by initializing it or both.", "IxFChpxFztg"));
                catigories.add(new subcategories("What are the types of Array?", " In C++ programming language we do have mainly two types of variables: Single Dimensional Arrays and multidimensional Arrays. The single-dimensional stores the values hold the values in the form of the list while the multidimensional array store the value in the matrix.", "JJ2iSrwIkVs"));
                break;
            case "Functions":
                catigories.add(new subcategories("What is a function and it's declaration.", "A function is a group of statements that together perform a task. Every C++ program has at least one function, which is main(), and all the most trivial programs can define additional functions.", "3B51M78os_Y"));
                catigories.add(new subcategories("Types of Function", "There are two types of functions:built-in function and user-defined function.", "Gmxjxul27Q4"));
                catigories.add(new subcategories("What Function overloading?", "Function overloading is a C++ programming feature that allows us to have more than one function having same name but different parameter list.", "d7IohNyEMQ0"));
                catigories.add(new subcategories("How to pass the arguments into a function", "There are two ways to pass arguments into a function:pass by value and pass by reference.", "hNR6fsksEu8"));
                break;
            case "Pointers":
                catigories.add(new subcategories("What is a Pointer?", "The variable that stores the address of another variable  is what in C++ is called a pointer.", "fBlM7pR2r_Q"));
                catigories.add(new subcategories("Pointers and Arrays ", "The main difference being that pointers can be assigned new addresses, while arrays cannot. These two expressions are equivalent and valid, not only if a is a pointer, but also if a is an array.", "ASVB8KAFypk"));
                catigories.add(new subcategories("What is Null Pointer?", "A pointer that is assigned NULL is called a null pointer.", "i8ACHqdfcFA"));
                break;
            case "Object Oriented Concepts":
                catigories.add(new subcategories("What is a Constructor?", "A constructor is a special type of member function that initialises an object automatically when it is created. ", "a-jiPHY_gi4"));
                catigories.add(new subcategories("What is a Destructor?", "Destructors in C++ are members functions in a class that delete an object. They are called when the class object goes out of scope such as when the function ends, the program ends, a delete variable is called.", "hI-XxfpzVBM"));
                catigories.add(new subcategories("What is Inheritance?", " In C++, inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically.", "5pJyKzON8Ww"));
                catigories.add(new subcategories("What is Polymorphism?", "Polymorphism means \"many forms\", and it occurs when we have many classes that are related to each other by inheritance. ", "oHT0GiE8MkM"));
            case "Files and Exceptions":
                catigories.add(new subcategories("File Handling", "In C++, files are mainly dealt by using three classes fstream, ifstream, ofstream available in fstream headerfile.", "TF2-F2duY6c"));
                catigories.add(new subcategories("Text file and Binary file ", "A text file stores data in the form of alphabets, digits and other special symbols by storing their ASCII values and are in a human-readable format. binary file contains a sequence or a collection of bytes which are not in a human-readable format.", "u7piph2YXDc"));
                catigories.add(new subcategories("What are Exception Handling?", "A C++ exception is a response to an exceptional circumstance that arises while a program is running, such as an attempt to divide by zero. ... C++ exception handling is built upon three keywords: try, catch, and throw.k", "EyXXLpFriMc"));
                break;




        }


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        SubRecyclerViewAdapter myAdapter = new SubRecyclerViewAdapter(getApplicationContext(),catigories);
        myrv.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        myrv.setAdapter(myAdapter);

    }
}