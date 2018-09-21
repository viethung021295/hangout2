package com.wit.hangout4;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ListView;

public class CustomListViewActivity extends Activity {

    private ListView listView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_header_row);

        SocialNetwork weather_data[] =new SocialNetwork[]{
                new SocialNetwork(R.drawable.ic_hinh1, "Abbie Pratt"),
                new SocialNetwork(R.drawable.people2, "Patric Graza"),
                new SocialNetwork(R.drawable.people3, "Louis Ortiz"),
                new SocialNetwork(R.drawable.people4, "Eula King"),
                new SocialNetwork(R.drawable.people5, "Duane Lane"),
                new SocialNetwork(R.drawable.people6, "Katharine "),
                new SocialNetwork(R.drawable.people7, "Jimmy Cooper"),
                new SocialNetwork(R.drawable.ic_hinh1, "Tien Tham"),
                new SocialNetwork(R.drawable.ic_hinh1, "Cao tuong"),
                new SocialNetwork(R.drawable.ic_hinh1, "Patric Graza")
        };
        SocialNetworkAdapter adapter =new SocialNetworkAdapter(this,R.layout.listview_item_row,weather_data);

        listView = findViewById(R.id.lv_listfriend);


        listView.setAdapter(adapter);

    }
}
