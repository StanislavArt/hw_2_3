import java.util.Date;
import java.util.Random;

/**
Названия факультетов даны в соответствии с оригинальным текстом:
 Gryffindor - Гриффиндор
 Hufflepuff - Пуффендуй
 Ravenclaw - Когтевран
 Slytherin - Слизерин

 Функции equals() и hashCode() не переопределял, чтобы уменьшить загруженность кода.

 Функция getRandomValue() вынесена отдельно в main(), так как не входит в логику разрабатываемых классов
 и нужна только для случайного заполнения.
 */
public class Main {
    public static void main(String[] args) {
        Random randomGenerator = new Random(new Date().getTime());
        int[] properties = new int[10];  // вспомогательный массив для занесения свойств студентов

        // создание студентов
        fillRandomProperties(randomGenerator, properties, 3);
        Hogwarts studentGarryPotter = new Gryffindor("Гарри Поттер", properties[0], properties[1], properties[2], properties[3], properties[4]);

        fillRandomProperties(randomGenerator, properties, 3);
        Hogwarts studentGermionaGrainger = new Gryffindor("Гермиона Грейнджер", properties[0], properties[1], properties[2], properties[3], properties[4]);

        fillRandomProperties(randomGenerator, properties, 3);
        Hogwarts studentRonWisly = new Gryffindor("Рон Уизли", properties[0], properties[1], properties[2], properties[3], properties[4]);

        fillRandomProperties(randomGenerator, properties, 5);
        Hogwarts studentDrakoMalfow = new Slytherin("Драко Малфой", properties[0], properties[1], properties[2], properties[3], properties[4], properties[5], properties[6]);

        fillRandomProperties(randomGenerator, properties, 5);
        Hogwarts studentGrahemMontegue = new Slytherin("Грэхэм Монтегю", properties[0], properties[1], properties[2], properties[3], properties[4], properties[5], properties[6]);

        fillRandomProperties(randomGenerator, properties, 5);
        Hogwarts studentGregoryGoyl = new Slytherin("Грегори Гойл", properties[0], properties[1], properties[2], properties[3], properties[4], properties[5], properties[6]);

        fillRandomProperties(randomGenerator, properties, 3);
        Hogwarts studentZahariaSmit = new Hufflepuff("Захария Смит", properties[0], properties[1], properties[2], properties[3], properties[4]);

        fillRandomProperties(randomGenerator, properties, 3);
        Hogwarts studentSedrickDiggory = new Hufflepuff("Седрик Диггори", properties[0], properties[1], properties[2], properties[3], properties[4]);

        fillRandomProperties(randomGenerator, properties, 3);
        Hogwarts studentJastinFinchFletchly = new Hufflepuff("Джастин Финч-Флетчли", properties[0], properties[1], properties[2], properties[3], properties[4]);

        fillRandomProperties(randomGenerator, properties, 4);
        Hogwarts studentChzouChang = new Ravenclaw("Чжоу Чанг", properties[0], properties[1], properties[2], properties[3], properties[4], properties[5]);

        fillRandomProperties(randomGenerator, properties, 4);
        Hogwarts studentPadmaPatil = new Ravenclaw("Падма Патил", properties[0], properties[1], properties[2], properties[3], properties[4], properties[5]);

        fillRandomProperties(randomGenerator, properties, 4);
        Hogwarts studentMarcusBelby = new Ravenclaw("Маркус Белби", properties[0], properties[1], properties[2], properties[3], properties[4], properties[5]);

        // тестирование вывода на экран описания студента
        System.out.println(studentGarryPotter + "\n\n" + studentSedrickDiggory + "\n");

        // тестирование функции сравнения студентов одного факультета
        studentGarryPotter.compareStudentsAtFaculty(studentMarcusBelby);  // ожидается: вывод предупрежждения, что студенты с разных факультетов
        studentGrahemMontegue.compareStudentsAtFaculty(studentDrakoMalfow);
        studentPadmaPatil.compareStudentsAtFaculty(studentChzouChang);
        System.out.println();

        // тестирование функции сравнения любых двух студентов по общим качествам
        studentZahariaSmit.compareStudentsAtSchool(studentZahariaSmit); // ожидается: предупреждение о сравнении с самим собой
        studentGregoryGoyl.compareStudentsAtSchool(studentRonWisly);

    }

    // вспомогательная функция для уменьшения кода при занесении случайных значений
    private static void fillRandomProperties(Random randomGenerator, int[] properties, int numberOfSpecialProperties) {
        properties[0] = getRandomValue(randomGenerator,0,100);
        properties[1] = getRandomValue(randomGenerator,10,70);
        for (int i = 2; i < numberOfSpecialProperties+2; i++) {
            properties[i] = getRandomValue(randomGenerator,0,100);
        }
    }

    // функция возвращает целое значение между startValue и endValue
    private static int getRandomValue(Random randomGenerator, int startValue, int endValue) {
        if (startValue < 0 || endValue < 0 || endValue < startValue) { return 0; }
        int boundValue = endValue - startValue + 1;
        int randomValue = startValue + randomGenerator.nextInt(boundValue);
        return randomValue;
    }


}