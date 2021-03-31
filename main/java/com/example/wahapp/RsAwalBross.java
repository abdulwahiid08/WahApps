package com.example.wahapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RsAwalBross extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAction = new String[]{"Website","Call Center","SMS Center", "Driving Direction",
                "info di Google","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAction));
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
            if (pilihan.equals("Call Center")){
                String noTel = "tel:0761-47333";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(noTel));

            } else if(pilihan.equals("SMS Center")) {
                String sms = "Abdul Wahid (L)";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:0852635347"));
                a.putExtra("sms_body",sms);

            } else if (pilihan.equals("Driving Direction")) {
                String lokasiRS = "https://www.google.co.id/maps/place/RUMAH+SAKIT+AWAL+BROS+PANAM/@0.5139625,101.3711351,12z/data=!4m5!3m4!1s0x31d5a8f5db0db97b:0x8f4c180a400c2d84!8m2!3d0.4632232!4d101.3903332";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasiRS));

            } else if (pilihan.equals("Website")) {
                String web = "http://awalbros.com/branch/panam/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(web));

            } else if (pilihan.equals("info di Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Awal Bross");
            }

            startActivity(a);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

