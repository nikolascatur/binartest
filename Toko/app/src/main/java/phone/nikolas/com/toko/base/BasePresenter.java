package phone.nikolas.com.toko.base;

/**
 * Created by Pleret on 5/15/2017.
 */

public abstract class BasePresenter<V,VM> {
    public V view;
    public VM viewModel;

    public void setView(V view) {
        this.view = view;
    }

    public void setViewModel(VM viewModel) {
        this.viewModel = viewModel;
    }
}
