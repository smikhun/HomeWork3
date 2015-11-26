package circus;

import java.util.ArrayList;

/**
 * Created by Andriy on 26.11.2015.
 */
public class Gazel {
    private ArrayList<Worker> workingStaff;
    private int gas;
    private String position;
    private int seatcsize;

    Gazel(int gas, String position, int seatcsize){
        this.workingStaff = new ArrayList<>();
        this.gas = gas;
        this.position = position;
        this.seatcsize = seatcsize;
    }

    public void addWorker(Worker worker){
        workingStaff.add(worker);

    }

    public void showWorker(){
        for (int i=0; i < workingStaff.size(); i++ ){
            System.out.println(workingStaff.get(i).name);
        }
    }
}
