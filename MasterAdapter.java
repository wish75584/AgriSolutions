package com.stubborn.android.agrisolutions;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MasterAdapter extends RecyclerView.Adapter<MasterAdapter.MasterViewHolder> {

    private Context mContext;
    private ArrayList<WorkMasterModule> mWModule;

    public MasterAdapter(Context context,ArrayList<WorkMasterModule> wModule){
        mContext = context;
        mWModule = wModule;
    }

    @NonNull
    @Override
    public MasterAdapter.MasterViewHolder onCreateViewHolder(@NonNull ViewGroup parents, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.work_report,parents,false);
        return  new MasterViewHolder(v);
        }

    @Override
    public void onBindViewHolder(@NonNull MasterAdapter.MasterViewHolder masterViewHolder, int i) {
        WorkMasterModule  currentItem  = mWModule.get(i);
         String wm_name =  currentItem.getWm_name();

        masterViewHolder.item_name.setText(wm_name);
    }

    @Override
    public int getItemCount() {

        return mWModule.size();
    }

    public class MasterViewHolder extends RecyclerView.ViewHolder {
        public TextView item_name;


        public MasterViewHolder(@NonNull View itemView) {
            super(itemView);
            item_name = itemView.findViewById(R.id.item_name);
        }
    }
}
