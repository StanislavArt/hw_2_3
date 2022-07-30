// факультет Пуффендуй
public class Hufflepuff extends Hogwarts {
    private int industry;   // трудолюбие
    private int loyalty;    // верность
    private int probity;    // честность

    public Hufflepuff(String name, int magicPower, int distanceTransgression, int industry, int loyalty, int probity) {
        super(name, magicPower, distanceTransgression);
        this.industry = industry;
        this.loyalty = loyalty;
        this.probity = probity;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getProbity() {
        return probity;
    }

    public void setProbity(int probity) {
        this.probity = probity;
    }

    @Override
    public int getScoreAtFaculty() {
        return industry + loyalty + probity;
    }

    @Override
    public String getNameByNameFaculty() {
        return "Пуффендуец";
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nТрудолюбие: " + industry + " баллов"
                + "\nВерность: " + loyalty + " баллов"
                + "\nЧестность: " + probity + " баллов";
    }
}
