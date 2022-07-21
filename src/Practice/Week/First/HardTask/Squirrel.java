package Practice.Week.First.HardTask;

public class Squirrel {
    int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
    }

    public static void main(String[] args) {
        //Squirrel s = new Squirrel(new int[]{2, 5, -3, -1});
        //int a = s.nuts[2] < s.nuts[3] ? s.nuts[2] : s.nuts[3];
        //System.out.println(a);
        //System.out.println("Длинна массива " + s.nuts.length);
        //System.out.println("Максимальное кол-во орехов " + s.maxNuts());
        Squirrel s2 = new Squirrel(new int[]{1, -2, 3, 1, -1, -4, 2, 3});
        System.out.println("Максимальное кол-во орехов " + s2.maxNuts());
        System.out.println("белочка найдет или потеряет " + s2.getNuts(1));
    }

    //возвращает число — сколько найдет или потеряет белочка на пеньке с индексом n;
    int getNuts(int index) {
        return nuts[index];
    }

    int maxNuts() {
        int maxNuts = 0;
        int icount = 0;
        // вычисляем сумму и в дальнейшем выясняем, какой индекс массива нам максимально выгоден при положитльной сумме
        // или нанесет меньше урона нашему кол-ву орехов, если суммы(или сумма) орехов меньше 0
        int a = icount + nuts[0];
        int b = icount + nuts[1];

        if (a > 0 && b > 0) {
            icount = 0;
            maxNuts = nuts[0];
        }

        if (a < 0 && b < 0) {
            if (a > b) {
                icount = 0;
                maxNuts = nuts[0];
            } else {
                icount = 1;
                maxNuts = nuts[1];
            }
        }

        if (a > 0 && b < 0) {
            icount = 0;
            maxNuts = nuts[0];
        }

        if (a < 0 && b > 0) {
            icount = 1;
            maxNuts = nuts[1];
        }

        for (int i = icount; i < nuts.length; ) {
            if (maxNuts + nuts[i + 1] > maxNuts + nuts[i + 2]) {
                maxNuts = maxNuts + nuts[i + 1];
                i++;
            } else {
                maxNuts = maxNuts + nuts[i + 2];
                i += 2;
            }
            // вот тут я не знаю, как более логически красиво взять последний орех,т.к. взять мы его обязаны, но если мы будем использовать алгоритм написанный выше
            // то при сравненни с ячейкой массива +2 от текущей, я выйду за пределы массива.
            if (i == nuts.length - 2) {
                maxNuts = maxNuts + nuts[i + 1];
                i++;
            }
            if (i == nuts.length - 1) {
                return maxNuts;
            }
        }
        return maxNuts;
    }
}
