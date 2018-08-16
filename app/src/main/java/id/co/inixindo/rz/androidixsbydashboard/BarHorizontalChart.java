package id.co.inixindo.rz.androidixsbydashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

/**
 * Created by RZ on 9/17/2016.
 */
public class BarHorizontalChart extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.activity_bar_horizontal_chart, container, false);

        HorizontalBarChart horizontalBarChart = (HorizontalBarChart)view.findViewById(R.id.barhorizontalchart1);

        ArrayList<String> yAxis = new ArrayList<>();
        yAxis.add("JAN");
        yAxis.add("FEB");
        yAxis.add("MAR");
        yAxis.add("APR");
        yAxis.add("MAY");
        yAxis.add("JUN");
        yAxis.add("JUL");
        yAxis.add("AUG");
        yAxis.add("SEP");
        yAxis.add("OCT");
        yAxis.add("NOV");
        yAxis.add("DEC");

        // data group 1
        ArrayList<BarEntry> group1 = new ArrayList<>();
        group1.add(new BarEntry(120.000f, 0));         // JAN
        group1.add(new BarEntry(100.000f, 1));         // FEB
        group1.add(new BarEntry(70.000f, 2));         // MAR
        group1.add(new BarEntry(90.000f, 3));         // APR
        group1.add(new BarEntry(105.000f, 4));         // MAY
        group1.add(new BarEntry(40.000f, 5));         // JUN
        group1.add(new BarEntry(90.000f, 6));         // JUL
        group1.add(new BarEntry(30.000f, 7));         // AUG
        group1.add(new BarEntry(80.000f, 8));         // SEP
        group1.add(new BarEntry(110.000f, 9));         // OCT
        group1.add(new BarEntry(80.000f, 10));         // NOV
        group1.add(new BarEntry(60.000f, 11));         // DEC

        // data group 2
        ArrayList<BarEntry> group2 = new ArrayList<>();
        group2.add(new BarEntry(70.000f, 0));         // JAN
        group2.add(new BarEntry(50.000f, 1));         // FEB
        group2.add(new BarEntry(120.000f, 2));         // MAR
        group2.add(new BarEntry(100.000f, 3));         // APR
        group2.add(new BarEntry(80.000f, 4));         // MAY
        group2.add(new BarEntry(90.000f, 5));         // JUN
        group2.add(new BarEntry(40.000f, 6));         // JUL
        group2.add(new BarEntry(80.000f, 7));         // AUG
        group2.add(new BarEntry(120.000f, 8));         // SEP
        group2.add(new BarEntry(105.000f, 9));         // OCT
        group2.add(new BarEntry(100.000f, 10));         // NOV
        group2.add(new BarEntry(30.000f, 11));         // DEC

        BarDataSet barDataSet1 = new BarDataSet(group1, "LX I");
        barDataSet1.setColor(Color.rgb(0, 255, 0));

        BarDataSet barDataSet2 = new BarDataSet(group2, "LX II");
        barDataSet2.setColor(Color.rgb(255, 0, 0));

        // meletakkan semua bardataset dalam dataset
        ArrayList<BarDataSet> dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);

        BarData data = new BarData(yAxis, dataSets);
        horizontalBarChart.setData(data);
        horizontalBarChart.animateXY(5000, 5000);

        return view;
    }
}
