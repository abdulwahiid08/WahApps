package com.example.wahapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[]{"Rumah Sakit Awal Bross","Rumah Sakit Syafira", "RS Eka Hospital",
        "Rumah Sakit Ibnu Sina"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, listRS));
    }
        // Event Click
    protected void onListItemClick(ListView l, View v, int position, long id){
        super.onListItemClick(l,v,position,id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanPilihan(pilihan);
    }

    private void tampilkanPilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Awal Bross")){
                a = new Intent(this,RsAwalBross.class);
            } else if(pilihan.equals("RS Syafira")) {

            }
            startActivity(a);
        } catch (Exception e){
           e.printStackTrace();
        }
    }
}
