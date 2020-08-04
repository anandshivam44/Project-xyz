package com.invig.indiastatusapp.ui.Activities;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.invig.indiastatusapp.R;


import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;
public class SplashActivity extends AppCompatActivity {

    private ProgressBar intro_progress;

    private static final String LOG_TAG = "iabv3";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        intro_progress=(ProgressBar)  findViewById(R.id.intro_progress);
        Timer myTimer = new Timer();
        myTimer.schedule(new TimerTask() {
            @Override
            public void run() {
                // If you want to modify a view in your Activity
                SplashActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(SplashActivity.this,SlideActivity.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.enter, R.anim.exit);
                        finish();


                    }
                });
            }
        }, 3000);

    }

    private void checkAccount() {

        Integer version = -1;
        try {
            PackageInfo pInfo = this.getPackageManager().getPackageInfo(getPackageName(), 0);
            version = pInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

    }
}
