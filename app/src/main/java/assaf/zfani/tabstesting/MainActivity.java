package assaf.zfani.tabstesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup(); //מכין את הטאב הוסט
        tabHost.addTab(tabHost.newTabSpec("first tab").setContent(R.id.tab1).setIndicator("tab 1"));
        tabHost.addTab(tabHost.newTabSpec("sec tab").setContent(R.id.tab2).setIndicator("tab 2"));
        tabHost.addTab(tabHost.newTabSpec("third tab").setContent(R.id.tab3).setIndicator("tab 3"));


    }
}
