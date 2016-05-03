package com.willycode.gdgtorino.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.willycode.gdgtorino.Model.TeamMember;
import com.willycode.gdgtorino.R;
import com.willycode.gdgtorino.Utils.LinkClickListener;

import java.util.ArrayList;

/**
 * Created by Manuel ELO'O on 03/05/2016.
 */
public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {
    private final Context mContext;
    private ArrayList<TeamMember> mDataset;
    private TeamMember member;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView foto;
        TextView nameTextView;
        ImageView gplus;
        ImageView github;
        ImageView facebook;
        ImageView twitter;

        public ViewHolder(View itemView) {
            super(itemView);
            this.foto = (ImageView) itemView.findViewById(R.id.foto);
            this.nameTextView = (TextView) itemView.findViewById(R.id.name_textView);
            this.gplus = (ImageView) itemView.findViewById(R.id.gplus);
            this.github = (ImageView) itemView.findViewById(R.id.github);
            this.facebook= (ImageView) itemView.findViewById(R.id.facebook);
            this.twitter = (ImageView) itemView.findViewById(R.id.twitter);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public TeamAdapter(ArrayList<TeamMember> myDataset, Context c) {
        mDataset = myDataset;
        mContext = c;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public TeamAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_team_member, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder eventViewHolder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        member = mDataset.get(position);
        String linkPhoto = member.getPic();
        if(linkPhoto != null)
        {
            Picasso.with(mContext).load(linkPhoto).resize(300, 300).centerCrop().into(eventViewHolder.foto);
        }
        else
        {
            eventViewHolder.foto.setVisibility(View.GONE);
        }
        eventViewHolder.nameTextView.setText(member.getName());
        String linkGplus = member.getGplus();
        if(linkGplus != null)
        {
            eventViewHolder.gplus.setOnClickListener(new LinkClickListener(mContext,linkGplus));
        }
        else
        {
            eventViewHolder.gplus.setVisibility(View.GONE);
        }
        String linkGithub = null;
        if(linkGithub != null)
        {
            eventViewHolder.github.setOnClickListener(new LinkClickListener(mContext,linkGithub));
        }
        else
        {
            eventViewHolder.github.setVisibility(View.GONE);
        }
        String linkFacebook = member.getFacebook();
        if(linkFacebook != null)
        {
            eventViewHolder.facebook.setOnClickListener(new LinkClickListener(mContext,linkFacebook));
        }
        else
        {
            eventViewHolder.facebook.setVisibility(View.GONE);
        }

        String linkTwitter = member.getTwitter();
        if(linkTwitter != null)
        {
            eventViewHolder.twitter.setOnClickListener(new LinkClickListener(mContext,linkTwitter));
        }
        else
        {
            eventViewHolder.twitter.setVisibility(View.GONE);
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }


}
