/**
 * Created by izolotov on 15.04.17.
 */
public class ForeignerPassport implements Document {

    private int number;

    public ForeignerPassport(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return number;
    }
}
