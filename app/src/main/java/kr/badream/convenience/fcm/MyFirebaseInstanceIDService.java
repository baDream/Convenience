package kr.badream.convenience.fcm;

import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by sk on 16. 8. 9..
 */
public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private final String TAG = "FIIDS";

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        //token : fo-JgIOFqJM:APA91bHj4E0hm5HkfZHSdeesH0Y1mI1LALcUUEQMw5gl8Zf0NTKXcvscdmJ7vMMzUu67i7ge80mf8HxYjS8Iv1des7Dy48706tdaGlhFsag7lBw0ROhPat8Ev8k0ozUa0vVK_5V79E6y

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String token) {
        // TODO: Implement this method to send token to your app server.
    }
}
