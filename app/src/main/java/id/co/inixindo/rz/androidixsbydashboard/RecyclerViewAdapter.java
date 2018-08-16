package id.co.inixindo.rz.androidixsbydashboard;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by RZ on 6/9/2016.
 */
public class RecyclerViewAdapter extends
        RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    String[] titles;
    TypedArray icons;
    Context context;

    public RecyclerViewAdapter(String[] titles, TypedArray icons, Context context) {
        // constructor
        this.titles = titles;
        this.icons = icons;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView navTitle;
        ImageView navIcon;
        Context context;

        public ViewHolder(View drawerItem, int itemType, Context context) {
            super(drawerItem);
            this.context = context;
            drawerItem.setOnClickListener(this);

            if (itemType == 1){
                navTitle = (TextView)itemView.findViewById(R.id.tv_NavTitle);
                navIcon = (ImageView)itemView.findViewById(R.id.iv_NavIcon);
            }
        }

        // onClick ini digunakan untuk memilih setiap menu yg diklik
        @Override
        public void onClick(View v) {
            MainActivity mainActivity = (MainActivity)context;
            mainActivity.drawerLayout.closeDrawers();
            FragmentTransaction fragmentTransaction = mainActivity.getSupportFragmentManager()
                    .beginTransaction();

            switch (getPosition()){
                case 1:
                    Fragment squadFragment = new SquadFragment();
                    fragmentTransaction.replace(R.id.containerView, squadFragment);   //replace ke layout squad
                    fragmentTransaction.commit();
                    break;
                case 2:
                    Fragment fixtureFragment = new FixtureFragment();
                    fragmentTransaction.replace(R.id.containerView, fixtureFragment);   //replace ke layout squad
                    fragmentTransaction.commit();
                    break;
                case 3:
                    Fragment tableFragment = new TableFragment();
                    fragmentTransaction.replace(R.id.containerView, tableFragment);   //replace ke layout squad
                    fragmentTransaction.commit();
                    break;
                case 4:
                    Fragment transferFragment = new TransferFragment();
                    fragmentTransaction.replace(R.id.containerView, transferFragment);   //replace ke layout squad
                    fragmentTransaction.commit();
                    break;
                case 5:
                    Fragment galleryFragment = new GalleryFragment();
                    fragmentTransaction.replace(R.id.containerView, galleryFragment);   //replace ke layout squad
                    fragmentTransaction.commit();
                    break;
                case 6:
                    Fragment connectFragment = new ConnectFragment();
                    fragmentTransaction.replace(R.id.containerView, connectFragment);   //replace ke layout squad
                    fragmentTransaction.commit();
                    break;
            }
        }
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater)parent.getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (viewType == 1){
            View itemLayout = layoutInflater.inflate(R.layout.drawer_item_layout, null);
            return new ViewHolder(itemLayout, viewType, context);
        }
        else if (viewType == 0){
            View itemHeader = layoutInflater.inflate(R.layout.header_layout, null);
            return new ViewHolder(itemHeader, viewType, context);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (position != 0){
            holder.navTitle.setText(titles[position - 1]);
            holder.navIcon.setImageResource(icons.getResourceId(position - 1, -1));
        }
    }

    @Override
    public int getItemCount() {
        return titles.length + 1;
    }

    public int getItemViewType(int position) {
        if(position==0) return 0;
        else return 1;
    }
}
