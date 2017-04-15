/**
 * Created by izolotov on 15.04.17.
 */
public class Man {

    private String name;
    private Passport passport;
    private DriverLicense licanse;

    public Man(String name, Passport pass, DriverLicense licanse) {
        this.passport = pass;
        this.name = name;
        this.licanse = licanse;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public DriverLicense getLicanse() {
        return licanse;
    }

    public void setLicanse(DriverLicense licanse) {
        this.licanse = licanse;
    }
}
