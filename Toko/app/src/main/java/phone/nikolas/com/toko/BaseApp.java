package phone.nikolas.com.toko;

import android.app.Application;

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
                .networkModule(new NetworkModule())
                .databaseModule(new DatabaseModule())
                .build());
    }

    public AppComponent getmAppComponent() {
        return mAppComponent;
    }

    public void setmAppComponent(AppComponent mAppComponent) {
        this.mAppComponent = mAppComponent;
    }


}
