package id.co.inixindo.rz.androidixsbydashboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.data.CandleData;
import com.github.mikephil.charting.data.CandleDataSet;
import com.github.mikephil.charting.data.CandleEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * Created by RZ on 9/17/2016.
 */
public class CandleStickChart extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_candlestick_chart, container, false);

        com.github.mikephil.charting.charts.CandleStickChart candleStickChart = (com.github.mikephil.charting.charts.CandleStickChart) view.findViewById(R.id.candlestickchart1);

        ArrayList<CandleEntry> entries = new ArrayList<>();
        entries.add(new CandleEntry(0, 4.62f, 2.02f, 2.70f, 4.13f));
        entries.add(new CandleEntry(1, 5.50f, 2.70f, 3.35f, 4.96f));
        entries.add(new CandleEntry(2, 5.25f, 3.02f, 3.50f, 4.50f));
        entries.add(new CandleEntry(3, 6f,    3.25f, 4.40f, 5.0f));
        entries.add(new CandleEntry(4, 5.57f, 2f,    2.80f, 4.5f));
        entries.add(new CandleEntry(5, 4.62f, 2.02f, 2.70f, 4.13f));
        entries.add(new CandleEntry(6, 5.50f, 2.70f, 3.35f, 4.96f));
        entries.add(new CandleEntry(7, 5.25f, 3.02f, 3.50f, 4.50f));
        entries.add(new CandleEntry(8, 6f,    3.25f, 4.40f, 5.0f));
        entries.add(new CandleEntry(9, 5.57f, 2f,    2.80f, 4.5f));
        entries.add(new CandleEntry(10, 6f,    3.25f, 4.40f, 5.0f));
        entries.add(new CandleEntry(11, 5.57f, 2f,    2.80f, 4.5f));

        CandleDataSet candleDataSet = new CandleDataSet(entries, "My Candle Stick Chart");
        candleDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

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

        CandleData data = new CandleData(yAxis, candleDataSet);
        candleStickChart.setData(data);
        candleStickChart.animateY(5000);
        return view;
    }
}
