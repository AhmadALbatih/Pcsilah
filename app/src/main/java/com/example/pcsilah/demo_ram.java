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

public class demo_ram extends AppCompatActivity {
    TextView textview;
    ImageView next;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_ram);
        textview = (TextView) findViewById(R.id.tv3);
        next = (ImageView) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(demo_ram.this,demo_gpu.class);
                startActivity(i);
            }
        });
        String para ="4- الوصول العشوائي \n" +
                "هي مكان تخزين مؤقت على جهاز الكمبيوتر يمكن الوصول الى محتوياته في وقت محدد ، بغض النظر عن موقع البيانات في الذاكرة، لذا فإن ذاكرة الوصول العشوائي هذه هي مجرد تخزين مؤقت عند استخدام جهاز كمبيوتر أو برنامج معين بحيث يمكن معالجتها بسرعة.\n" +
                "\n" +
                "                                                                    :RAMوظيفة \n" +
                "وظيفة ذاكرة الوصول العشوائي هي تسريع معالجة البيانات على جهاز الكمبيوتر. لذلك كلما زاد عدد ذاكرة الوصول العشوائي لديك ، كلما أسرع جهاز الكمبيوتر في معالجتها. يمكن رؤية ذاكرة الوصول العشوائي العاملة في إدارة المهام في نظام الكمبيوتر.\n" +
                "خطوات تركيب الرامات للحاسب:\n" +
                "-\tقم بفصل الكهرباء عن الحاسب الآلي\n" +
                "-\tفتح صندوق جهاز الحاسب \n" +
                "-\tتفقد ترتيب فتحات الرام\n" +
                "-\tقم بالضغط على قمة الوحدة بشكل متساوي حتى يتم تثبيت ألسنة الرام في مكانها الصحيح في كلا الجانبين .\n";

        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}