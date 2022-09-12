public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 4;
        float e = 5.7777777f;
        double f = 6.33333333;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        // Задача 2
        System.out.println("Задача 2");
        float g = 27.12f;
        System.out.println(g);
        long h = 987678965549L;
        System.out.println(h);
        byte dog = 2;
        System.out.println(dog);
        short i = 786;
        System.out.println(i);
        boolean dogIsAdult = dog > 10;
        System.out.println(dogIsAdult);
        short j = 569;
        System.out.println(j);
        short k = -159;
        System.out.println(k);
        short l = 27897;
        System.out.println(l);
        byte m = 67;
        System.out.println(m);

        // Задача 3
        System.out.println("Задача 3");
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int totalPaper = 480;
        int totalPupil = lP+aS+eA;
        int onePupil = totalPaper/totalPupil;
        System.out.println("На каждого ученика рассчитано " + onePupil + " листов бумаги");

// Задача 4
        System.out.println("Задача 4");
        int minute2Prod = 16;
        int minute1Prod = minute2Prod/2;
        int totalMinuteDay = 24*60;
        int minute20Prod = minute1Prod*20;
        System.out.println("За 20 минут машина произвела бутылок " + minute20Prod + " штук");
        int totalDay = minute1Prod*totalMinuteDay;
        System.out.println("За сутки машина произвела бутылок " + totalDay + " штук");
        int total3Day = minute1Prod*totalMinuteDay*3;
        System.out.println("За 3 дня машина произвела бутылок " + total3Day + " штук");
        int totalMonth = minute1Prod*totalMinuteDay*30;
        System.out.println("За месяц машина произвела бутылок " + totalMonth + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int totalPot = 120;
        int totalPotOneClass = 2+4;
        int totalClass = totalPot/totalPotOneClass;
        int totalWhitePot = totalClass*2;
        int totalBrownPot = totalClass*2*2;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhitePot + " банок белой краски и " + totalBrownPot + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int totalBananaWeight = bananaWeight*5;
        int totalMilkWeight = milkWeight*2;
        int totalIceCreamWeight = iceCreamWeight*2;
        int totalEggWeight = eggWeight*4;
        int totalWeightProdGram = totalBananaWeight+totalMilkWeight+totalIceCreamWeight+totalEggWeight;
        float totalWeightProdKg = totalWeightProdGram/1000f;
        System.out.println("Вес спорт-завтрака " + totalWeightProdKg + " килограмм");

        // Задача 7
        double correct1WeightDays = 7/0.25;
        System.out.println("Уйдёт " + correct1WeightDays + " дней на похудение, если спортсмен будет терять каждый день по 250 грамм");
        double correct2WeightDays = 7/0.5;
        System.out.println("Уйдёт " + correct2WeightDays + " дней на похудение, если спортсмен будет терять каждый день по 500 грамм");
        double correctWeightAverageDays = (correct1WeightDays+correct2WeightDays)/2;
        System.out.println("Может потребоваться " + correctWeightAverageDays + " день в среднем, чтобы добиться результата похудения");

        // Задача 8
        System.out.println("Задача 8");
        var mashaZpNow = 67760;
        var danZpNow = 83690;
        var krisZpNow = 76230;
        var mashaZpAfter = mashaZpNow+mashaZpNow*0.1;
        var danZpAfter = danZpNow+danZpNow*0.1;
        var krisZpAfter = krisZpNow+krisZpNow*0.1;
        var mashaZpYearNow = mashaZpNow*12;
        var danZpYearNow = danZpNow*12;
        var krisZpYearNow = krisZpNow*12;
        var mashaZpYearAfter = mashaZpAfter*12;
        var danZpYearAfter = danZpAfter*12;
        var krisZpYearAfter = krisZpAfter*12;
        var mashaMarginZpYear = mashaZpYearAfter-mashaZpYearNow;
        var danMarginZpYear = danZpYearAfter-danZpYearNow;
        var krisMarginZpYear = krisZpYearAfter-krisZpYearNow;
        System.out.println("Маша теперь получает " + mashaZpAfter + " рублей. Годовой доход вырос на " + mashaMarginZpYear + " рублей");
        System.out.println("Денис теперь получает " + danZpAfter + " рублей. Годовой доход вырос на " + danMarginZpYear + " рублей");
        System.out.println("Кристина теперь получает " + krisZpAfter + " рублей. Годовой доход вырос на " + krisMarginZpYear + " рублей");
    }
}
