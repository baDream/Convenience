package kr.badream.convenience.fcm;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by sk on 16. 8. 9..
 */
public class MyFirebaseAnalytics {

    public static final int CSTORE = 1;
    public static final int PROD = 2;

    public static FirebaseAnalytics mFirebaseAnalytics;

    public MyFirebaseAnalytics(Context mContext){
        if( mFirebaseAnalytics == null){
            mFirebaseAnalytics = FirebaseAnalytics.getInstance(mContext);
        }
    }

    public static FirebaseAnalytics getInstance(Context mContext){
        if( mFirebaseAnalytics == null){
            mFirebaseAnalytics = FirebaseAnalytics.getInstance(mContext);
        }
        return mFirebaseAnalytics;
    }

    public static void sendLog(Context mContext, int flag, int id, String name){
        Bundle bundle = new Bundle();
        bundle.putInt(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);

        switch (flag){
            case CSTORE:
                getInstance(mContext).logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                break;

            case PROD:
                getInstance(mContext).logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
                break;
        }
    }
}
