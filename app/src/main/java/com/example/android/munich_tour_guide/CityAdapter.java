package com.example.android.munich_tour_guide;


import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAdapter extends ArrayAdapter<City> {

    private int iColorResourceId;

    public CityAdapter(Context context, ArrayList<City> munich, int colorResourceId) {
        super(context, 0, munich);
        iColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the {@link City} object located at this position in the list
        City currentCity = getItem(position);

        String name = currentCity.getDefaultName();
        String address = currentCity.getDefaultAddress();
        String info = currentCity.getDefaultInfo();
        int imageId = currentCity.getDefaultImage();
        String location = currentCity.getDefaultLocation();


        TextView defaultName = (TextView) listItemView.findViewById(R.id.list_text1);

        defaultName.setText(currentCity.getDefaultName());


        TextView defaultAddress = (TextView) listItemView.findViewById(R.id.list_text2);
        defaultAddress.setText(currentCity.getDefaultAddress());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.listImage1);

        // Check if an image is provided for this city or not
        if (currentCity.hasImage()) {
            imageView.setImageResource(currentCity.getDefaultImage());

            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.LinearText_Container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), iColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        final Intent intent = new Intent(getContext(), SpotInfoActivity.class);

        intent.putExtra(getContext().getString(R.string.spot_info_name), name);
        intent.putExtra(getContext().getString(R.string.spot_info_address), address);
        intent.putExtra(getContext().getString(R.string.spot_text_info), info);
        intent.putExtra(getContext().getString(R.string.spot_info_image), imageId);
        intent.putExtra(getContext().getString(R.string.spot_info_location), location);

        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }
}