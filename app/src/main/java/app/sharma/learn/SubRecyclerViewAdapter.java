package app.sharma.learn;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubRecyclerViewAdapter extends RecyclerView.Adapter<SubRecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<subcategories> mData ;


    public SubRecyclerViewAdapter(Context mContext, List<subcategories> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public SubRecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.singlecardview,parent,false);
        return new SubRecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SubRecyclerViewAdapter.MyViewHolder holder, final int position) {
        final subcategories mc = mData.get(position);
        holder.title.setText(mData.get(position).getTitle());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,DetailActivity.class);

                // passing data to the book activity
                intent.putExtra("Title",mc.getTitle());
                intent.putExtra("Context",mc.getContext());
                intent.putExtra("VideoID",mc.getVideoId());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                // start the activity
                mContext.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        CardView cardView ;

        public MyViewHolder(View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.titlee) ;
            cardView = (CardView) itemView.findViewById(R.id.cardview_idd);


        }
    }


}


