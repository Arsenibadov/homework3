public class Main {
    public static void main(String[] args){

                //Задача № 1
                int a = 50000;// Объявил переменную типа int
                System.out.println ( "Значение переменной a с типом int равно " + a );
                byte b = 30;// Объявил переменную типа byte
                System.out.println ( "Значение переменной b с типом byte равно " + b );
                short d = 300;// Объявил переменную типа short
                System.out.println ( "Значение переменной d с типом short равно " + d );
                long f = 3000000;// Объявил переменную типа long
                System.out.println ( "Значение переменной f с типом long равно " + f );
                float c = 3.80f;// Объявил переменную типа float
                System.out.println ( "Значение переменной c с типом float равно " + c );
                double v = 520.8356d;// Объявил переменную типа double
                System.out.println ( "Значение переменной v с типом int равно " + v );

                // Задание № 2
                long q = 987678965549L;
                System.out.println ( q );
                float w = 2.786f;
                System.out.println ( w );
                byte e = 67;
                System.out.println ( e );
                double r = 27.12;
                System.out.println ( r );
                short t = -159;
                System.out.println ( t );
                short y = 569;
                System.out.println ( y );
                int u = 27897;
                System.out.println ( u );

                //Задание №3
                int LyudmilaPavlovna = 23;
                int AnnaSergeevna = 27;
                int CatherineAndreyevna = 30;
                int totalPaper = 480;
                int totalStudents = LyudmilaPavlovna + AnnaSergeevna + CatherineAndreyevna;
                System.out.println ( totalStudents );
                int paperForStudents = totalPaper / totalStudents;
                System.out.println ( "На каждого ученика рассчитано " + paperForStudents + " листов бумаги" );

                // 2 задача
                long One = 987678965549l;
                float two = 2.786f;
                byte three = 67;
                double four = 27.12;
                short five = -159;
                short six  = 569;
                int seven  = 27897;

                // 3 задача
                int Ludmila_Pavlovna = 23;
                int Anna_Sergeevna = 27;
                int Ekaterina_Andreevna = 30;
                int TotalPaper = 480;
                int paperEach = (totalPaper / (Ludmila_Pavlovna + Anna_Sergeevna + Ekaterina_Andreevna));
                System.out.println("На каждого ученика рассчитано " + paperEach + " листов бумаги");
                System.out.println ( "На каждого ученика рассчитано " + paperForStudents + " листов бумаги" );

                //Задание № 4
                int Bottle2 = 16;
                int Bottle1 = Bottle2 / 2;
                int Bottle20 = Bottle1 * 20;
                int Day = Bottle20 * 3 * 24;
                int Days3 = Day * 3;
                int month1 = Day * 30;
                System.out.println ( "За 20 минут машина произвела " + Bottle20 + " штук бутылок" );
                System.out.println ( "За сутки машина произвела " + Day + " штук бутылок" );
                System.out.println ( "За 3 дня машина произвела " + Days3 + " штук бутылок" );
                System.out.println ( "За 1 месяц машина произвела " + month1 + " штук бутылок" );

                //Задание №5
                int CantOfPaint = 120;
                int WhitePaint = 2;
                int BrownPaint = 4;
                int TotalClass = CantOfPaint / (WhitePaint + BrownPaint);
                int TotalWhitePaint = TotalClass * 2;
                int TotalBrownPaint = BrownPaint * 4;
                System.out.println ( "В школе, где " + TotalClass + " классов, нужно " + TotalWhitePaint + " банок белой краски и " + TotalBrownPaint + " банок коричневой краски " );

                //Задание 6
                int bananas = 5 * 80;
                int Milk = 200 / 100 * 105;
                int IceCreamSundae = 2 * 100;
                int RawEggs = 4 * 70;
                int TotalWeight = bananas + Milk + IceCreamSundae + RawEggs;
                int TotalWeight1 = (bananas + Milk + IceCreamSundae + RawEggs) / 1000;
                System.out.println ( "Вес всего завтрака в граммах " + TotalWeight );
                System.out.println ( "Вес всего завтрака в килограммах " + TotalWeight1 );

                //Задача № 7
                int TargetKg = 7;
                int MinimumWeightPerDay = 250;
                int MaximumWeightPerDay = 500;
                int TargetGram = TargetKg * 1000;
                int MinimalWeightLoss = TargetGram / MinimumWeightPerDay;
                int MaximumWeightLoss = TargetGram / MaximumWeightPerDay;
                int DaysAverage = (MinimalWeightLoss + MaximumWeightLoss) / 2;
                System.out.println ( "если спортсмен будет терять каждый день по 250 грамм - " + MinimalWeightLoss );
                System.out.println ( "если спортсмен будет терять каждый день по 250 грамм - " + MaximumWeightLoss );
                System.out.println ( "в среднем - " + DaysAverage + " день ");

                // Задание № 8
                int Masha = 67760;
                int Denis = 83690;
                int Kristina = 76230;
                int Masha1 = Masha / 100 * 10;
                int Denis1 = Denis / 100 * 10;
                int Kristina1 = Kristina / 100 * 10;
                int Masha2 = Masha1 + Masha;
                int Denis2 = Denis1 + Denis;
                int Kristina2 = Kristina1 + Kristina;
                System.out.println ("Маша теперь получает " + Masha2 +  " рублей. Годовой доход вырос на " + Masha1 + " рублей");
                System.out.println ("Маша теперь получает " + Denis2 +  " рублей. Годовой доход вырос на " + Denis1 + " рублей");
                System.out.println ("Маша теперь получает " + Kristina2 +  " рублей. Годовой доход вырос на " + Kristina1 + " рублей");
            }

}