package com.dicon.spinthemusic;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	ArrayList<MyItem> arItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		arItem = new ArrayList<MyItem>();
		MyItem mi;
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		mi = new MyItem(R.drawable.ic_launcher, "난 물고기였어", "Darren Kim");
		arItem.add(mi);
		
		

		MyListAdapter MyAdapter = new MyListAdapter(this, R.layout.main_listview,
				arItem);

		ListView MyList;
		MyList = (ListView) findViewById(R.id.mainlist);
		MyList.setAdapter(MyAdapter);

	}

	class MyItem {
		MyItem(int aIcon, String aTitle, String aArtist) {
			Icon = aIcon;
			Title = aTitle;
			Artist = aArtist;
		}

		int Icon;
		String Title;
		String Artist;
	}

	class MyListAdapter extends BaseAdapter {
		Context maincon;
		LayoutInflater Inflater;
		ArrayList<MyItem> arSrc;
		int layout;

		public MyListAdapter(Context context, int alayout,
				ArrayList<MyItem> aarSrc) {
			maincon = context;
			Inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			arSrc = aarSrc;
			layout = alayout;
		}

		public int getCount() {
			return arSrc.size();
		}

		public String getItem(int position) {
			return arSrc.get(position).Title;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			if (convertView == null) {
				convertView = Inflater.inflate(layout, parent, false);
			}
			ImageView img = (ImageView) convertView.findViewById(R.id.image);
			img.setImageResource(arSrc.get(position).Icon);
			TextView title = (TextView) convertView.findViewById(R.id.title);
			title.setText(arSrc.get(position).Title);
			TextView artist = (TextView) convertView.findViewById(R.id.artist);
			artist.setText(arSrc.get(position).Artist);

			return convertView;
		}
	}

}
