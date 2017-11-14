package com.example.android.munich_tour_guide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SpotInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot_info);

        Bundle bundle = getIntent().getExtras();

        String spotName = bundle.getString(getString(R.string.spot_info_name));
        String spotAddress = bundle.getString(getString(R.string.spot_info_address));
        String spotInfo = bundle.getString(getString(R.string.spot_text_info));
        int spotImage = bundle.getInt(getString(R.string.spot_info_image));
        final String spotLocation = bundle.getString(getString(R.string.spot_info_location));

        SpotInfoActivity.this.setTitle(spotName);

        ImageView iImage = (ImageView) findViewById(R.id.spot_info_image);
        iImage.setImageResource(spotImage);

        TextView nameText = (TextView) findViewById(R.id.spot_info_text_name);
        nameText.setText(spotName);

        TextView addressText = (TextView) findViewById(R.id.spot_info_text_address);
        addressText.setText(spotAddress);

        TextView infoText = (TextView) findViewById(R.id.spot_info_text_information);
        infoText.setText(spotInfo);

        Button mapButton = (Button) findViewById(R.id.map_button);
        mapButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Uri geoLocation = Uri.parse("geo:" + spotLocation);
                Intent intentMap = new Intent(Intent.ACTION_VIEW, geoLocation);

                if (intentMap.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentMap);
                }

            }


        });

    }

}
