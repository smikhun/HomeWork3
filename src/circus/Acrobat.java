package circus;

/**
 * Created by Andriy on 26.11.2015.
 */
public class Acrobat extends Employee implements IWork{
    int alcoholLevel;

    Acrobat(String name, String passportdata,double salary){
        super(name,passportdata,salary);
        this.alcoholLevel = (int) (Math.random()*10);
    }

    public int checkingAlcohol(Acrobat acrobat){
        return acrobat.alcoholLevel;
    }

    @Override
    public void Work() {
        System.out.println("Acrobat worked");
    }
}
