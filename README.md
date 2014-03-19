MultiItem_ListView_BaseAdapter
==============================

MultiItem ListView with BaseAdapter

First, in mainActivity we will create two array like

     private String[] Names = {"Sandeep Armal","Arun Choudhari", "Pradeep Chavan","Shrikant Pathe","Sarang Takone","Abhiraj Nagtode"};
      
     private String[] Profession = {"Android Developer","Network Adminstartor", "Database Adminstrative","Customer Support","BMC Tool Manager","WildLife Photographer"};
	
	first array have name nad second array having  profession.  
	
Then we will create one adapter class by extending BaseAdapter. 
we are passing both array and activity instance to adapter class like.  

       DynamicListAdapter ListAdpater = new DynamicListAdapter(this,Names,Profession);

And we are setting this adapter to our listview object for this you need to create listview in your xml file. 

       listviewObj.setAdapter(ListAdpater);


DynamicLisAdapter.java

first,we are extending BaseAdapter to this activity.  

** what base adapter do? ** 
Adapter is use to bind data to view. it will bind your all data to view or you can say listview.  
BaseAdapter is simple abstract class for your Adapter interface to implementing adapters. we can create our own but android system provide some flexible already... 

we are going to use here Array adapter which bind array data to view and provide getView() to inflate, populate and return custom view.

some other adapter are.  

CursorAdapter
SimpleCursorAdapter

Okay, theroy is enough now back to coding again :-)

we create on constructor for adapter class(offcourse we are passing some value to constructor)

         public DynamicListAdapter(Activity context, String[] names, String[] profession)
	 {
		this.names = names;
		this.profession = profession;
		this.context = context;
		layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	 }
	
	/** When you use a custom view in a ListView you must define the row layout for this we needd to use LayoutInflater*/
	
As we discuss we are going to overrid getView() method which return view.

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


