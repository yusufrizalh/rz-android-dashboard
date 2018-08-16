package id.co.inixindo.rz.androidixsbydashboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.ScatterData;
import com.github.mikephil.charting.data.ScatterDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by RZ on 9/17/2016.
 */
public class ScatterChart extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_scatter_chart, container, false);

        com.github.mikephil.charting.charts.ScatterChart scatterChart = (com.github.mikephil.charting.charts.ScatterChart) view.findViewById(R.id.scatterchart1);

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

        ScatterDataSet scatterDataSet= new ScatterDataSet(entries, "My Scatter Chart");
        //scatterDataSet.setColor(Color.rgb(255, 0, 0));
        scatterDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        //scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CIRCLE);
        //scatterDataSet.setScatterShape(ScatterChart.ScatterShape.CROSS);
        //scatterDataSet.setScatterShape(ScatterChart.ScatterShape.SQUARE);
        scatterDataSet.setScatterShape(com.github.mikephil.charting.charts.ScatterChart.ScatterShape.TRIANGLE);
        scatterDataSet.setScatterShapeSize(10);

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

        ScatterData data = new ScatterData(yAxis, scatterDataSet);
        scatterChart.setData(data);
        scatterChart.animateY(5000);
        return view;
    }
}
