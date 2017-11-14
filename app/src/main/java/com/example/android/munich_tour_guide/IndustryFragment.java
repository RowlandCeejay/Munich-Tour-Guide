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
public class IndustryFragment extends Fragment {

    public IndustryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.city_list, container, false);


        // Create a list of industries in Munich, Germany.
        final ArrayList<City> munich = new ArrayList<>();

        munich.add(new City(getString(R.string.ind_google_name), getString(R.string.ind_google_add), R.drawable.industry_google,
                getString(R.string.ind_google_info), getString(R.string.ind_google_location)));

        munich.add(new City(getString(R.string.ind_bmw_group_name), getString(R.string.ind_bmw_group_add), R.drawable.industry_bmw_group,
                getString(R.string.ind_bmw_group_info), getString(R.string.ind_bmw_group_location)));

        munich.add(new City(getString(R.string.ind_airBus_name), getString(R.string.ind_airBus_add), R.drawable.industry_airbus,
                getString(R.string.ind_airBus_info), getString(R.string.ind_airBus_location)));

        munich.add(new City(getString(R.string.ind_mtu_name), getString(R.string.ind_mtu_add), R.drawable.industry_mtu,
                getString(R.string.ind_mtu_info), getString(R.string.ind_mtu_location)));

        munich.add(new City(getString(R.string.ind_allianz_name), getString(R.string.ind_allianz_add), R.drawable.industry_allianz,
                getString(R.string.ind_allianz_info), getString(R.string.ind_allianz_location)));

        munich.add(new City(getString(R.string.ind_amgen_name), getString(R.string.ind_amgen_add), R.drawable.industry_amgen,
                getString(R.string.ind_amgen_info), getString(R.string.ind_amgen_location)));

        munich.add(new City(getString(R.string.ind_audi_name), getString(R.string.ind_audi_add), R.drawable.industry_audi,
                getString(R.string.ind_audi_info), getString(R.string.ind_audi_location)));

        munich.add(new City(getString(R.string.ind_microsoft_name), getString(R.string.ind_microsoft_add), R.drawable.industry_microsoft,
                getString(R.string.ind_microsoft_info), getString(R.string.ind_microsoft_location)));

        munich.add(new City(getString(R.string.ind_ibm_name), getString(R.string.ind_ibm_add), R.drawable.industry_ibm,
                getString(R.string.ind_ibm_info), getString(R.string.ind_ibm_location)));

        munich.add(new City(getString(R.string.ind_avnet_name), getString(R.string.ind_avnet_add), R.drawable.industry_avnet,
                getString(R.string.ind_avnet_info), getString(R.string.ind_avnet_location)));

        munich.add(new City(getString(R.string.ind_gsk_name), getString(R.string.ind_gsk_add), R.drawable.industry_glaxo,
                getString(R.string.ind_gsk_info), getString(R.string.ind_gsk_location)));

        munich.add(new City(getString(R.string.ind_advantech_name), getString(R.string.ind_advantech_add), R.drawable.industry_advantech,
                getString(R.string.ind_advantech_info), getString(R.string.ind_advantech_location)));

        // Create an {@link CityAdapter}, whose data source is a list of {@link munich}. The
        // adapter knows how to create list items for each item in the list.
        CityAdapter adapter = new CityAdapter(getActivity(), munich, R.color.bavarian_color);

        ListView listView = (ListView) rootView.findViewById(R.id.listV);
        listView.setAdapter(adapter);
        return rootView;
    }

}
