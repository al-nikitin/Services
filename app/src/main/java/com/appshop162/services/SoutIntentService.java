package com.appshop162.services;

import android.app.IntentService;
import android.content.Intent;

public class SoutIntentService extends IntentService {

    public SoutIntentService() {
        super("SoutIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        int imageNumber = intent.getIntExtra("imageNumber", 0);
        System.out.println(imageNumber);
    }
}
