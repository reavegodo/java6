public class Wilder {

    // attributs
    private String firstName;
    private boolean aware;

    // constructeur
    public Wilder(String name, boolean aware) {
        this.firstName = name;
        this.aware = aware;
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }
    public boolean isAware() {
        return this.aware;
    }

    // setters
    public void setName(String name) {
        this.firstName = name;
    }
    
    public void isAware(boolean aware) {
        this.aware = aware;
    }

    // methode
    public String whoAmI() {
        if (this.aware == true) {
            return "Je m'appelle " + this.firstName + " et je suis aware";
        } else {
            return "Je m'appelle " + this.firstName + " et je ne suis pas aware";
        }
    }
}
