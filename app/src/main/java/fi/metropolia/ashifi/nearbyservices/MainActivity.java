package fi.metropolia.ashifi.nearbyservices;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static String KEYMESSAGE="";
    public static final String TAG = "NearbyService";
    public static final String SERVICE = "Service";
    public static final String ITEM = "item";
    private SharedPreferences myPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myPrefs = getSharedPreferences("AllServvices", Activity.MODE_PRIVATE);

    }

    public void btClick(View v) {
        Intent intent = new Intent(this, ServiceActivity.class);
        intent.putExtra(SERVICE, ((Button)v).getText());
        startActivity(intent);
    }
    public void btAdd(View v) {
        Log.d(MainActivity.TAG, "btAddS:");
        Intent newIntent = new Intent(this, AddServiceActivity.class);

        startActivity(newIntent);
    }
    protected void onStart(){
        super.onStart();
        Log.d("lifecycle", "onStart");
       // toJsonGas;

    }
    protected void onStop(){
        super.onStop();
        Log.d("lifecycle", "onStart");
        SharedPreferences.Editor myPrefEditor = myPrefs.edit();
        myPrefEditor.putString("gas", AllServiceList.getInstance().toJsonGas());
        myPrefEditor.putString("transport", AllServiceList.getInstance().toJsonTransport());
        myPrefEditor.putString("restaurants", AllServiceList.getInstance().toJsonRestaurant());
        myPrefEditor.putString("healthcare", AllServiceList.getInstance().toJsonHealthcare());
        myPrefEditor.putString("supermarkets", AllServiceList.getInstance().toJsonSupermarket());

        myPrefEditor.commit();
        // toJsonGas;

    }


    }


