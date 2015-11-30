package circus;

/**
 * Created by Andriy on 26.11.2015.
 */
public class TightropeWalker extends Employee implements IWork{
    TightropeWalker(String name, String passportdate, double salary){
        super(name,passportdate,salary);
    }

    @Override
    public void Work() {
        System.out.println("TightropeWalker worked");
    }
}
