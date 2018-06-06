package com.example.nishio.listviewsample1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Toast;

public class ListViewSampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_sample);
    }
    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent , View view, int position, long id){
            //タップされた定食名を取得。
            String item =(String) parent.getItemAtPosition(position);
            //トーストで表示する文字列を作成。
            String show = "あなたが選んだ定食:" + item;
            Toast.makeText(ListViewSampleActivity.this, show, Toast.LENGTH_LONG).show();

        }
    }
}
