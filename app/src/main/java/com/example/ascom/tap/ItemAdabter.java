package com.example.ascom.tap;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class ItemAdabter extends ArrayAdapter<Item> {
    Context context;
    int layoutResourceId;
    Item data[] = null;

    public ItemAdabter(Context context, int layoutResourceId, Item[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        UserHolder holder = null;

        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            String t2="fonts/palai.ttf";
            String t3="fonts/consolaz.ttf";
            String t4="fonts/segoeprb.ttf";

            Typeface tf2=Typeface.createFromAsset(((Activity)context).getAssets(),t2);
            Typeface tf3=Typeface.createFromAsset(((Activity)context).getAssets(),t3);
            Typeface tf4=Typeface.createFromAsset(((Activity)context).getAssets(), t4);
            holder = new UserHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.profilePic);
            holder.txtTitle = (TextView)row.findViewById(R.id.name);
            holder.txtTitle.setTypeface(tf4);
            holder.Type_txt= (TextView) row.findViewById(R.id.type_textview);
            holder.Type_txt.setTypeface(tf3);
            holder.Post= (TextView) row.findViewById(R.id.post_text);
            holder.Post.setTypeface(tf2);

            row.setTag(holder);
        }
        else
        {
            holder = (UserHolder)row.getTag();
        }

        Item myData = data[position];
        holder.txtTitle.setText(myData.User_name);

        holder.imgIcon.setImageResource(myData.icon);
        holder.Type_txt.setText(myData.Type);
        holder.Post.setText(myData.Post);


        return row;
    }

    static class UserHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
        TextView Type_txt;
        TextView Post;
        EditText comment;
    }
}
