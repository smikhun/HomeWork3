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
        //this.workingStaff = new ArrayList<>();
        this.gas = gas;
        this.position = position;
        this.seatcsize = seatcsize;
    }

    public void addWorker(Worker worker){
        if(workingStaff.size() < seatcsize)
            { workingStaff.add(worker);
        }else {
            System.out.print("Sorry, no free seatc in you car");
        }

    }

    public void showWorker(){
        for (int i=0; i < workingStaff.size(); i++ ){
            System.out.println(workingStaff.get(i).name);
        }


    }

    public void ChengPosition(Gazel gazel, String goCyti){
        gazel.position = goCyti;
    }

    public  void cheking(){
        for (int i = 0; i < workingStaff.size(); i++){
            //if (workingStaff.get(i).name.)
        }
    }
}
