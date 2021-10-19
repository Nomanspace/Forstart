import java.util.Random;

/**
 * Напишите программу, в которой создаются 2 «противоборствующих» объекта (от разных классов),
 * состояние которых описывается параметрами: «имя» (строковый, необязательно), «здоровье» (целочисленный), «сила удара» (целочисленный), текущее состояние жив/не жив (логический).
 * <p>
 * В основном или отдельном классе создать статический метод,
 * который будет осуществлять «бой насмерть» подсказка: в бесконечном цикле с каждой итерацией цикла от здоровья одного объекта будет вычитаться сила удара другого объекта,
 * пока здоровье одного из объектов (или обоих, при равных условиях) не будет меньше либо равно нулю.
 * <p>
 * По окончанию цикла сделать вывод в консоль с указанием, какой из объектов «победил».
 */


public class Practice5 {
    public static void main(String[] args) {
        Human Uter = new Human();
        Undead Artes = new Undead();
        Clash(Uter, Artes);
    }

    static void Clash(Human Uter, Undead Artes) {
        Random rand = new Random();
        Uter.hhealthpoints = 100;
        Artes.uhealthpoints = 100;
        //int result = variable > 10 ? variable - 10 : variable + 10)
        while (Uter.hhealthpoints > 0 && Artes.uhealthpoints > 0) {

            Artes.undeadlivestatus = Artes.uhealthpoints > 0;
            Uter.humanlivethstatus = Uter.hhealthpoints > 0;

            //int round = 1;
            //round++;

            boolean checklivestatus;
            checklivestatus = Uter.humanlivethstatus && Artes.undeadlivestatus;

            for (int round = 1; checklivestatus != false; round++) {
                System.out.println("Round " + round + " Fight!");
                //}


                Artes.uinitiative = rand.nextInt(6);
                System.out.println("Инициатива Артеса " + Artes.uinitiative);
                Uter.hinitiative = rand.nextInt(6);
                System.out.println("Инициатива Утера " + Uter.hinitiative);
                if (Uter.hinitiative > Artes.uinitiative) {
                    Artes.uhealthpoints -= Uter.hitpower;
                    System.out.println("Утер наносит удар " + Uter.hitpower + " Осталось жизней " + Artes.uhealthpoints);

                } else if (Artes.uinitiative > Uter.hinitiative) {
                    Uter.hhealthpoints -= Artes.hitpower;
                    System.out.println("Артес наносит удар " + Artes.hitpower + " Осталось жизней " + Uter.hhealthpoints);

                }
                if (Uter.hhealthpoints < 0) {
                    System.out.println("Утер проиграл, Артес победил!");
                    Uter.humanlivethstatus = false;
                    break;
                } else if (Artes.uhealthpoints < 0) {
                    System.out.println("Артес проиграл, Утер победил!");
                    Artes.undeadlivestatus = false;
                    break;
                }
                if (Uter.hinitiative == Artes.uinitiative) {
                    System.out.println("Парирование");
                } else {
                    System.out.println("Битва не состоялась");

                }

           /* if (Uter.hhealthpoints < 0) {
                System.out.println("Утер проиграл, Артес победил!");
                Uter.humanlivethstatus = false;
            } else if (Artes.uhealthpoints < 0) {
                System.out.println("Артес проиграл, Утер победил!");
                Artes.undeadlivestatus = false;
            } else {
                System.out.println("Бой продолжается");
            } */
            }
        }

    }
}


class Hitmath {
    static int getIntFromRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}


class Human {
    //Random rand = new Random();
    int hhealthpoints;
    int hitpower = Hitmath.getIntFromRange(0, 10);
    boolean humanlivethstatus;
    int hinitiative = 0;// rand.nextInt(6);
}

class Undead {
    //Random rand = new Random();
    int uhealthpoints;
    int hitpower = Hitmath.getIntFromRange(1, 9);
    boolean undeadlivestatus;
    int uinitiative = 0; // rand.nextInt(6);
}
