package sg.edu.rp.c346.id22012433.array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
TextView tv;
String[] fruits = new String[4];

ArrayList<String> thefruits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.array);


        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "durian";
        String fruit = "Fruits \n =====\n"+fruits[0]+"\n"+fruits[1]+"\n"+fruits[2]+"\n"+fruits[3];
        String thefruits = fruits.;

        tv.setText(fruit);
    }
}