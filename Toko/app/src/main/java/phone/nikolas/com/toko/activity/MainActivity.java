package phone.nikolas.com.toko.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import phone.nikolas.com.toko.BaseApp;
import phone.nikolas.com.toko.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void initInjection() {
        ((BaseApp)getApplication()).getmAppComponent().inject(this);

    }

    @Override
    protected void initBinding() {
        binding = DataBindingUtil.setContentView(InputAddressActivity.this, R.layout.activity_input);
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
