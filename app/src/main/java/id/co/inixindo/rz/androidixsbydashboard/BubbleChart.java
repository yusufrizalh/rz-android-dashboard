package id.co.inixindo.rz.androidixsbydashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.data.BubbleData;
import com.github.mikephil.charting.data.BubbleDataSet;
import com.github.mikephil.charting.data.BubbleEntry;

import java.util.ArrayList;

/**
 * Created by RZ on 9/17/2016.
 */
public class BubbleChart extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_bubble_chart, container, false);

        com.github.mikephil.charting.charts.BubbleChart bubbleChart = (com.github.mikephil.charting.charts.BubbleChart) view.findViewById(R.id.bubblechart1);

        ArrayList<BubbleEntry> entries = new ArrayList<>();

        entries.add(new BubbleEntry(0, 30.000f, 30f));         // JAN
        entries.add(new BubbleEntry(1, 120.000f, 120f));         // JAN
        entries.add(new BubbleEntry(2, 70.000f, 70f));         // JAN
        entries.add(new BubbleEntry(3, 100.000f, 100f));         // JAN
        entries.add(new BubbleEntry(4, 90.000f, 90f));         // JAN
        entries.add(new BubbleEntry(5, 30.000f, 30f));         // JAN
        entries.add(new BubbleEntry(6, 105.000f, 105f));         // JAN
        entries.add(new BubbleEntry(7, 50.000f, 50f));         // JAN
        entries.add(new BubbleEntry(8, 60.000f, 60f));         // JAN
        entries.add(new BubbleEntry(9, 90.000f, 90f));         // JAN
        entries.add(new BubbleEntry(10, 110.000f, 110f));         // JAN
        entries.add(new BubbleEntry(11, 30.000f, 30f));         // JAN

        BubbleDataSet bubbleDataSet = new BubbleDataSet(entries, "My Bubble Chart");
        bubbleDataSet.setColor(Color.rgb(0, 255, 0));

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

        BubbleData data = new BubbleData(yAxis, bubbleDataSet);
        bubbleChart.setData(data);
        bubbleChart.animateY(5000);
        return view;
    }
}
