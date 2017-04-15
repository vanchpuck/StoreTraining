import java.util.HashMap;
import java.util.Map;

/**
 * Created by izolotov on 15.04.17.
 */
public class Store {

    Map<Integer, Integer> db;

    public Store() {
        db = new HashMap<>();
    }

//    public void giveCD(Passport pass, int id) {
//        db.put(pass.getNumber(), id);
//    }
//
//    public void giveCD(DriverLicense pass, int id) {
//        db.put(pass.getNumber(), id);
//    }
//
//    public void giveCD(ForeignerPassport pass, int id) {
//        db.put(pass.getNumber(), id);
//    }

    public void giveCD(Document doc, int id) {
        db.put(doc.getNumber(), id);
    }

    public static void main(String[] args) {
        Man alex = new Man(
                "Alex",
                new Passport(111, "FMS_200"),
                new DriverLicense(222, "B"));

        Store store = new Store();
        store.giveCD(alex.getPassport(), 99);

        store.giveCD(alex.getLicanse(), 100);
    }

}
