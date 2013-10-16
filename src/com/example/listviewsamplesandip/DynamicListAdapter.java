package com.example.listviewsamplesandip;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DynamicListAdapter extends BaseAdapter{
	private String[] names;
	private String[] profession;
	private Activity context;
	private static LayoutInflater layoutInflater = null;
	
	public DynamicListAdapter(Activity context, String[] names, String[] profession)
	{
		this.names = names;
		this.profession = profession;
		this.context = context;
		layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.names.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int arg0, View convertView, ViewGroup arg2) {
		View view = convertView;
		 if(convertView==null)
             view = layoutInflater.inflate(R.layout.list_item_layout, null);
		 ImageView  icon = (ImageView)view.findViewById(R.id.icon);
		 TextView tvNames = (TextView)view.findViewById(R.id.names);
		 TextView tvProfession = (TextView)view.findViewById(R.id.profession);
		 icon.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_launcher));
		 tvNames.setText(names[arg0]);
		 tvProfession.setText(profession[arg0]);

		// TODO Auto-generated method stub
		return view;
	}

	

}
