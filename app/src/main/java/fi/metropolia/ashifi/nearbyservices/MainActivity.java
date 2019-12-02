package fi.metropolia.ashifi.nearbyservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static String KEYMESSAGE="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btRestaurant(View view){
        Intent intent = new Intent(this, AllServiceActivity.class);
        //add the given value to intent object with a key
        //there can be any amount of data of key -value part
        startActivity(intent);


    }
}
