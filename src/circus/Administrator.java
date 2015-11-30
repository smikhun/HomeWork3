package circus;

/**
 * Created by Andriy on 26.11.2015.
 */
public class Administrator extends Employee implements IWork {

     Administrator(String name, String passportdate, double salary){
         super(name,passportdate,salary);

    }

    public void workingPeople(){
    }

    @Override
    public void Work() {
        System.out.print("Administrator Worked");

    }

    public void giveSalary(){

    }
}
