package id.co.inixindo.rz.androidixsbydashboard;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import java.util.ArrayList;

/**
 * Created by RZ on 9/17/2016.
 */
public class BarVerticalChart extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_bar_vertical, container, false);

        BarChart chart = (BarChart)view.findViewById(R.id.chart);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        LimitLine line = new LimitLine(100.000f);

        chart.setData(data);
        chart.setDescription("My Chart");
        chart.animateXY(5000, 5000);
        chart.saveToGallery("mychart.jpg", 85);
        chart.invalidate();

        return view;
    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        // valueSet1 untuk acv 1
        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(110.000f, 0);          // JAN
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(40.000f, 1);          // FEB
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(80.000f, 2);          // MAR
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(30.000f, 3);          // APR
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(100.000f, 4);          // MAY
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(70.000f, 5);          // JUN
        valueSet1.add(v1e6);
        BarEntry v1e7 = new BarEntry(50.000f, 6);          // JUL
        valueSet1.add(v1e7);
        BarEntry v1e8 = new BarEntry(115.000f, 7);          // AUG
        valueSet1.add(v1e8);
        BarEntry v1e9 = new BarEntry(90.000f, 8);          // SEP
        valueSet1.add(v1e9);
        BarEntry v1e10 = new BarEntry(70.000f, 9);          // OCT
        valueSet1.add(v1e10);
        BarEntry v1e11 = new BarEntry(90.000f, 10);          // NOV
        valueSet1.add(v1e11);
        BarEntry v1e12 = new BarEntry(100.000f, 11);          // DEC
        valueSet1.add(v1e12);

        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "LX I");
        barDataSet1.setColor(Color.rgb(0, 115, 0));

        // valueSet2 untuk acv 2
        ArrayList<BarEntry> valueSet2 = new ArrayList<>();
        BarEntry v2e1 = new BarEntry(70.000f, 0);          // JAN
        valueSet2.add(v2e1);
        BarEntry v2e2 = new BarEntry(30.000f, 1);          // FEB
        valueSet2.add(v2e2);
        BarEntry v2e3 = new BarEntry(90.000f, 2);          // MAR
        valueSet2.add(v2e3);
        BarEntry v2e4 = new BarEntry(100.000f, 3);          // APR
        valueSet2.add(v2e4);
        BarEntry v2e5 = new BarEntry(50.000f, 4);          // MAY
        valueSet2.add(v2e5);
        BarEntry v2e6 = new BarEntry(90.000f, 5);          // JUN
        valueSet2.add(v2e6);
        BarEntry v2e7 = new BarEntry(120.000f, 6);          // JUL
        valueSet2.add(v2e7);
        BarEntry v2e8 = new BarEntry(100.000f, 7);          // AUG
        valueSet2.add(v2e8);
        BarEntry v2e9 = new BarEntry(60.000f, 8);          // SEP
        valueSet2.add(v2e9);
        BarEntry v2e10 = new BarEntry(90.000f, 9);          // OCT
        valueSet2.add(v2e10);
        BarEntry v2e11 = new BarEntry(70.000f, 10);          // NOV
        valueSet2.add(v2e11);
        BarEntry v2e12 = new BarEntry(80.000f, 11);          // DEC
        valueSet2.add(v2e12);

        BarDataSet barDataSet2 = new BarDataSet(valueSet2, "LX II");
        barDataSet2.setColor(Color.rgb(255, 0, 0));

        // valueSet3 untuk acv 3
        ArrayList<BarEntry> valueSet3 = new ArrayList<>();
        BarEntry v3e1 = new BarEntry(100.000f, 0);          // JAN
        valueSet3.add(v3e1);
        BarEntry v3e2 = new BarEntry(130.000f, 1);          // FEB
        valueSet3.add(v3e2);
        BarEntry v3e3 = new BarEntry(70.000f, 2);          // MAR
        valueSet3.add(v3e3);
        BarEntry v3e4 = new BarEntry(50.000f, 3);          // APR
        valueSet3.add(v3e4);
        BarEntry v3e5 = new BarEntry(90.000f, 4);          // MAY
        valueSet3.add(v3e5);
        BarEntry v3e6 = new BarEntry(70.000f, 5);          // JUN
        valueSet3.add(v3e6);
        BarEntry v3e7 = new BarEntry(90.000f, 6);          // JUL
        valueSet3.add(v3e7);
        BarEntry v3e8 = new BarEntry(110.000f, 7);          // AUG
        valueSet3.add(v3e8);
        BarEntry v3e9 = new BarEntry(120.000f, 8);          // SEP
        valueSet3.add(v3e9);
        BarEntry v3e10 = new BarEntry(70.000f, 9);          // OCT
        valueSet3.add(v3e10);
        BarEntry v3e11 = new BarEntry(90.000f, 10);          // NOV
        valueSet3.add(v3e11);
        BarEntry v3e12 = new BarEntry(70.000f, 11);          // DEC
        valueSet3.add(v3e12);

        BarDataSet barDataSet3 = new BarDataSet(valueSet3, "LX III");
        barDataSet3.setColor(Color.rgb(0, 0, 255));

        // meletakkan grafik dalam array
        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        dataSets.add(barDataSet2);
        dataSets.add(barDataSet3);

        return dataSets;
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
