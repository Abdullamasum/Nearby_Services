package fi.metropolia.ashifi.nearbyservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class AddServiceActivity extends AppCompatActivity {
       private String type;
       private RadioGroup radiogroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_services);

        radiogroup = findViewById(R.id.radioGroup);
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(radiogroup.getCheckedRadioButtonId()==R.id.rbRestaurant) {
                    type = "restaurants";
                }
               else if(radiogroup.getCheckedRadioButtonId()==R.id.rbGasStation) {
                    type = "gas";
                }
                else if(radiogroup.getCheckedRadioButtonId()==R.id.rbTransport) {
                    type = "transport";
                }
               else if(radiogroup.getCheckedRadioButtonId()==R.id.rbSupermarkets) {
                    type = "supermarkets";
                }
               else if(radiogroup.getCheckedRadioButtonId()==R.id.rbHealthcare) {
                    type = "healthcare";
                }

            }
        });

    }
       // Log.d(MainActivity.TAG, "btAddServiceline19:"+type);


    public void btAddService(View view)
    {
        TextView tvName = findViewById(R.id.addName); tvName = findViewById(R.id.addName);
        String name = tvName.getText().toString();
        TextView tvAddress = findViewById(R.id.addAddress);
        String address = tvAddress.getText().toString();
        TextView tvOpeningHours = findViewById(R.id.addOpeningHours);
        String openingHours = tvOpeningHours.getText().toString();
        TextView tvPhone = findViewById(R.id.addPhone);
        String phone = tvPhone.getText().toString();
        Service service = new Service(name, address, phone, openingHours);
        AllServiceList.getInstance().addService(type, service);
        Log.d(MainActivity.TAG, "btAddService:"+type);
       // AllServiceList.getInstance().toSharedPref();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
