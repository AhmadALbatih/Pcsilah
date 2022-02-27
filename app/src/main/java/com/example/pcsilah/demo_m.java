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

public class demo_m extends AppCompatActivity {
    TextView textview;
    ImageView next;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_m);
        textview = (TextView) findViewById(R.id.tv3);
        next = (ImageView) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(demo_m.this,demo_gpu.class);
                startActivity(i);
            }
        });
        String para =" 1- لوحة الام Motherboard :\n" +
                "-\tهي الدائرة الأساسية لجميع الأجزاء الداخلية للنظام وتسمح بتواصل المكونات الإلكترونية المهمة للنظام مثل: CPU  وذاكرة التخزين الداخلية وتقدم اتصال محيطي لموصلات اخرى\n" +
                "2- المعالج CPU (Central Processing Unit):\n" +
                "-\tالمعالج الأساسي ودائرة كهربائية ويقوم ب معالجه الأوامر تشمل برامج الكمبيوتر ويقوم بعمل بعض الحسابات المنطق وعمليات الادخال والإخراج  (Input/Output)  مخصصه بأوامر البرامج\n" +
                "3- المروحة PC Fans :\n" +
                "-\tمروحة الجهاز تكون في داخل ال case   وتكون مثبته في الداخل وتستعمل في سحب الهواء البارد الى الداخل للتبريد الجهاز او قطعه معينه وطرد الهواء الحار\n" +
                "العلاقة بين ال  CPUوال  Motherboard بالمراوح الداخلية :\n" +
                "-\tمراوح ال Motherboard  تقوم بتزويد المراوح الداخلية بالطاقة والدوران بسرعه, مراوح الجهاز و مراوح الCPU  يعملان نفس الوظيفة في التبريد ولكن مراوح النظام تستخدم في ربط بال Case fans و مراوح ال CPU تساعد على دفع الهواء الحار الى الخارج وإبقاء الجهاز بارد\n" +
                "\n";
        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}