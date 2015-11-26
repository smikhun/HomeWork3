package circus;

/**
 * Created by Andriy on 26.11.2015.
 */
public class Acrobat extends Employee {
    int alcoholLevel;

    Acrobat(String name, String passportdata,double salary){
        super(name,passportdata,salary);
        this.alcoholLevel = 0;
    }

    public int checkingAlcohol(Acrobat acrobat){
        acrobat.alcoholLevel = (int) (Math.random()*10);
        return acrobat.alcoholLevel;
    }
}
