package com.example.pcsilah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Bundle;

public class demo_case extends AppCompatActivity {
    TextView textview;
    ImageView end;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_case);
        textview = (TextView) findViewById(R.id.tv3);
        end = (ImageView) findViewById(R.id.end);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(demo_case.this,MainActivity.class);
                startActivity(i);
            }
        });
        String para =" 9- صندوق الجهاز PC Case:\n" +
                "-\tبناء PC ممتاز يبدا في ال Case، وهي ما تحدد كيفية بنائك لمتطلباتك، وعن القطع الممكن استخدامها وسهولة تجميعها وغالبا ترجع على المستخدم بالمواصفات المطلوبة والمناسبة له، اختيار ال PC Case راجع بشكل مهم على الذي تحتاجه لبداية البناء.\n" +
                "10- مولد الطاقة Power supply:\n" +
                "-\tمحول الطاقة يحول الطاقة من   AC الى DC الى الأجراء الداخلية للجهاز، مع تزويد الإشارات ال Mother board لتشير الى الجهاز والعمل على التشغيل.\n" +
                "\n" +
                "العلاقة بين ال PC Case وال power supply في ال Motherboard:\n" +
                "\n" +
                "-\tيحمي ال Case   الأجزاء الداخلية للجهاز وال Motherboard، جميع الأجزاء الداخلية موصولة بمزود الطاقة لتزويد ال Motherboard وجميع الأجزاء المثبتة بالطاقة\n" +
                "\n" +
                "خطوات تركيب مزود الطاقة : (Power Supply)\n" +
                "1-\tالحصول على مزود الطاقة \n" +
                "2-\tوضع الجهاز على الجانب\n" +
                "3-\tفتح غطاء الجهاز\n" +
                "4-\tتركيب مزود الطاقة\n" +
                "5-\tتوصيل الموصلات\n" +
                "6-\tاغلاق الجهاز\n" +
                "7-\tتشغيل الجهاز\n";

        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}