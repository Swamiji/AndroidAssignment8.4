package com.example.amitroy.gridviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int[]icon={R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwich,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,
R.drawable.marshmallow,R.drawable.naugot};
    String[]iconname={"Gingerbread","HoneyComb","IceCreameSandwich","JellyBean","KitKat","Lollipop","Marshmallow","Naugot"};
    GridView gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GridView)findViewById(R.id.gridview);
        Adapter adapter=new Adapter(this,icon,iconname);
        gv.setAdapter(adapter);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Click On...."+iconname[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
