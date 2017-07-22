package Model.Restaurant;

import com.google.gson.Gson;

/**
 * Created by monodeep on 23/7/17.
 * Model class for Restaurant
 */
public class Restaurant {
    String name;

    Owner owner;
    Cook cook;
    Waiter waiter;

    public Restaurant(String n, Owner o, Cook c, Waiter w){
        name=n;
        owner=o;
        cook=c;
        waiter=w;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

