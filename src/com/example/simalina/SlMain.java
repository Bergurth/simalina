package com.example.simalina;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SlMain extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sida4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_sl_main, menu);
        return true;
    }
}
