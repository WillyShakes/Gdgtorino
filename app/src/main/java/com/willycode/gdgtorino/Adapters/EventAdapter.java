package com.willycode.gdgtorino.Adapters;

import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.willycode.gdgtorino.Model.Event;
import com.willycode.gdgtorino.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/**
 * Created by Manuel ELO'O on 03/05/2016.
 */
public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    private ArrayList<Event> mDataset;
    private Event event;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewDate;
        TextView textViewTitle;
        TextView textViewContent;

        public ViewHolder(View itemView) {
            super(itemView);
            this.textViewDate = (TextView) itemView.findViewById(R.id.data_textView);
            this.textViewTitle = (TextView) itemView.findViewById(R.id.title_textView);
            this.textViewContent = (TextView) itemView.findViewById(R.id.descr_textView);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public EventAdapter(ArrayList<Event> myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public EventAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_event, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder eventViewHolder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        event = mDataset.get(position);
        eventViewHolder.textViewDate.setText(getDate(Long.valueOf(event.getDate())));
        eventViewHolder.textViewTitle.setText(event.getTitle());
        eventViewHolder.textViewContent.setText(event.getContent());

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    private String getDate(long time) {
        Calendar cal = Calendar.getInstance(Locale.ITALIAN);
        cal.setTimeInMillis(time);
        String date = DateFormat.format("dd/MM/yyyy", cal).toString();
        return date;
    }
}
