package phone.nikolas.com.toko.depen.componen;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import phone.nikolas.com.toko.activity.MainActivity;
import phone.nikolas.com.toko.depen.module.AppModule;
import phone.nikolas.com.toko.depen.module.DbModule;


/**
 * Created by Pleret on 5/15/2017.
 */

@Singleton
@Component(modules = {AppModule.class, DbModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);

}
