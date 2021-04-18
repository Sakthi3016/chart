package com.example.chart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Map;

public class linedemo extends AppCompatActivity {
LineChart lineChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linedemo);

        lineChart=(LineChart)findViewById(R.id.linechart);


        ArrayList<Entry> information=new ArrayList<Entry>();
        information.add(new Entry(10,80));
        information.add(new Entry(50,90));
        information.add(new Entry(100,110));
        information.add(new Entry(150,80));
        information.add(new Entry(500,130));
        LineDataSet lineDataSet=new LineDataSet(information,"Information");
        lineDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        lineDataSet.setValueTextColor(Color.BLACK);
        lineDataSet.setValueTextSize(20f);
        LineData lineData=new LineData(lineDataSet);
        lineChart.setData(lineData);
        lineChart.animateX(2000);









    }
}