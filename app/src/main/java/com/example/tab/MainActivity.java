package com.example.tab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    TabHost host;
    TabHost.TabSpec spec;
    RatingBar rb;
    Button bt;
    View.OnClickListener cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        host = (TabHost)findViewById(R.id.thost);
        host.setup();

        spec = host.newTabSpec("tag1");
        spec.setIndicator("달력");
        spec.setContent(R.id.calendar);
        host.addTab(spec);

        spec = host.newTabSpec("tag2");
        spec.setIndicator("그림");
        spec.setContent(R.id.image);
        host.addTab(spec);

        spec = host.newTabSpec("tag3");
        spec.setIndicator("버튼들");
        spec.setContent(R.id.buttons);
        host.addTab(spec);

        spec = host.newTabSpec("tag4");
        spec.setIndicator("기타");
        spec.setContent(R.id.etc);
        host.addTab(spec);

        spec = host.newTabSpec("tag5");
        spec.setIndicator("얼굴");
        spec.setContent(R.id.face);
        host.addTab(spec);

        host.setCurrentTab(2);

        bt = (Button)findViewById(R.id.button);
        rb = (RatingBar)findViewById(R.id.rating);

        cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb.setRating(2);
            }
        };
        bt.setOnClickListener(cl);
    }
}
