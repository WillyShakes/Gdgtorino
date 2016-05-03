package com.willycode.gdgtorino.Utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

/**
 * Created by Manuel ELO'O on 04/05/2016.
 */
public class LinkClickListener implements View.OnClickListener {
    private String url;
    private Context mContext;

    public LinkClickListener(Context c, String s) {
        url = s;
        mContext = c;
    }

    @Override
    public void onClick(View v) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(mContext.getPackageManager()) != null) {
            mContext.startActivity(intent);
        }
    }
}
