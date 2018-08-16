package id.co.inixindo.rz.androidixsbydashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;

/**
 * Created by RZ on 9/17/2016.
 */
public class CombinedChart extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_combined_chart, container, false);

        com.github.mikephil.charting.charts.CombinedChart combinedChart = (com.github.mikephil.charting.charts.CombinedChart) view.findViewById(R.id.combinedchart1);

        CombinedData data = new CombinedData(getXAxisValues());
        data.setData(barData());
        data.setData(lineData());
        combinedChart.setData(data);
        combinedChart.setDescription("My Combined Chart");
        combinedChart.animateXY(5000, 5000);
        return view;

    }

    private LineData lineData() {
        ArrayList<Entry> line = new ArrayList<>();
        line.add(new Entry(50.000f, 0));
        line.add(new Entry(90.000f, 1));
        line.add(new Entry(110.000f, 2));
        line.add(new Entry(40.000f, 3));
        line.add(new Entry(70.000f, 4));
        line.add(new Entry(80.000f, 5));
        line.add(new Entry(30.000f, 6));
        line.add(new Entry(60.000f, 7));
        line.add(new Entry(120.000f, 8));
        line.add(new Entry(105.000f, 9));
        line.add(new Entry(80.000f, 10));
        line.add(new Entry(60.000f, 11));

        LineDataSet lineDataSet = new LineDataSet(line, "LX I");
        lineDataSet.setColor(Color.rgb(255, 0, 0));
        lineDataSet.setDrawCubic(true);
        LineData lineData = new LineData(getXAxisValues(), lineDataSet);

        return lineData;
    }

    private BarData barData() {
        ArrayList<BarEntry> bar = new ArrayList<>();
        bar.add(new BarEntry(90.000f, 0));
        bar.add(new BarEntry(30.000f, 1));
        bar.add(new BarEntry(50.000f, 2));
        bar.add(new BarEntry(120.000f, 3));
        bar.add(new BarEntry(105.000f, 4));
        bar.add(new BarEntry(30.000f, 5));
        bar.add(new BarEntry(100.000f, 6));
        bar.add(new BarEntry(90.000f, 7));
        bar.add(new BarEntry(30.000f, 8));
        bar.add(new BarEntry(60.000f, 9));
        bar.add(new BarEntry(40.000f, 10));
        bar.add(new BarEntry(90.000f, 11));

        BarDataSet barDataSet= new BarDataSet(bar, "LX II");
        barDataSet.setColor(Color.rgb(0, 255, 0));
        BarData barData= new BarData(getXAxisValues(), barDataSet);

        return barData;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        xAxis.add("JUL");
        xAxis.add("AUG");
        xAxis.add("SEP");
        xAxis.add("OCT");
        xAxis.add("NOV");
        xAxis.add("DEC");

        return xAxis;
    }
}
