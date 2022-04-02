package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private MapView leMap;
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle("MapViewBundleKey");
        }

        leMap = (MapView) findViewById(R.id.theMap);
        leMap.onCreate(mapViewBundle);

        leMap.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        map.getUiSettings().setMyLocationButtonEnabled(false);
        map.setMyLocationEnabled(true);
        map.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(43.1, -87.9)));

    }




    @Override
    public void onResume() {
        super.onResume();
        leMap.onResume();
    }


    @Override
    public void onPause() {
        super.onPause();
        leMap.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        leMap.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        leMap.onLowMemory();
    }








}