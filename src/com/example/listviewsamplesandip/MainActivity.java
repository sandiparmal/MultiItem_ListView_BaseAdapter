package com.example.listviewsamplesandip;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	private ListView listviewObj;
	private DynamicListAdapter ListAdpater;
	private String[] Names = {"Sandeep Armal","Arun Choudhari", "Pradeep Chavan","Shrikant Pathe","Sarang Takone","Abhiraj Nagtode"};
	private String[] Profession = {"Android Developer","Network Adminstartor", "Database Adminstrative","Customer Support","BMC Tool Manager","WildLife Photographer"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initializeVariable();
		ListAdpater = new DynamicListAdapter(this,Names,Profession);
		listviewObj.setAdapter(ListAdpater);
	}

	private void initializeVariable() {
		listviewObj = (ListView)findViewById(R.id.listView1);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
