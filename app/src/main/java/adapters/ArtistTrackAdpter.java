package adapters;

import android.annotation.SuppressLint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.engenheiroamaro.kmuzik.R;

/**
 * Created by Engenheiro Amaro on 11/12/2017.
 */

public abstract class ArtistTrackAdapter extends RecyclerView.Adapter<ArtistTrackAdapter.ViewHolder> {



    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView mTrackCover;
        public TextView mArtistNmae;
        public TextView mTrackName;
        public ImageView mArtistVerifiedBadge;
        public ImageView mTrackDetails;

        @SuppressLint("WrongViewCast")
        public ViewHolder(View itemView){
            super(itemView);
            mTrackCover=itemView.findViewById(R.id.trackCover);
            mTrackDetails=itemView.findViewById(R.id.trackName);
        }

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

}
