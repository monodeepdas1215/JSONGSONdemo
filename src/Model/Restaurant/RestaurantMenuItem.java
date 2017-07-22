package Model.Restaurant;

import com.google.gson.Gson;

/**
 * Created by monodeep on 23/7/17.
 * Model class to hold RestaurantMenuItem.
 */
public class RestaurantMenuItem
{
    String description;
    float price;

    public RestaurantMenuItem(String s, float v) {
        description=s;
        price=v;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
