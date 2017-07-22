package Model.Restaurant;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by monodeep on 23/7/17.
 * Model class to hold RestaurantWithMenu.
 */
public class RestaurantWithMenu {
    String name;

    List<RestaurantMenuItem> menu;

    public RestaurantWithMenu(String s, ArrayList<RestaurantMenuItem> m) {
        name = s;
        menu=m;
    }
    //RestaurantMenuItem[] menu; // alternative, either one is fine


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
