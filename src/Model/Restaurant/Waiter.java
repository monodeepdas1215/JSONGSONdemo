package Model.Restaurant;

import com.google.gson.Gson;

/**
 * Created by monodeep on 23/7/17.
 * Model class for Waiter
 */
public class Waiter {
    String name;
    int age;
    int salary;

    public Waiter(String n,int a,int s){
        name=n;
        age=a;
        salary=s;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
