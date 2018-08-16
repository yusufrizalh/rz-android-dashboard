package id.co.inixindo.rz.androidixsbydashboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by RZ on 9/17/2016.
 */
public class PieChart extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_pie_chart, container, false);
        com.github.mikephil.charting.charts.PieChart pieChart = (com.github.mikephil.charting.charts.PieChart) view.findViewById(R.id.piechart1);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new Entry(110.000f, 0));        // JAN
        entries.add(new Entry(90.000f, 1));        // FEB
        entries.add(new Entry(40.000f, 2));        // MAR
        entries.add(new Entry(30.000f, 3));        // APR
        entries.add(new Entry(70.000f, 4));        // MAY
        entries.add(new Entry(80.000f, 5));        // JUN
        entries.add(new Entry(50.000f, 6));        // JUL
        entries.add(new Entry(70.000f, 7));        // AUG
        entries.add(new Entry(90.000f, 8));        // SEP
        entries.add(new Entry(100.000f, 9));        // OCT
        entries.add(new Entry(105.000f, 10));        // NOV
        entries.add(new Entry(70.000f, 11));        // DEC

        PieDataSet pieData = new PieDataSet(entries, "My Pie Chart");
        pieData.setColors(ColorTemplate.COLORFUL_COLORS);

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

        PieData data = new PieData(xAxis, pieData);
        pieChart.setData(data);
        pieChart.animateY(5000);
        pieChart.saveToGallery("piechart.jpg", 85);
        pieChart.invalidate();

        return view;
    }
}
