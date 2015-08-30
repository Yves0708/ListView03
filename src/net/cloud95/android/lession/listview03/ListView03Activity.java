package net.cloud95.android.lession.listview03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class ListView03Activity extends Activity {

    private TextView info;
    private ListView list_view;
    
    private List<HashMap<String, String>> items;
    private SimpleAdapter sa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview03);

        processViews();
        processControllers();

        // 建立每一個元素為Map物件的List物件
        // 建立包裝一個項目資料的Map物件
        // 設定項目資料的編號，第一個參數「id」為資料名稱
        // 設定項目資料的名稱，第一個參數「name」為資料名稱
        // 設定項目資料的說明，第一個參數「content」為資料名稱
        // 加入一個項目資料
        // 第二個項目資料
        // 第三個項目資料

        // 建立一個資料名稱的字串陣列
        // 與資料名稱對應的畫面元件資源編號陣列
        
        // 建立Adapter物件
        // 第一個參數設定「this」，表示這個Activity元件
        // 第二個參數設定一個List物件，提供項目資料
        // 第三個參數設定自己設計的畫面配置資源
        // 第四個參數設定資料名稱的字串陣列
        // 第五個參數設定畫面元件資源編號陣列
        // 呼叫setAdapter方法指定使用的Adapter物件
    }

    private void processViews() {
        info = (TextView) findViewById(R.id.info);
        list_view = (ListView) findViewById(R.id.list_view);
    }

    private void processControllers() {
    }

    // 選擇監聽類別

}
