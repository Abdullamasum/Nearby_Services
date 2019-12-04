package fi.metropolia.ashifi.nearbyservices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class ServiceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
       Bundle b = getIntent().getExtras();
        int i = b.getInt(MainActivity.ITEM, 0);
        List<Service> list = ServiceActivity.getList(b.getString(MainActivity.SERVICE, ""), this);
        Service service = list.get(i);

        TextView tvName = findViewById((R.id.txtServDetailName));
        TextView tvStart = findViewById((R.id.txtServDetailAddressEmpty));
        TextView tvEnd = findViewById((R.id.txtServDetailPhoneEmpty));
        TextView tvType = findViewById((R.id.txtServDetailOpTimeEmpty));

        tvName.setText(service.getName());
        tvStart.setText(service.getAddress());
        tvEnd.setText(service.getPhone());
        tvType.setText(service.getOpeningHours());


    }
}
