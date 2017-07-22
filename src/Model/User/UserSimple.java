package Model.User;

/**
 * Created by monodeep on 22/7/17.
 */
public class UserSimple {
    String name;
    String email;
    int age;
    boolean isDeveloper;

    public UserSimple(String s, String s1, int i, boolean b) {
        name=s;
        email=s1;
        age=i;
        isDeveloper=b;
    }

    @Override
    public String toString() {
        return new String("name : "+name+" email : "+email+" age : "+age+" isDev : "+isDeveloper);
    }
}
