package com.example.android.munich_tour_guide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.city_list, container, false);

        // Create a list for city hotels
        final ArrayList<City> munich = new ArrayList<>();

        munich.add(new City(getString(R.string.hot_azimut_name), getString(R.string.hot_azimut_add), R.drawable.hotels_azimut,
                getString(R.string.hot_azimut_info), getString(R.string.hot_azimut_location)));

        munich.add(new City(getString(R.string.hot_bold_name), getString(R.string.hot_bold_add), R.drawable.hotels_bold,
                getString(R.string.hot_bold_info), getString(R.string.hot_bold_location)));

        munich.add(new City(getString(R.string.hot_cYard_name), getString(R.string.hot_cYard_add), R.drawable.hotels_courtyard,
                getString(R.string.hot_cYard_info), getString(R.string.hot_cYard_location)));

        munich.add(new City(getString(R.string.hot_hilton_name), getString(R.string.hot_hilton_add), R.drawable.hotels_hilton_munich,
                getString(R.string.hot_hilton_info), getString(R.string.hot_hilton_location)));

        munich.add(new City(getString(R.string.hot_meridien_name), getString(R.string.hot_meridien_add), R.drawable.hotels_le_meridien,
                getString(R.string.hot_meridien_info), getString(R.string.hot_meridien_location)));

        munich.add(new City(getString(R.string.hot_leonardo_name), getString(R.string.hot_leonardo_add), R.drawable.hotels_leonardo,
                getString(R.string.hot_leonardo_info), getString(R.string.hot_leonardo_location)));

        munich.add(new City(getString(R.string.hot_mercure_name), getString(R.string.hot_mercure_add), R.drawable.hotels_mercure,
                getString(R.string.hot_mercure_info), getString(R.string.hot_mercure_location)));

        munich.add(new City(getString(R.string.hot_palace_name), getString(R.string.hot_palace_add), R.drawable.hotels_meunchen_palace,
                getString(R.string.hot_palace_info), getString(R.string.hot_palace_location)));

        munich.add(new City(getString(R.string.hot_nh_name), getString(R.string.hot_nh_add), R.drawable.hotels_nh_hotel,
                getString(R.string.hot_nh_info), getString(R.string.hot_nh_location)));

        munich.add(new City(getString(R.string.hot_sheraton_name), getString(R.string.hot_sheraton_add), R.drawable.hotels_sheraton,
                getString(R.string.hot_sheraton_info), getString(R.string.hot_sheraton_location)));

        // Create an {@link CityAdapter}, whose data source is a list of {@link munich}. The
        // adapter knows how to create list items for each item in the list.
        CityAdapter adapter = new CityAdapter(getActivity(), munich, R.color.bavarian_color);

        ListView listView = (ListView) rootView.findViewById(R.id.listV);

        listView.setAdapter(adapter);
        return rootView;
    }

}
