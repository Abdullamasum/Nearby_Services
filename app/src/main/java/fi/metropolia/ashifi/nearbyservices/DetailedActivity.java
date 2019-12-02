package fi.metropolia.ashifi.nearbyservices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        Bundle b = getIntent().getExtras();
        int i = b.getInt(AllServiceActivity.EXTRA, 0);

        Restaurant restaurant = AllServiceList.getInstance().getRestaurants().get(i);

        TextView tvName = findViewById((R.id.name));
        TextView tvStart = findViewById((R.id.address));
        TextView tvEnd = findViewById((R.id.phone));
        TextView tvType = findViewById((R.id.openingHours));

        tvName.setText(restaurant.getRestaurantName());
        tvStart.setText(restaurant.getRestaurantAddress());
        tvEnd.setText(restaurant.getRestaurantPhone());
        tvType.setText(restaurant.getRestaurantOpeningHours());
    }
}
