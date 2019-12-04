package fi.metropolia.ashifi.nearbyservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_service);
        final String currentService = getIntent().getExtras().getString(MainActivity.SERVICE);
        ListView serviceList = findViewById(R.id.listViewServices);
        serviceList.setAdapter(new ArrayAdapter<Service>(
                this,  //context (activity instance)
                android.R.layout.simple_expandable_list_item_1,
                getList(currentService, this))
        );

        serviceList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(MainActivity.TAG, "onItemClick(" + i + ")");
                Intent nextActivity = new Intent(ServiceActivity.this, ServiceDetailActivity.class);
                nextActivity.putExtra(MainActivity.ITEM, i);
                nextActivity.putExtra(MainActivity.SERVICE, currentService);
                startActivity(nextActivity);
            }
        });
    }

    public static List<Service> getList(String service, Context c) {
        if(service.equals( c.getString(R.string.gas))) {
            return AllServiceList.getInstance().getGasStations();
        }
        else if(service.equals( c.getString(R.string.restaurant))) {
            return AllServiceList.getInstance().getRestaurants();
        }
        else if(service.equals(c.getString(R.string.supermarket)) ){
            return AllServiceList.getInstance().getSuperMarkets();
        }
        else if(service.equals(c.getString(R.string.health)) ){
            return AllServiceList.getInstance().getHealthcares();
        }
        else if(service.equals(c.getString(R.string.transport)) ){
            return AllServiceList.getInstance().getPublicTransports();
        }

        return null;
    }
    public void btAdd(View v) {
        Intent intent = new Intent(this, AddServiceActivity.class);
        startActivity(intent);
    }
}
