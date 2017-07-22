package Model.User;

/**
 * Created by monodeep on 22/7/17.
 */
public class UserAddress
{
    String street;
    String houseNumber;
    String city;
    String country;

    public UserAddress(String st,String hs,String ci,String co){
        street=st;
        houseNumber=hs;
        city=ci;
        country=co;
    }

    @Override
    public String toString() {
        return new String("{\n\tstreet : "+street+"\n\tHouse_Num : "+houseNumber+"\n\tCity : "+city+"\n\tCountry : "+country+"\n}");
    }
}
