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

public class demo_ssd extends AppCompatActivity {
    TextView textview;
    ImageView next;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_ssd);
        textview = (TextView) findViewById(R.id.tv3);
        next = (ImageView) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(demo_ssd.this,demo_ram.class);
                startActivity(i);
            }
        });
        String para ="قرص التخزين الداخلي هو عبارة قرص داخلي موجود في الكمبيوتر يقوم بتخزين البيانات النظام وملفات وسائط من صور والفيديوهات وغيرها وتخزين أنواع وصيغ مختلفة ومن ضمنها الألعاب الكمبيوتر وسوف يتم شرح الهاردسكات وأنواعها كما في الصورة على النحو التالي:\n" +
                "7 - محرك الأقراص الثابتة HDD\n" +
                " (Hard disk drive): هو جهاز تخزين في جهاز الكمبيوتر الخاص بك والذي يحتفظ بأنواع مختلفة من ملفات البيانات الافتراضية وتطبيقات البرامج، من خلال محركات الأقراص الثابتة، سرعة دوران الأقراص في داخله (5400 أو 7200 دورة في الدقيقة) \n" +
                "* سرعة القراءة\n" +
                "سرعة  نقل ونسخ الملفات كبيرة الحجم مثل الأفلام. ففي محركات الأقراص HDD تتراوح سرعة عملية النسخ ما بين 30-150 ميجابايت/ثانية.\n" +
                "\n" +
                "8 -  القرص الصلب SSD \n" +
                "(Solid State Drive) والذي يعني بالترجمة \"وسيط تخزين ذو حالة ثابتة فهو عبارة عن جهاز تخزين للبيانات ولا يوجد أقراص تتحرك به كالقرص الصلب. وتستخدم الدوائر المتكاملة Integrated Circuits وتستخدم الذاكرة memory لتخزين المعلومات.\n" +
                "* سرعة القراءة\n" +
                "محركات الأقراص SSD تصل سرعة عملية النسخ إلى 500 ميجابايت/ثانية. والسبب أن اللوحات الأم التي تعتمد على منفذ SATA 3 لا تستيطع تقديم أقصى من سرعة 600MB/s  لذلك تجد أقراص SSD التي تعتمد على تلك الواجهة لا تستطيع تخطي هذا الحاجز.\n" +
                "\n" +
                "\n" +
                "9 - أقراص NVMe M.2 SSD التخزينية\n" +
                "NVMe M.2 SSD التخزينية التى تقدم طريقة جديدة لرفع أداء الكمبيوتر لديك. إختصار NVMe هنا يستند إلى Non-Volatile Memory Express أو الذاكرة غير المتطايرة وهو أحدث جهاز تخزين دائم حاليًا.\n";

        textview.setText(para);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }
}