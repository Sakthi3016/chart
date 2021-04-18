package com.example.chart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class bardemo extends AppCompatActivity {

    BarChart bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bardemo);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        bar=(BarChart)findViewById(R.id.barchart);

        ArrayList<BarEntry> data=new ArrayList<>();
        data.add(new BarEntry(2010,1000));
        data.add(new BarEntry(2011,1300));
        data.add(new BarEntry(2012,1700));
        data.add(new BarEntry(2013,1900));
        data.add(new BarEntry(2014,1300));
        data.add(new BarEntry(2015,1100));
        data.add(new BarEntry(2016,1000));
        data.add(new BarEntry(2017,1700));
        data.add(new BarEntry(2018,1900));
        data.add(new BarEntry(2019,2200));

        BarDataSet dataSet=new BarDataSet(data,"Report");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(20f);


        BarData barData=new BarData(dataSet);
        bar.setFitBars(true);
        bar.setData(barData);
        bar.getDescription().setText("Bar Report");
        bar.animateY(2000);

    }
}