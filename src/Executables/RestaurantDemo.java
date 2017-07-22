package Executables;

import Model.Restaurant.Cook;
import Model.Restaurant.Owner;
import Model.Restaurant.Restaurant;
import Model.Restaurant.Waiter;
import Model.User.UserAddress;
import com.google.gson.Gson;

/**
 * Created by monodeep on 23/7/17.
 * Demo to illustrate serializaion and deserialization of nested classes.
 */
public class RestaurantDemo
{
    public static void main(String[] args) {

        Gson gson = new Gson();

        Restaurant mRestaurant = new Restaurant("MaddyCodersLab",
                new Owner("Monodeep Das",
                        new UserAddress("S/O Sristidhar Das",
                                "Jay Guru Lodge Road",
                                "Laldih, Ghatsila","India")),new Cook("Mr. Cook",22,20000),new Waiter("Mr. Waiter",20,10000));

        System.out.println("mRestaurant contains:\n"+gson.toJson(mRestaurant));


        System.out.println("Reading another JSON");
        String restaurantJson = "{ 'name':'Future Studio Steak House', 'owner':{ 'name':'Christian', 'address':{ 'city':'Magdeburg', 'country':'Germany', 'houseNumber':'42', 'street':'Main Street'}},'cook':{ 'age':18, 'name': 'Marcus', 'salary': 1500 }, 'waiter':{ 'age':18, 'name': 'Norman', 'salary': 1000}}";
        System.out.println(restaurantJson);


        Restaurant myRestaurant = gson.fromJson(restaurantJson,Restaurant.class);

        System.out.println("Now deserializing the 1st object");
        System.out.println(mRestaurant.toString());

        System.out.println("Now deserializing the 2nd object");
        System.out.println(myRestaurant.toString());
    }
}
