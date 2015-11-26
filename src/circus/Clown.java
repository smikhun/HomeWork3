package circus;

/**
 * Created by Andriy on 26.11.2015.
 */
public class Clown extends Employee implements IWork {
   public int experience;

    public Clown (String name, String passportdate, double salary){
      super(name,passportdate,salary);
        this.experience = 0;

    }

    public ua.artcode.circus.Clown getClown(ua.artcode.circus.Clown clown){
        return clown;
    }

    public void Work(Employee workname){
        workname.ex +=1 ;
    }
}
