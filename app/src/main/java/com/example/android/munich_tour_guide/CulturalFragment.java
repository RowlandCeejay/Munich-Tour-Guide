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
public class CulturalFragment extends Fragment {

    public CulturalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.city_list, container, false);

        final ArrayList<City> munich = new ArrayList<>();

        munich.add(new City(getString(R.string.cul_altes_rathaus_name), getString(R.string.cul_altes_rathaus_add), R.drawable.culture_altes_rathaus,
                getString(R.string.cul_altes_rathaus_info), getString(R.string.cul_altes_rathaus_location)));

        munich.add(new City(getString(R.string.cul_andechser_name), getString(R.string.cul_andechser_add), R.drawable.culture_andechser_am_dom,
                getString(R.string.cul_andechser_info), getString(R.string.cul_andechser_location)));

        munich.add(new City(getString(R.string.cul_bavarian_sausage_name), getString(R.string.cul_bavarian_sausage_add), R.drawable.culture_bavarian_sausage,
                getString(R.string.cul_bavarian_sausage_info), getString(R.string.cul_bavarian_sausage_location)));

        munich.add(new City(getString(R.string.cul_nationalmuseum_name), getString(R.string.cul_nationalmuseum_add), R.drawable.culture_bayerisches_nationalmuseum,
                getString(R.string.cul_nationalmuseum_info), getString(R.string.cul_nationalmuseum_location)));

        munich.add(new City(getString(R.string.cul_fruhlingsfest_name), getString(R.string.cul_fruhlingsfestl_add), R.drawable.culture_fruhlingsfest_munich,
                getString(R.string.cul_fruhlingsfest_info), getString(R.string.cul_fruhlingsfest_location)));

        munich.add(new City(getString(R.string.cul_beer_garden_name), getString(R.string.cul_beer_garden_add), R.drawable.culture_hofbrau_beer_garden,
                getString(R.string.cul_beer_garden_info), getString(R.string.cul_beer_garden_location)));

        munich.add(new City(getString(R.string.cul_kulturzentrum_name), getString(R.string.cul_kulturzentrum_add), R.drawable.culture_kulturzentrum,
                getString(R.string.cul_kulturzentrum_info), getString(R.string.cul_kulturzentrum_location)));

        munich.add(new City(getString(R.string.cul_maximilianeum_name), getString(R.string.cul_maximilianeum_add), R.drawable.culture_maximilianeum,
                getString(R.string.cul_maximilianeum_info), getString(R.string.cul_maximilianeum_location)));

        munich.add(new City(getString(R.string.cul_oktoberfest_name), getString(R.string.cul_oktoberfest_add), R.drawable.culture_oktoberfest,
                getString(R.string.cul_oktoberfest_info), getString(R.string.cul_oktoberfest_location)));

        munich.add(new City(getString(R.string.cul_rat_house_name), getString(R.string.cul_rat_house_add), R.drawable.culture_rat_house,
                getString(R.string.cul_rat_house_info), getString(R.string.cul_rat_house_location)));

        munich.add(new City(getString(R.string.cul_ratskeller_name), getString(R.string.cul_ratskeller_add), R.drawable.culture_ratskeller,
                getString(R.string.cul_ratskeller_info), getString(R.string.cul_ratskeller_location)));

        munich.add(new City(getString(R.string.cul_alten_markt_name), getString(R.string.cul_alten_markt_add), R.drawable.culture_zum_alten_markt,
                getString(R.string.cul_alten_markt_info), getString(R.string.cul_alten_markt_location)));

        munich.add(new City(getString(R.string.cul_zum_durnbrau_name), getString(R.string.cul_zum_durnbrau_add), R.drawable.culture_zum_durnbrau,
                getString(R.string.cul_zum_durnbrau_info), getString(R.string.cul_zum_durnbrau_location)));

        // Create an {@link CityAdapter}, whose data source is a list of {@link munich}. The
        // adapter knows how to create list items for each item in the list.
        CityAdapter adapter = new CityAdapter(getActivity(), munich, R.color.bavarian_color);

        ListView listView = (ListView) rootView.findViewById(R.id.listV);

        listView.setAdapter(adapter);
        return rootView;
    }

}
