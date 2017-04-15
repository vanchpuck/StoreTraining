/**
 * Created by izolotov on 15.04.17.
 */
public class Passport implements Document {

    private final int number;
    private final String departmentCode;

    public Passport(int number, String departmentCode) {
        this.number = number;
        this.departmentCode = departmentCode;
    }

    @Override
    public int getNumber() {
        return number;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
}
