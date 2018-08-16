package id.co.inixindo.rz.androidixsbydashboard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by RZ on 9/9/2016.
 */
public class FixtureFragment extends Fragment {
    // variable GLOBAL
    ListView listView;
    String[] listgadget = {
            "Asus", "Acer", "Apple", "Samsung",
            "Toshiba", "Sony", "Lenovo",
            "Xiaomi", "Motorola", "Nexus",
            "LG", "Infinix", "Meizu", "Huawei"
    };

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fixture_layout, null);

        /*Toolbar toolbar = (Toolbar)view.findViewById(R.id.toolbar1);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);*/

        listView = (ListView)view.findViewById(R.id.list1);

        // buat adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getContext(), android.R.layout.simple_list_item_1,
                android.R.id.text1, listgadget
        );

        // set adapter
        listView.setAdapter(adapter);

        // event handling utk list view
        // jika salah satu array di pilih
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;

                String itemValue = (String)listView.getItemAtPosition(position);

                // tampilkan hasil dg Toast
                Toast.makeText(getContext(), "Position : "
                        + itemPosition +
                        " List item : " +
                        itemValue, Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}
