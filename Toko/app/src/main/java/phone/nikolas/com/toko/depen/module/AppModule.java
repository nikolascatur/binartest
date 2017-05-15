package phone.nikolas.com.toko.depen.module;

import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Pleret on 5/15/2017.
 */
@Module
public class AppModule {
    private Context context;

    public AppModule(Context context){
        this.context = context;
    }

    @Provides
    @Singleton
    @SuppressWarnings("unused")
    public Context providesContext() {
        return context;
    }

}
