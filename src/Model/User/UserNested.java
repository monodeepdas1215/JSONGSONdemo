package Model.User;

/**
 * Created by monodeep on 22/7/17.
 */
public class UserNested
{
    String name;
    String email;
    boolean isDeveloper;
    int age;

    UserAddress userAddress;

    public UserNested(String n,String e,boolean d,int a,UserAddress ad){
        name=n;
        email=e;
        isDeveloper=d;
        age=a;
        userAddress=ad;
    }

    @Override
    public String toString() {
        return new String("{\n\tname : "+name+"\n\temail : "+email+"\n\tisDeveloper : "+isDeveloper+"\n\tage : "+age+"\n\tuserAddress : "+userAddress.toString()+"\n}");
    }
}
