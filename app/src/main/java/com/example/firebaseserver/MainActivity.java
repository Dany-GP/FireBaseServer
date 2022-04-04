package com.example.firebaseserver;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;


import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseOptions options = null;
        try {
            options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.getApplicationDefault())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }



        FirebaseApp.initializeApp(options);


        //enviarMensaje();
    }

    public void enviarMensaje() {
        // This registration token comes from the client FCM SDKs.
        String registrationToken = "ddwehevsSl-mm4HlvlEO7P:APA91bEMKotuY6Tl7XkBm8GyQ9l1e8RGfb11IH6NxQiWcFQusYBmMF-PwPPQpvMm5J-MyXRtjDv7tx2JkWB8dwUf2l8kLgarZuTID_hQj1g6IIez3Yqgp2JKmzFAXaQHU_fOq8A1r30y";

        // See documentation on defining a message payload.
        Message message = Message.builder()
                .putData("score", "850")
                .putData("time", "2:45")
                .setTopic("perronegro")
                .build();


        // Send a message to the device corresponding to the provided
        // registration token.
        /*String response = null;
        try {
            response = FirebaseMessaging.getInstance().send(message);
            // Response is a message ID string.
            System.out.println("Successfully sent message: " + response);
        } catch (FirebaseMessagingException e) {
            e.printStackTrace();
        }*/
    }

}