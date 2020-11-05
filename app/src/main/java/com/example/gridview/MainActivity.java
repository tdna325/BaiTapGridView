package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<InforList> arrayList;
    Adapter adapter;
    String[] name_gv = new String[]{"Tran Duy Nhan","Tran Duy","Tran Nhan","Duy Nhan","Tran Huy","Huy Tran"};
    String[] addr_gv = new String[]{"Điện Bàn - Quảng Nam","Điện Bàn - Quảng Nam","Điện Bàn - Quảng Nam","Điện Bàn - Quảng Nam","Điện Bàn - Quảng Nam","Điện Bàn - Quảng Nam"};
    String[] num_gv = new String[]{"0386376400","0386376400","0386376400","0386376400","0386376400","0386376400"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        AnhXa();

        adapter = new Adapter(this,R.layout.gridlayout,arrayList);
        gridView.setAdapter(adapter);
    }

    private void AnhXa() {
        gridView = findViewById(R.id.gridView);
        arrayList = new ArrayList<>();
        for (int i = 0;i < name_gv.length;i++)
        {
            InforList inforList =new InforList(R.drawable.ic_baseline_account_circle_24,name_gv[i],addr_gv[i],num_gv[i]);
            arrayList.add(inforList);
        }
    }
}