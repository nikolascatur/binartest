package phone.nikolas.com.toko.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import java.util.List;

import javax.inject.Inject;

import phone.nikolas.com.toko.BaseApp;
import phone.nikolas.com.toko.R;
import phone.nikolas.com.toko.base.BaseActivity;
import phone.nikolas.com.toko.databinding.ActivityMainBinding;
import phone.nikolas.com.toko.db.RealmConnection;
import phone.nikolas.com.toko.model.People;

public class MainActivity extends BaseActivity<ActivityMainBinding,InputAddressViewModel,InputAddressPresenter>
        implements InputAdressView {

    @Inject
    RealmConnection realm;


    @Override
    protected void initInjection() {
        ((BaseApp)getApplication()).getmAppComponent().inject(this);

    }

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
    }

    @Override
    protected void initViewModel() {
        viewModel = new InputAddressViewModel();
        binding.setViewModel(viewModel);
    }

    @Override
    protected void initPresenter() {
        presenter = new InputAddressPresenter();
        presenter.setView(this);
        presenter.setViewModel(binding.getViewModel());
    }

    @Override
    protected void onViewReady(Bundle savedinstance) {
        InputAddressHandler handler = new InputAddressHandler();
        handler.setPresenter(presenter);
        binding.setHandler(handler);
        binding.listAddress.setLayoutManager(new LinearLayoutManager(this));

        realm.initRealm(this.getApplicationContext());
        presenter.updatePeopleList();
    }

    @Override
    public void updatePeopleList(List<People> peoples) {
        RvInputAddressAdapter adapter = new RvInputAddressAdapter(peoples);
        binding.listAddress.setAdapter(adapter);
    }

    @Override
    public void insertPeople(String nama, String alamat) {
        realm.insert(nama,alamat);
    }

    @Override
    public List<People> getAllPeople() {
        return realm.getAllData();
    }
}
