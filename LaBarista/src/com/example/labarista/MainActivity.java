package com.example.labarista;

import android.os.Bundle;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Parse.initialize(this, "21Kt4Bfjgl2Xxfa3nqm4LY74Etj1BVqI73mQCflt", "eEyWeokMchKUtVrEn6htK7V08ujFH67yGRCH1WBh");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

