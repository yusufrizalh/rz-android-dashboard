package id.co.inixindo.rz.androidixsbydashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

/**
 * Created by RZ on 9/17/2016.
 */
public class LineChartt extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_line_chart, container, false);

        LineChart lineChart = (LineChart) view.findViewById(R.id.linechart1);

        ArrayList<Entry> entries = new ArrayList<>();

        entries.add(new Entry(120.000f, 0));         // JAN
        entries.add(new Entry(100.000f, 1));         // FEB
        entries.add(new Entry(70.000f, 2));         // MAR
        entries.add(new Entry(90.000f, 3));         // APR
        entries.add(new Entry(105.000f, 4));         // MAY
        entries.add(new Entry(40.000f, 5));         // JUN
        entries.add(new Entry(90.000f, 6));         // JUL
        entries.add(new Entry(30.000f, 7));         // AUG
        entries.add(new Entry(80.000f, 8));         // SEP
        entries.add(new Entry(110.000f, 9));         // OCT
        entries.add(new Entry(80.000f, 10));         // NOV
        entries.add(new Entry(60.000f, 11));         // DEC

        LineDataSet lineDataSet = new LineDataSet(entries, "My Line Chart");
        lineDataSet.setColor(Color.rgb(255, 0, 255));
        lineDataSet.setDrawCubic(true);
        lineDataSet.setDrawFilled(true);

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

        LineData data = new LineData(yAxis, lineDataSet);
        lineChart.setData(data);
        lineChart.animateY(5000);
        return view;
    }
}
