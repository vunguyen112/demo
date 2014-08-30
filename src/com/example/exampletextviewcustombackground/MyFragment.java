package com.example.exampletextviewcustombackground;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyFragment  extends Fragment{
	
	
	
	public MyFragment() {
		// TODO Auto-generated constructor stub

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	View rootView=inflater.inflate(R.layout.fragment_adddevice, container,false);
    
    	return rootView;
    }

   
}
