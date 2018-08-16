package id.co.inixindo.rz.androidixsbydashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;

import java.util.ArrayList;

/**
 * Created by RZ on 9/17/2016.
 */
public class RadarChart extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_radar_chart, container, false);

        com.github.mikephil.charting.charts.RadarChart radarChart = (com.github.mikephil.charting.charts.RadarChart) view.findViewById(R.id.radarchart1);

        ArrayList<Entry> entries1 = new ArrayList<>();
        entries1.add(new Entry(50.000f, 0));
        entries1.add(new Entry(90.000f, 1));
        entries1.add(new Entry(30.000f, 2));
        entries1.add(new Entry(60.000f, 3));
        entries1.add(new Entry(100.000f, 4));
        entries1.add(new Entry(40.000f, 5));

        ArrayList<Entry> entries2 = new ArrayList<>();
        entries2.add(new Entry(70.000f, 0));
        entries2.add(new Entry(100.000f, 1));
        entries2.add(new Entry(30.000f, 2));
        entries2.add(new Entry(50.000f, 3));
        entries2.add(new Entry(80.000f, 4));
        entries2.add(new Entry(70.000f, 5));

        RadarDataSet radarDataSet1 = new RadarDataSet(entries1, "Company 1");
        RadarDataSet radarDataSet2 = new RadarDataSet(entries2, "Company 2");

        radarDataSet1.setColor(Color.GREEN);
        radarDataSet2.setColor(Color.BLUE);

        radarDataSet1.setDrawFilled(true);
        radarDataSet2.setDrawFilled(true);

        ArrayList<String> yAxis = new ArrayList<>();
        yAxis.add("Communication");
        yAxis.add("Technical Knowledge");
        yAxis.add("Team Player");
        yAxis.add("Meeting Deadline");
        yAxis.add("Problem Solving");
        yAxis.add("Punctuality");

        ArrayList<RadarDataSet> dataSets = new ArrayList<>();
        dataSets.add(radarDataSet1);
        dataSets.add(radarDataSet2);

        RadarData data = new RadarData(yAxis, dataSets);
        radarChart.setData(data);

        String desc = "Employee Skill Analsis";
        radarChart.setDescription(desc);
        radarChart.setWebLineWidthInner(0.5f);
        radarChart.setDescriptionColor(Color.RED);
        radarChart.invalidate();
        radarChart.animate();
        return view;
    }
}
