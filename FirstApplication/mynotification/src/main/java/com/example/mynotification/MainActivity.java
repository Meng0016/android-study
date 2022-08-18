package com.example.mynotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NotificationManager notificationManager;

    private Notification notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationManager= (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

        Intent intent = new Intent(this, NotificationActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);


        notification= new NotificationCompat.Builder(this,"meng")
                .setContentTitle("My Notification")
                .setContentText("This is my first notification")
                .setSmallIcon(R.drawable.ic_baseline_access_time_24)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.x))
                .setColor(Color.parseColor("#00ff00"))
                .setContentIntent(pendingIntent)
                .build();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
          NotificationChannel channel = new NotificationChannel("meng","测试通知", NotificationManager.IMPORTANCE_HIGH);

            notificationManager.createNotificationChannel(channel);

        }

    }

    public void sendNotification(View view) {
        notificationManager.notify(1,notification);
    }

    public void cacelNotification(View view) {

    }
}