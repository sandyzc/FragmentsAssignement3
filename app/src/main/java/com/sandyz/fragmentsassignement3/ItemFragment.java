package com.sandyz.fragmentsassignement3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;


public class ItemFragment extends ListFragment {


    String[] title = new String[]{"Youtube","EBlogger"};
    String[] descreption = new String[]{"YouTube is an American video-sharing website headquartered in San Bruno, California. The service was created by three former PayPal employees—Chad Hurley, Steve Chen, and Jawed Karim","Blogger is a blog-publishing service that allows multi-user blogs with time-stamped entries"};
    int[] logo = {R.drawable.youtube,R.drawable.download};
    ArrayList<HashMap<String, String>> data=new ArrayList<HashMap<String,String>>();
    SimpleAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //map
        HashMap<String,String> hashMap =new HashMap<String,String>();

        //binding
        for (int i =0 ; i<title.length ; i++) {
            hashMap.put("title",title[i]);
            hashMap.put("desc",descreption[i]);
            hashMap.put("logo",Integer.toString(logo[i]));

            data.add(hashMap);

        }

        String[] from = {"title","desc", "logo"};

        int[] to = {R.id.ttl1,R.id.description,R.id.logo};

        //Adapter

        adapter = new SimpleAdapter(getActivity(),data,R.layout.fragment_item,from,to);
        setListAdapter(adapter);


        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {




        super.onActivityCreated(savedInstanceState);
    }
}
