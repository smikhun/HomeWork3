package circus;

/**
 * Created by Andriy on 26.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        Gazel circus  = new Gazel(80, "Kyiv", 10);

        Administrator svnich = new Administrator("Vladimir Svsnovsch","me658945", 10000);

        Employee albert = new Clown("Albert","blf bkf",8000);
        Employee sasha = new Clown("Sasha","bla bla", 8000);
        Employee vasia = new Acrobat("Vasia","bla bla", 8000);

        circus.addWorker(albert);
        circus.addWorker(sasha);
        circus.addWorker(vasia);

        circus.showWorker();
        circus.chengPosition("lvov");

        System.out.print(circus.getPosition());

        circus.showWorker();
    }
}
