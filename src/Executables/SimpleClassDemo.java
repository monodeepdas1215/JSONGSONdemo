package Executables;

import Model.User.UserSimple;
import com.google.gson.Gson;

/**
 * Created by monodeep on 22/7/17.
 * Main class to demonstrate the use of GSON to serializa/deserialize simple class.
 */
public class SimpleClassDemo
{
    public static void main(String[] args) {
        UserSimple userSimple=new UserSimple("Monodeep Das","monodeepdas112@gmail.com",21,true);
        Gson gson = new Gson();

        String userSimpleJSON = gson.toJson(userSimple);
        System.out.println(userSimpleJSON);

        System.out.println("Now we will deserialize");

        UserSimple newUser = gson.fromJson(userSimpleJSON,UserSimple.class);
        System.out.println(newUser.toString());
    }
}
