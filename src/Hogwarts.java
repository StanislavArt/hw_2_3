public abstract class Hogwarts {
    private String name;
    private int magicPower;
    private int distanceTransgression;

    public Hogwarts(String name, int magicPower, int distanceTransgression) {
        this.magicPower = magicPower;
        this.distanceTransgression = distanceTransgression;
        this.name = name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    public void setDistanceTransgression(int distanceTransgression) {
        this.distanceTransgression = distanceTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName()
                + "\nМощность магии: " + getMagicPower() + " баллов"
                + "\nРасстояние трансгресии: " + getDistanceTransgression();
    }

    public void printStudent() {
        System.out.println(this);
    }
    public void compareStudentsAtFaculty(Hogwarts student) {
        if(this.getClass() != student.getClass()) {
            System.out.println("Ученики " + this.getName() + " и " + student.getName() + " с разных факультетов.");
            return;
        }
        if (this == student) {
            System.out.println("Для сравнения нужно указать ученика отличного от себя");
            return;
        }

        int scoreThisStudent = this.getScoreAtFaculty();
        int scoreParameterStudent = student.getScoreAtFaculty();

        if (scoreThisStudent > scoreParameterStudent) {
            System.out.println(this.getName() + " лучший " + this.getNameByNameFaculty() + ", чем " + student.getName());
        } else if (scoreThisStudent < scoreParameterStudent) {
            System.out.println(student.getName() + " лучший " + student.getNameByNameFaculty() + ", чем " + this.getName());
        } else {
            System.out.println(this.getName() + " и " + student.getName() + " имеют одинаковое количество баллов");
        }
    }
    public abstract int getScoreAtFaculty();
    public abstract String getNameByNameFaculty();

    public void compareStudentsAtSchool(Hogwarts student) {
        if (this == student) {
            System.out.println("Для сравнения нужно указать ученика отличного от себя");
            return;
        }

        // Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит.
        if(this.getMagicPower() > student.getMagicPower()) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else if (this.getMagicPower() < student.getMagicPower()) {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(student.getName() + " и " + this.getName() + " обладают одинаковой мощностью магии");
        }

        if(this.getDistanceTransgression() > student.getDistanceTransgression()) {
            System.out.println(this.getName() + " обладает большим расстоянием трансгресии, чем " + student.getName());
        } else if (this.getDistanceTransgression() < student.getDistanceTransgression()) {
            System.out.println(student.getName() + " обладает большим расстоянием трансгресии, чем " + this.getName());
        } else {
            System.out.println(student.getName() + " и " + this.getName() + " обладают одинаковым расстоянием трансгресии");
        }
    }
}
