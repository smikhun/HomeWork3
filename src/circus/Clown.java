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

    public Clown getClown(Clown clown){
        return clown;
    }

    public void addClown(){

    }

    public void Work(){
         System.out.println("Clown worked");
        addExp();

    }

    public void addExp(){
        experience +=1;
    }
}
