package phone.nikolas.com.rxjavasamplemvvm.depen.componen;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import phone.nikolas.com.rxjavasamplemvvm.activity.detailnote.DetailNoteActivity;
import phone.nikolas.com.rxjavasamplemvvm.activity.inputaddress.InputAddressActivity;
import phone.nikolas.com.rxjavasamplemvvm.activity.main.MainActivity;
import phone.nikolas.com.rxjavasamplemvvm.activity.note.NoteActivity;
import phone.nikolas.com.rxjavasamplemvvm.activity.rective.ReactiveActivity;
import phone.nikolas.com.rxjavasamplemvvm.depen.module.AppModule;
import phone.nikolas.com.rxjavasamplemvvm.depen.module.DatabaseModule;
import phone.nikolas.com.rxjavasamplemvvm.depen.module.DbModule;
import phone.nikolas.com.rxjavasamplemvvm.depen.module.NetworkModule;
import phone.nikolas.com.rxjavasamplemvvm.model.Notes;

/**
 * Created by Pleret on 5/15/2017.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(MainActivity mainActivity);
    void inject(InputAddressActivity inputAddressActivity);
    void inject(NoteActivity noteActivity);
    void inject(DetailNoteActivity detailNoteActivity);
    void inject(ReactiveActivity reactiveActivity);

    Notes getNotes();
}
