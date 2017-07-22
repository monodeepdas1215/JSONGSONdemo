package Executables;

import Model.Restaurant.RestaurantMenuItem;
import Model.Restaurant.RestaurantWithMenu;
import com.google.gson.Gson;

import java.util.ArrayList;

/**
 * Created by monodeep on 23/7/17.
 * This class explains how the GSON works for items which contains Arrays or Lists within them as member elements.
 */
public class RestaurantSubArrayListDemo
{
    public static void main(String[] args) {
        try {

            Gson gson=new Gson();

            ArrayList<RestaurantMenuItem> menu = new ArrayList<>();
            menu.add(new RestaurantMenuItem("Roti", 7.99f));
            menu.add(new RestaurantMenuItem("Butter nan", 12.99f));
            menu.add(new RestaurantMenuItem("Salad", 5.99f));
            menu.add(new RestaurantMenuItem("Chicken Chowmin",100f));
            menu.add(new RestaurantMenuItem("Chicken Biriyani",150.50f));

            RestaurantWithMenu restaurantWithMenu=new RestaurantWithMenu("MaddyCodersLab",menu);

            String jsonStr = gson.toJson(restaurantWithMenu);

            System.out.println("RestaurantWithMenu"+jsonStr);

            System.out.println("Now decompiling the class");

            RestaurantWithMenu withMenu = gson.fromJson(jsonStr,RestaurantWithMenu.class);

            System.out.println(withMenu.toString());

            System.out.println("\nPrinting the menu:\n"+gson.toJson(menu));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
