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

public class demo_gpu extends AppCompatActivity {
    TextView textview;
    ImageView next;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_gpu);
        textview = (TextView) findViewById(R.id.tv3);
        next = (ImageView) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(demo_gpu.this,demo_case.class);
                startActivity(i);
            }
        });
        String para ="(GPU)graphics processing unit – 5\n" +
                "يرمز \"GPU\" إلى وحدة معالجة الرسومات ، وهو جزء من الكمبيوتر مسؤول عن الصور التي تظهر على الشاشة. تستخدم في العديد من التطبيقات مثل العاب الفديو والذكاء الاصطناعي. \n" +
                "\n" +
                "لدى وحدات معالجة الرسومات نوعيين اساسين وهما \n" +
                "1- وحدة معالجة الرسومات المتكاملة :\n" +
                "اللتي تأتي بالكامل على ( motherboard)   بأنظمة ارق واخف وزنا واقل استهلاكا للطاقة. من انواع وحدات معالجة الرسومات المتكامل  Intel® Graphics Technologyواللتي تحتوي على Intel® Iris® Plus Intel® Iris® Xe. \n" +
                "\n" +
                "2-وحدة معالجة الرسومات المنفصلة: \n" +
                "\n" +
                "كارت الشاشة المنفصل :    Dedicated GPU\n" +
                "وهو كرت شاشة أضافي مخصص لمعالجة الأعمال اللتي تحتوي على الكثير من الرسوميات وعلى رغم تسميتها بالمنفصلة الا أن كروت الشاشة المخصصة تكون مدمجة في اللوحة الأم ¬(motherboard) وهذا فقط في اجهزة اللابتوب أما في الحواسيب المكتبية فيمكن ازالتها وتغييرها بكل سهولة. \n" +
                "وتعتبر شركات AMD  و Nvidia هي الشركات الرئسية المصنعة لهذة الكروت. ويحتاج كرت الشاشة هذا الى طاقة أكبر ونظام تبريد مخصص. \n" +
                "\n" +
                "كرت الشاشة المنفصل لن يستحوذ على جزء من الرامات الاساسي لكي يعمل مثل الكرت المدمج, بل يأتي مع ذاكرة VRAM خاصة بة وأنوية متعددة كما انه اكثر قابلية للتخصيص  ويمكن التحكم في الاعدادات الخاصة به. \n";

        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}