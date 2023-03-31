package com.example.mysmolensk;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import ru.rustore.geo.MapGlobalConfig;
import ru.rustore.geo.MapViewConfig;
import ru.rustore.geo.data.CompassLocationMode;
import ru.rustore.geo.data.MapLocation;
import ru.rustore.geo.data.MapStyle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapViewConfig mapViewConfig = new MapViewConfig("RS63c048bc59728494f6670deda9de27a98edb1da70cfab0aa907ebc0ee9b388",new MapLocation(54.7818,32.0401,1f,1f,1f,1.0,1.0), 1.0f,
                MapStyle.Light.INSTANCE, CompassLocationMode.FreeArrow);
        MapGlobalConfig.Companion.setMapGlobalConfig(mapViewConfig);
    }
}

