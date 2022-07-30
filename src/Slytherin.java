// факультет Слизерин
public class Slytherin extends Hogwarts {
    private int trick;  // хитрость
    private int resoluteness;   // решительность
    private int ambition;   // амбициозность
    private int quickness;  // находчивость
    private int lustForPower;   // жажда власти

    public Slytherin(String name, int magicPower, int distanceTransgression, int trick, int resoluteness, int ambition, int quickness, int lustForPower) {
        super(name, magicPower, distanceTransgression);
        this.trick = trick;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.quickness = quickness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getResoluteness() {
        return resoluteness;
    }

    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getQuickness() {
        return quickness;
    }

    public void setQuickness(int quickness) {
        this.quickness = quickness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public int getScoreAtFaculty() {
        return trick + resoluteness + ambition + quickness + lustForPower;
    }

    @Override
    public String getNameByNameFaculty() {
        return "Слизеринец";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nХитрость: " + trick + " баллов"
                + "\nРешительность: " + resoluteness + " баллов"
                + "\nАмбициозность: " + ambition + " баллов"
                + "\nНаходчивость: " + quickness + " баллов"
                + "\nЖажда власти: " + lustForPower + " баллов";
    }
}
