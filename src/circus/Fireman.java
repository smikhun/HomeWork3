package circus;

/**
 * Created by Andriy on 26.11.2015.
 */
public class Fireman extends Employee implements IWork{

    Fireman(String name, String passportdata, double salary){
        super(name,passportdata,salary);
    }

    @Override
    public void Work() {
        System.out.println("Fireman worked");
    }
}
