/**
 * Created by izolotov on 15.04.17.
 */
public class DriverLicense implements Document {

    private final int number;
    private final String category;

    public DriverLicense(int number, String category) {
        this.number = number;
        this.category = category;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public String getCategory() {
        return category;
    }
}
