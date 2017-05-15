package phone.nikolas.com.toko.activity;

import java.util.List;

import phone.nikolas.com.toko.model.Address;
import phone.nikolas.com.toko.model.People;

/**
 * Created by Pleret on 5/15/2017.
 */

public interface InputAdressView  {

    public void updatePeopleList(List<People> peoples);

    public void insertPeople(String nama,String alamat);

    public List<People> getAllPeople();

}
