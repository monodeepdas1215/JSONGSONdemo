package Executables;

import Model.User.UserAddress;
import Model.User.UserNested;
import com.google.gson.Gson;

/**
 * Created by monodeep on 22/7/17.
 * Main class to demonstrate the use of GSON to serializa/deserialize Nested Classes.
 */
public class NestedClassDemo
{
    public static void main(String[] args) {
        UserAddress myaddr = new UserAddress("S/O Sristidhar Das"," Jay Guru Lodge Road","Laldih, Ghatsila","India");

        UserNested userObject = new UserNested("Monodeep Das","monodeepdas112@gmail.com",true,21,myaddr);

        Gson gson= new Gson();

        String nestedUserJSON = gson.toJson(userObject);

        System.out.println(nestedUserJSON);

        UserNested newNestedUser = gson.fromJson(nestedUserJSON,UserNested.class);

        System.out.println("Now we will deserialize");
        System.out.println(newNestedUser.toString());

    }
}
