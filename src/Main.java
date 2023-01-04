    public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
        byte numberOfWhitePaintCansForOneClass = 2;
        byte numberOfBrownPaintCansForOneClass = 4;
        int totalNumberOfPaintCansForOneClass = (numberOfWhitePaintCansForOneClass +
                numberOfBrownPaintCansForOneClass);
        int numberOfPaintCansForAllSchoolClasses = 120;
        int numberOfSchoolClasses = numberOfPaintCansForAllSchoolClasses / totalNumberOfPaintCansForOneClass;
        int numberOfWhitePaintCansForAllSchoolClasses = numberOfSchoolClasses * numberOfWhitePaintCansForOneClass;
        int numberOfBrownPaintCansForAllSchoolClasses = numberOfSchoolClasses * numberOfBrownPaintCansForOneClass;
        System.out.println("В школе, где " + numberOfSchoolClasses + " классов, нужно "
                + numberOfWhitePaintCansForAllSchoolClasses + " банок белой краски и "
                + numberOfBrownPaintCansForAllSchoolClasses + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача6");
        byte oneBananaWeiht = 80;
        byte milk100MlWeight = 105;
        byte onePieceOfIceCreamWeight = 100;
        byte oneEggWeight = 70;
        short bananasInRecipeWeight = (short) (oneBananaWeiht * 5);
        short milkInRecipeWeight = (short) (milk100MlWeight * 2);
        short iceCreamInRecipeWeight = (short) (onePieceOfIceCreamWeight * 2);
        short eggsInRecipeWeight = (short) (oneEggWeight * 4);
        float sportCocktailWeightGr = (bananasInRecipeWeight + milkInRecipeWeight + iceCreamInRecipeWeight +
                eggsInRecipeWeight);
        System.out.println("Вес завтрака составляет " + sportCocktailWeightGr + " грамм");
        float sportCocktailWeightKg = sportCocktailWeightGr / 1000F;
        System.out.println("Вес завтрака составляет " + sportCocktailWeightKg + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача7");
        byte plannedWeightLess = 7;
        short plannedWeightLessGr = (short) (plannedWeightLess * 1000);
        short dayWeightLessDiet1 = 250;
        short dayWeightLessDiet2 = 500;
        short numderDaysForWeightLessDiet1 = (short) (plannedWeightLessGr / dayWeightLessDiet1);
        System.out.println("С диетой 1 для похудения на 7 кг понадобиться " + numderDaysForWeightLessDiet1 + " дней");
        short numderDaysForWeightLessDiet2 = (short) (plannedWeightLessGr / dayWeightLessDiet2);
        System.out.println("С диетой 2 для похудения на 7 кг понадобиться " + numderDaysForWeightLessDiet2 + " дней");
        short averageNumberDaysWeightLess = (short) ((numderDaysForWeightLessDiet1 + numderDaysForWeightLessDiet2) / 2);
        System.out.println("В среднем для похудения на 7 кг понадобиться " + averageNumberDaysWeightLess + " день");
    }
    public static void task8 () {
        System.out.println("Задача8");
        byte monthsInAYear = 12;
        int monthlyIncomeMashaPresent = 67760;
        int monthlyIncomeDenisPresent = 83690;
        int monthlyIncomeCristinaPresent = 76230;
        int annualIncomeMashaPresent = monthlyIncomeMashaPresent * monthsInAYear;
        int annualIncomeDenisPresent = monthlyIncomeDenisPresent * monthsInAYear;
        int annualIncomeCristinaPresent = monthlyIncomeCristinaPresent * monthsInAYear;
        float monthlyIncomeMashaPresent1Percent = monthlyIncomeMashaPresent / 100f;
        float monthlyIncomeMashaIncrease10Percent = monthlyIncomeMashaPresent1Percent * 110f;
        float monthlyIncomeDenisPresent1Percent = monthlyIncomeDenisPresent / 100f;
        float monthlyIncomeDenisIncrease10Percent = monthlyIncomeDenisPresent1Percent * 110f;
        float monthlyIncomeCristinaPresent1Percent = monthlyIncomeCristinaPresent / 100f;
        float monthlyIncomeCristinaIncrease10Percent = monthlyIncomeCristinaPresent1Percent * 110f;
        float annualIncomeMashaAfterIncreasing = monthlyIncomeMashaIncrease10Percent * monthsInAYear;
        float annualIncomeDenisAfterIncreasing = monthlyIncomeDenisIncrease10Percent * monthsInAYear;
        float annualIncomeCristinaAfterIncreasing = monthlyIncomeCristinaIncrease10Percent * monthsInAYear;
        float annualIncomeDifferenceMashaAfterIncreasing = annualIncomeMashaAfterIncreasing % annualIncomeMashaPresent;
        float annualIncomeDifferenceDenisAfterIncreasing = annualIncomeDenisAfterIncreasing % annualIncomeDenisPresent;
        float annualIncomeDifferenceCristinaAfterIncreasing = annualIncomeCristinaAfterIncreasing %
                annualIncomeCristinaPresent;
        System.out.println("Маша теперь получает " + monthlyIncomeMashaIncrease10Percent +
                " рублей в месяц. Годовой доход вырос на " + annualIncomeDifferenceMashaAfterIncreasing + " рублей");
        System.out.println("Денис теперь получает " + monthlyIncomeDenisIncrease10Percent +
                " рублей в месяц. Годовой доход вырос на " + annualIncomeDifferenceDenisAfterIncreasing + " рублей");
        System.out.println("Кристина теперь получает " + monthlyIncomeCristinaIncrease10Percent +
                " рублей в месяц. Годовой доход вырос на " + annualIncomeDifferenceCristinaAfterIncreasing + " рублей");
    }
}