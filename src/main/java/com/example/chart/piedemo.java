package com.example.chart;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class piedemo extends AppCompatActivity {

    PieChart piechart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piedemo);

        piechart=(PieChart)findViewById(R.id.piechart);

        ArrayList<PieEntry> records=new ArrayList<>();
        records.add(new PieEntry(32,"Part1"));
        records.add(new PieEntry(14,"Part2"));
        records.add(new PieEntry(34,"Part3"));
        records.add(new PieEntry(38,"Part4"));

        PieDataSet dataSet=new PieDataSet(records,"Pie chart");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(22f);

        PieData pieData=new PieData(dataSet);
        piechart.setData(pieData);
        piechart.getDescription().setEnabled(true);
        piechart.setCenterText("PIE PARTS:)");
        piechart.animate();
    }
}