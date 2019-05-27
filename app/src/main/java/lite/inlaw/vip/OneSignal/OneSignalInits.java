package lite.inlaw.vip.OneSignal;

import android.app.Application;

import com.onesignal.OneSignal;

public class OneSignalInits extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
