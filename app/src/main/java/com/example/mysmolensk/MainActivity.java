package com.example.mysmolensk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.material.animation.AnimatableView;

import ru.rustore.geo.Map;
import ru.rustore.geo.MapGlobalConfig;
import ru.rustore.geo.MapViewConfig;
import ru.rustore.geo.data.CompassLocationMode;
import ru.rustore.geo.data.MapLocation;
import ru.rustore.geo.data.MapStyle;
import ru.rustore.geo.views.MapView;

public class MainActivity extends AppCompatActivity {
    MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mapView = findViewById(R.id.mapView);
        setContentView(R.layout.activity_main);
        MapGlobalConfig.Companion.setMapGlobalConfig(new MapViewConfig("RS63c048bc59728494f6670deda9de27a98edb1da70cfab0aa907ebc0ee9b388",
        new MapLocation(54.7818,32.0541,1f,1f,1f,1.0,1.0), 11.3f, MapStyle.Dark.INSTANCE, CompassLocationMode.StableArrow));

    }
}

