package com.led_on_off.led;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class AboutActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void fb(View view)
    {
        Intent fbIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mayoogh"));
        startActivity(fbIntent);
    }

    public void tweet(View view)
    {
        Intent tweetIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/mayoogh1997/"));
        startActivity(tweetIntent);
    }

    public void insta(View view)
    {
        Intent instaIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mayoogh/"));
        startActivity(instaIntent);
    }


    public void web(View view)
    {
        Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mayooghgirish.ml"));
        startActivity(webIntent);
    }
}
