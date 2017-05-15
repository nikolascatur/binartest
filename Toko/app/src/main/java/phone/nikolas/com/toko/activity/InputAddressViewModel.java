package phone.nikolas.com.toko.activity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;

import phone.nikolas.com.toko.BR;


/**
 * Created by Pleret on 5/15/2017.
 */

public class InputAddressViewModel extends BaseObservable {
    private String name;
    private String address;
    private boolean isVisible;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
//        notifyChange();
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);
//        notifyChange();
    }

    @Bindable
    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }
}
