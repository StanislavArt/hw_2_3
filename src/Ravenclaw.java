// факультет Когтевран
public class Ravenclaw extends Hogwarts {
    private int mind;   // ум
    private int wisdom;     // мудрость
    private int cuteness;   // остроумие
    private int creation;   // творчество

    public Ravenclaw(String name, int magicPower, int distanceTransgression, int mind, int wisdom, int cuteness, int creation) {
        super(name, magicPower, distanceTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.cuteness = cuteness;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCuteness() {
        return cuteness;
    }

    public void setCuteness(int cuteness) {
        this.cuteness = cuteness;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public int getScoreAtFaculty() {
        return mind + wisdom + cuteness + creation;
    }

    @Override
    public String getNameByNameFaculty() {
        return "Когтевранец";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nУм: " + mind + " баллов"
                + "\nМудрость: " + wisdom + " баллов"
                + "\nОстроумие: " + cuteness + " баллов"
                + "\nТворчество: " + creation + " баллов";
    }
}
