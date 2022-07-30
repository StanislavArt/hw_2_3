// факультет Гриффиндор
public class Gryffindor extends Hogwarts{
    private int nobility;   // благородство
    private int honour;  // честь
    private int brave;  // храбрость

    public Gryffindor(String name, int magicPower, int distanceTransgression, int nobility, int honour, int brave) {
        super(name, magicPower, distanceTransgression);
        this.nobility = nobility;
        this.honour = honour;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nБлагородство: " + nobility + " баллов"
                + "\nЧесть: " + honour + " баллов"
                + "\nХрабрость: " + brave + " баллов";
    }

    @Override
    public int getScoreAtFaculty() {
        return nobility + honour + brave;
    }

    @Override
    public String getNameByNameFaculty() {
        return "Гриффиндорец";
    }
}
