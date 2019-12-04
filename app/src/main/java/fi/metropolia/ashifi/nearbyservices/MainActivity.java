package fi.metropolia.ashifi.nearbyservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static String KEYMESSAGE="";
    public static final String TAG = "NearbyService";
    public static final String SERVICE = "Service";
    public static final String ITEM = "item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btClick(View v) {
        Intent intent = new Intent(this, ServiceActivity.class);
        intent.putExtra(SERVICE, ((Button)v).getText());
        startActivity(intent);
    }

   /* public void btRestaurant(View view){
        Intent intent = new Intent(this, RestaurantActivity.class);
        //add the given value to intent object with a key
        //there can be any amount of data of key -value part
        startActivity(intent);


    }
    public void btSupermarket(View view){
        Intent intent = new Intent(this, SupermarketActivity.class);
        //add the given value to intent object with a key
        //there can be any amount of data of key -value part
        startActivity(intent);


    }
    /*public void btGasStation(View view){
        Intent intent = new Intent(this, GasStationActivity.class);
        //add the given value to intent object with a key
        //there can be any amount of data of key -value part
        startActivity(intent);


    }
    public void btPublicTransport(View view){
        Intent intent = new Intent(this, PublicTransportActivity.class);
        //add the given value to intent object with a key
        //there can be any amount of data of key -value part
        startActivity(intent);
*/

    }


