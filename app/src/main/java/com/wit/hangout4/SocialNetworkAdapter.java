package com.wit.hangout4;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SocialNetworkAdapter extends ArrayAdapter<SocialNetwork>{
    private Context context;
    private int layoutResourceId;
    private SocialNetwork data[] = null;


    public SocialNetworkAdapter(@NonNull Context context, int layoutResourceId, @NonNull SocialNetwork[] data) {
        super(context, layoutResourceId, data);
        this.context=context;
        this.layoutResourceId=layoutResourceId;
        this.data=data;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row =convertView;
        SocialNetworkHolder holder=null;

        if (row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId,parent,false);

            holder =new SocialNetworkHolder();
            holder.imgIcon =row.findViewById(R.id.i_mIcon);
            holder.txtTitle =row.findViewById(R.id.tv_Text);
            row.setTag(holder);
        }
        else {
            holder =(SocialNetworkHolder)row.getTag();
        }
        SocialNetwork network = data[position];
        holder.imgIcon.setImageResource(network.icon);
        holder.txtTitle.setText(network.title);

        return row;
    }
    static class   SocialNetworkHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}
