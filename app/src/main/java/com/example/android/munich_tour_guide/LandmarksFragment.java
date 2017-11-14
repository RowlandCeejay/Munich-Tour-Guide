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
public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.city_list, container, false);

        // Create a list of landmarks in Munich, Germany.
        ArrayList<City> munich = new ArrayList<>();

        munich.add(new City(getString(R.string.landMk_allianz_arena_name), getString(R.string.landMk_allianz_arena_add), R.drawable.landmarks_allianz_arena,
                getString(R.string.landMk_allianz_arena_info), getString(R.string.landMk_allianz_arena_location)));

        munich.add(new City(getString(R.string.landMk_angel_of_peace_name), getString(R.string.landMk_angel_of_peace_add), R.drawable.landmarks_angel_of_peace,
                getString(R.string.landMk_angel_of_peace_info), getString(R.string.landMk_angel_of_peace_location)));

        munich.add(new City(getString(R.string.landMk_bavaria_statue_name), getString(R.string.landMk_bavaria_statue_add), R.drawable.landmarks_bavaria_statue,
                getString(R.string.landMk_bavaria_statue_info), getString(R.string.landMk_bavaria_statue_location)));

        munich.add(new City(getString(R.string.landMk_bmw_museum_name), getString(R.string.landMk_bmw_museum_add), R.drawable.landmarks_bmw_museum,
                getString(R.string.landMk_bmw_museum_info), getString(R.string.landMk_bmw_museum_location)));

        munich.add(new City(getString(R.string.landMk_frauenkirche_name), getString(R.string.landMk_frauenkirche_add), R.drawable.landmarks_frauenkirche,
                getString(R.string.landMk_frauenkirche_info), getString(R.string.landMk_frauenkirche_location)));

        munich.add(new City(getString(R.string.landMk_hofgarten_name), getString(R.string.landMk_hofgarten_add), R.drawable.landmarks_hofgarten,
                getString(R.string.landMk_hofgarten_info), getString(R.string.landMk_hofgarten_location)));

        munich.add(new City(getString(R.string.landMk_karlsplatz_name), getString(R.string.landMk_karlsplatz_add), R.drawable.landmarks_karlsplatz,
                getString(R.string.landMk_karlsplatz_info), getString(R.string.landMk_karlsplatz_location)));

        munich.add(new City(getString(R.string.landMk_munich_residenz_name), getString(R.string.landMk_munich_residenz_add), R.drawable.landmarks_munich_residenz,
                getString(R.string.landMk_munich_residenz_info), getString(R.string.landMk_munich_residenz_location)));

        munich.add(new City(getString(R.string.landMk_neuschwanstein_castle_name), getString(R.string.landMk_neuschwanstein_castle_add), R.drawable.landmarks_neuschwanstein_castle,
                getString(R.string.landMk_neuschwanstein_castle_info), getString(R.string.landMk_neuschwanstein_castle_location)));

        munich.add(new City(getString(R.string.landMk_odeonsplatz_name), getString(R.string.landMk_odeonsplatz_add), R.drawable.landmarks_odeonsplatz,
                getString(R.string.landMk_odeonsplatz_info), getString(R.string.landMk_odeonsplatz_location)));

        munich.add(new City(getString(R.string.landMk_olympia_park_name), getString(R.string.landMk_olympia_park_add), R.drawable.landmarks_olympia_park,
                getString(R.string.landMk_olympia_park_info), getString(R.string.landMk_olympia_park_location)));

        munich.add(new City(getString(R.string.landMk_schleissheim_palace_name), getString(R.string.landMk_schleissheim_palace_add), R.drawable.landmarks_schleissheim_palace,
                getString(R.string.landMk_schleissheim_palace_info), getString(R.string.landMk_schleissheim_palace_location)));

        munich.add(new City(getString(R.string.landMk_siegestor_name), getString(R.string.landMk_siegestor_add), R.drawable.landmarks_siegestor,
                getString(R.string.landMk_siegestor_info), getString(R.string.landMk_siegestor_location)));

        munich.add(new City(getString(R.string.landMk_sendlinger_tor_name), getString(R.string.landMk_sendlinger_tor_add), R.drawable.landmarks_sendlinger_tor,
                getString(R.string.landMk_sendlinger_tor_info), getString(R.string.landMk_sendlinger_tor_location)));

        // Create an {@link CityAdapter}, whose data source is a list of {@link munich}. The
        // adapter knows how to create list items for each item in the list.
        CityAdapter adapter = new CityAdapter(getActivity(), munich, R.color.bavarian_color);

        ListView listView = (ListView) rootView.findViewById(R.id.listV);

        listView.setAdapter(adapter);
        return rootView;
    }

}
