package Model.Restaurant;

import Model.User.UserAddress;
import com.google.gson.Gson;

/**
 * Created by monodeep on 23/7/17.
 * Model class for Owner
 */
public class Owner {
    String name;

    UserAddress address;

    public Owner(String n,UserAddress a){
        name=n;
        address=a;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
