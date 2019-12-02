package fi.metropolia.ashifi.nearbyservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AllServiceActivity extends AppCompatActivity {
    ListView restaurantList;
    private static final String TAG = "MainActivity";
    public static final String EXTRA = "service_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_service);
        restaurantList = findViewById(R.id.listViewRestaurants);
        restaurantList.setAdapter(new ArrayAdapter<Restaurant>(
                this,  //context (activity instance)
                android.R.layout.simple_expandable_list_item_1,
                AllServiceList.getInstance().getRestaurants())
        );
        restaurantList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(AllServiceActivity.this, DetailedActivity.class);
                nextActivity.putExtra(EXTRA, i);
                startActivity(nextActivity);
            }
        });
    }
}
