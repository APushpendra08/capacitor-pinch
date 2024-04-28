package io.ionic.starter;

import android.app.Application;
import android.app.Application;
import com.moengage.capacitor.MoEInitializer;
import com.moengage.core.MoEngage;
import com.moengage.core.DataCenter;

import com.moengage.core.MoEngage;
import com.moengage.core.*;
import com.moengage.core.config.*;


public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        MoEngage.Builder moEngage = new MoEngage.Builder(this,"YOUR_APP_ID”,DataCenter.DATA_CENTER_1);
//        MoEInitializer.initialiseDefaultInstance(this, moEngage);

        MoEngage.Builder moengage = new MoEngage.Builder(this, "8SIW681S80Z08KSHQFSTIZ8T", DataCenter.DATA_CENTER_1);
        moengage.configureLogs(new LogConfig(LogLevel.VERBOSE, true));
        MoEInitializer.initialiseDefaultInstance(this, moengage);
    }
}
