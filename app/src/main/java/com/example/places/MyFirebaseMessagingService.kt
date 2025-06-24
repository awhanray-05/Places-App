package com.example.places

import android.annotation.SuppressLint
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Build
import android.util.Log
import android.widget.RemoteViews
import androidx.core.app.NotificationCompat
import com.example.places.carappservice.R
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

const val channelId = "notification_channel"
const val channelName = "com.example.places"

class MyFirebaseMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Log.d("TAG", "Refreshed token: $token")
    }

    @SuppressLint("RemoteViewLayout")
    fun getRemoteView(title: String, message: String): RemoteViews {
        val remoteView = RemoteViews("com.example.android.cars.places", com.example.android.cars.places.R.layout.notification)

        remoteView.setTextViewText(com.example.android.cars.places.R.id.title, title)
        remoteView.setTextViewText(com.example.android.cars.places.R.id.message, message)
//        remoteView.setImageViewResource(R.id.app_logo, R.drawable.applogo)

        return remoteView
    }

    // Generate the notification
    fun generateNotification(title: String, message: String) {

        // create an intent for the notification, when notification is clicked, the app opens
        val intent = Intent(this, MainActivity::class.java)

        // clears all the previous activities and puts the current activity at the top
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        // So that the notification appears for once and gets destroyed after the User clicks on it
//        val pendingIntent = PendingIntent.getActivity(this, 0, intent,
//            PendingIntent.FLAG_ONE_SHOT or PendingIntent.FLAG_IMMUTABLE)

        // Use FLAG_UPDATE_CURRENT instead of FLAG_ONE_SHOT
        val pendingIntent = PendingIntent.getActivity(
            this,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val largeIcon = BitmapFactory.decodeResource(resources, R.drawable.baseline_navigation_24)
        // Channel Id and the Channel Name
        var builder: NotificationCompat.Builder = NotificationCompat.Builder(applicationContext, channelId)
            .setSmallIcon(R.drawable.baseline_navigation_24)
            .setLargeIcon(largeIcon)
            .setAutoCancel(true)
            .setVibrate(longArrayOf(1000,500,1000,500)) // Vibrates for 1 sec and then relaxes for 0.5 sec and so on
            .setOnlyAlertOnce(true)
            .setContentIntent(pendingIntent)

        // Attach the notification created with the custom notification layout
        builder = builder.setContent(getRemoteView(title, message))

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Check if the Client's version of android is greater then or equal to Android Oreo or not, as such Notifications features are supported only for those type of devices only
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { // => This is O(capital letter o) here not 0(Zero)
            val notificationChannel = NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_HIGH)
            notificationManager.createNotificationChannel(notificationChannel)
        }

        // Notify the user
        notificationManager.notify(0, builder.build())
    }

    // Show the notification
    override fun onMessageReceived(message: RemoteMessage) {
        if(message.getNotification() != null) {
            generateNotification(message.notification!!.title!!, message.notification!!.body!!) // !! => Non-null assertion operator(Makes the obtained result Null-safe)
        }
    }

}