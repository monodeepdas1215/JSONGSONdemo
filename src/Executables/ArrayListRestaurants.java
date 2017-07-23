package Executables;

import Model.Founders.Founder;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by monodeep on 23/7/17.
 * This class illustrates the handling of Lists as root objects for GSON.
 */
public class ArrayListRestaurants
{
    public static void main(String[] args) {
        try {
            Gson gson=new Gson();

            String founderJson = "[{'name': 'Christian','flowerCount': 1}, {'name': 'Marcus', 'flowerCount': 3}, {'name': 'Norman', 'flowerCount': 2}]";

            //we have a json string which is an ArrayList at root
            Founder[] founders=gson.fromJson(founderJson,Founder[].class);

            System.out.println("Printing all the instances in the array:");
            for (Founder founder :founders) {
                System.out.println(founder.toString());
            }


            Type founderListType = new TypeToken<ArrayList<Founder>>(){}.getType();

            List<Founder> founders1 = new Gson().fromJson(founderJson,founderListType);
            System.out.println("Printing all the instances in the array:");
            for (Founder founder :founders1) {
                System.out.println(founder.toString());
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
