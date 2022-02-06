package com.example.pcsilah;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
public class cpu extends AppCompatActivity {

    Map<String,String> intelcpu1  = new HashMap<String,String>();

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		intelcpu1.put("المصنع Chipset Manufacturer","Intel");

		intelcpu1.put("المعالج CPU","i3-8100");

		intelcpu1.put("عدد الأنوية Cores","4 cores");

		intelcpu1.put("سرعة المعالجة في ساعة (Clock speed)","3.60 GHz");

		intelcpu1.put("مستوى التخزينات المؤقته (L Caches)","6 MB Intel® Smart Cache");

		intelcpu1.put("معالجة الرسومات (Processor Graphics)","Intel® UHD Graphics 630");

		intelcpu1.put("طاقة تصميم حراري(TDP)","65 W");

		intelcpu1.put("Image","");

		System.out.print(intelcpu1);



	}
}
