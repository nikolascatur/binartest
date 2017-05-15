package phone.nikolas.com.toko.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Pleret on 5/15/2017.
 */

public abstract class BaseActivity<B,V,P> extends AppCompatActivity {
    protected B binding;
    protected V viewModel;
    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initInjection();
        initBinding();
        initViewModel();
        initPresenter();
        onViewReady(savedInstanceState);
    }

    protected abstract void initInjection();
    protected abstract void initBinding();
    protected abstract void initViewModel();
    protected abstract void initPresenter();
    protected abstract void onViewReady(Bundle savedinstance);
}
