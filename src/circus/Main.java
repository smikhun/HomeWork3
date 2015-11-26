package circus;

/**
 * Created by Andriy on 26.11.2015.
 */
public class Main {
    public static void main(String[] args) {

        Gazel ciscus  = new Gazel(80, "Kyiv", 10);

        Administrator svnich = new Administrator("Vladimir Svsnovsch","me658945", 10000);

        Clown albert = new Clown("Albert","blf bkf",7000);
        Clown sasha = new Clown("Sasha","bla bla", 6000);
        Acrobat vasia = new Acrobat("Vasia","bla bla", 8000);

        ciscus.addWorker(albert);
        ciscus.addWorker(sasha);

        ciscus.showWorker();


    }
}
