package Model.Founders;

import com.google.gson.Gson;

/**
 * Created by monodeep on 23/7/17.
 * Model class for Founder.
 */
public class Founder {
    String name;
    int flowerCount;

    public Founder(String n,int f){
        name=n;
        flowerCount=f;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}

