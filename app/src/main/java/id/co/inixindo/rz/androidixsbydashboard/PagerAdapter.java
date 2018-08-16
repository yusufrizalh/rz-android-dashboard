package id.co.inixindo.rz.androidixsbydashboard;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int myNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.myNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                BarVerticalChart barVerticalChart = new BarVerticalChart();
                return barVerticalChart;
            case 1:
                BarHorizontalChart barHorzontalChart= new BarHorizontalChart();
                return barHorzontalChart;
            case 2:
                LineChartt lineChart= new LineChartt();
                return lineChart;
            case 3:
                PieChart pieChart= new PieChart();
                return pieChart;
            case 4:
                CombinedChart combinedChart = new CombinedChart();
                return combinedChart;
            case 5:
                BubbleChart bubbleChart= new BubbleChart();
                return bubbleChart;
            case 6:
                RadarChart radarChart= new RadarChart();
                return radarChart;
            case 7:
                ScatterChart scatterChart= new ScatterChart();
                return scatterChart;
            case 8:
                CandleStickChart candleStickChart= new CandleStickChart();
                return candleStickChart;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return myNumOfTabs;
    }
}
