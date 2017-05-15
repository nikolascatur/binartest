package phone.nikolas.com.toko;

import android.app.Application;


import phone.nikolas.com.toko.depen.componen.AppComponent;
import phone.nikolas.com.toko.depen.module.AppModule;
import phone.nikolas.com.toko.depen.module.DbModule;

/**
 * Created by Pleret on 5/15/2017.
 */

public class BaseApp extends Application {

    private AppComponent mAppComponent;
    @Override
    public void onCreate() {
        super.onCreate();

        setmAppComponent(DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .dbModule(new DbModule())
                .build());
    }

    public AppComponent getmAppComponent() {
        return mAppComponent;
    }

    public void setmAppComponent(AppComponent mAppComponent) {
        this.mAppComponent = mAppComponent;
    }


}
