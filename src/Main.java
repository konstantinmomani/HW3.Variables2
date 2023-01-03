public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача1");
        byte redPencils = 6;
        short vocabularyLists = 1023;
        int distanceFromMoscowToWellingtone = 16515;
        long secondsFromMyBirthday = 1074643200;
        float myFootLength = 29.5F;
        double circleArea = 6.665;
        System.out.println(redPencils);
        System.out.println(vocabularyLists);
        System.out.println(distanceFromMoscowToWellingtone);
        System.out.println(secondsFromMyBirthday);
        System.out.println(myFootLength);
        System.out.println(circleArea);
    }
    public static void task2 () {
        System.out.println("Задача2");
        float cucumbersWeight = 27.12F;
        long parkArea = 987678965549L;
        float tableLength = 2.786F;
        short minValue = 569;
        short temperature = -159;
        int netizens = 27897;
        byte employee = 67;
        System.out.println(cucumbersWeight);
        System.out.println(parkArea);
        System.out.println(tableLength);
        System.out.println(minValue);
        System.out.println(temperature);
        System.out.println(netizens);
        System.out.println(employee);
    }
    public static void task3 () {
        System.out.println("Задача3");
        byte studentsLudmilaClass = 23;
        byte studentsAnnClass = 27;
        byte studentsEkClass = 30;
        int allStudents = studentsLudmilaClass + studentsAnnClass + studentsEkClass;
        short totalAmountOfPaper = 480;
        int amountPaperForOneStudent = totalAmountOfPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + amountPaperForOneStudent + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача4");
        byte machineCapacityIn2Min = 16;
        int machineCapacityIn1Min = machineCapacityIn2Min / 2;
        int machineCapacityIn20Min = machineCapacityIn1Min * 20;
        System.out.println("За 20 минут машина произвела " + machineCapacityIn20Min + " штук бутылок");
        int machineCapacityIn1day = (machineCapacityIn20Min * 3) * 24;
        System.out.println("За одни сутки машина произвела " + machineCapacityIn1day + " штук бутылок");
        int machineCapacityIn3days = machineCapacityIn1day * 3;
        System.out.println("За три дня машина произвела " + machineCapacityIn3days + " штук бутылок");
        long machineCapacityIn1Month = machineCapacityIn3days * 10;
        System.out.println("За один месяц машина произвела " + machineCapacityIn1Month + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача5");
        int numberOfPaintCansForAllSchoolClasses = 120;
        byte numberOfWhitePaintCansForOneClass = 2;
        byte numberOfBrownPaintCansForOneClass = 4;
        byte totalNumberOfPaintCansForOneClass = (byte) (numberOfWhitePaintCansForOneClass + numberOfBrownPaintCansForOneClass);
        int numberOfSchoolClasses = numberOfPaintCansForAllSchoolClasses / totalNumberOfPaintCansForOneClass;
        int numberOfWhitePaintCansForAllSchoolClasses = numberOfSchoolClasses * numberOfWhitePaintCansForOneClass;
        int numberOfBrownPaintCansForAllSchoolClasses = numberOfSchoolClasses * numberOfBrownPaintCansForOneClass;
        System.out.println("В школе, где " + numberOfSchoolClasses + " классов, нужно " + numberOfWhitePaintCansForAllSchoolClasses + " банок белой краски и " + numberOfBrownPaintCansForAllSchoolClasses + " банок коричневой краски");
    }
}