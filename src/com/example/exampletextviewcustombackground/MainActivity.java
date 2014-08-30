package com.example.exampletextviewcustombackground;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.os.Build;

public class MainActivity extends Activity  {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
//        Log.v("A", "A");
//        ListView lv=(ListView) findViewById(R.id.lvMenu);
//        String[] list=getResources().getStringArray(R.array.listViewMenuSource);
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);
//        lv.setAdapter(adapter);
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//			@Override
//			public void onItemClick(AdapterView<?> parent, View view,
//					int position, long id) {
//				// TODO Auto-generated method stub
//				MyFragment fragment=null;
//				if(position ==1)
//				{
//
//						Log.v("Vin", "AddDeviceClick");
//						if(fragment==null)
//						{
//							fragment=new MyFragment();
//							getFragmentManager().beginTransaction().add(R.id.contain, fragment).commit();
//							
//						}
//				}
//				else
//				{	
//						getFragmentManager().beginTransaction().remove(fragment);
//						fragment=null;
//						Log.v("Vin", "ELSE");
//					
//				}
//			}
//		});
//        
        Log.v("Hard", "Hard");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	public void buttonClick(View v)
	{
		Intent intent=new Intent(this, AddDeviceActivity.class);
		startActivity(intent);
	}
    /**
     * A placeholder fragment containing a simple view.
     */
   
}
