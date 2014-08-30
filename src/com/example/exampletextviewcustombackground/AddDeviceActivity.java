package com.example.exampletextviewcustombackground;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Build;

public class AddDeviceActivity extends Activity {

	int count=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_device);
		final EditText txtContext=(EditText) findViewById(R.id.editIDDevice);
		txtContext.setOnKeyListener(new View.OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if((event.getAction()==KeyEvent.ACTION_UP)&&(event.getAction()!=KeyEvent.KEYCODE_DEL)&&(event.getAction()!=KeyEvent.KEYCODE_ENTER))
				{
					Log.v("VIN", "AA");
				}
				return false;
			}
		});
		
	}

	

}
