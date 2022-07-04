package Practice.Week.First.MediumTask;

public class LimitingRectangle {
    int[][] points;


    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    int getWidth(int indexMin, int indexMax, int[][] mass) {
        return getmax(indexMin, mass) - getmin(indexMax, mass);
    }

    int getHeight(int indexMin, int indexMax, int[][] mass) {
        return getmax(indexMin, mass) - getmin(indexMax, mass);
    }

    String getBorders(int[][] mass) {
        return "bottom Y point " + getmin(1, mass) + " top Y point " + getmax(1, mass) + " left X point " + getmin(0, mass) + " right X point " + getmax(0, mass);
    }

    int getmin(int indexMin, int[][] mass) {
        int min = mass[0][indexMin];
        for (int i = 0; i < mass.length; i++) {
            if (min > mass[i][indexMin]) {
                min = mass[i][indexMin];
            }
        }
        return min;
    }

    int getmax(int indexMax, int[][] mass) {
        int max = mass[0][indexMax];
        for (int[] ints : mass) {
            if (max < ints[indexMax]) {
                max = ints[indexMax];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LimitingRectangle r = new LimitingRectangle(new int[][]{{-1, -2}, {3, 4}});
        //r.getmin(0, r.points);
        //System.out.println(r.getmin(0, r.points));
        //r.getWidth(LimitingRectangle r);
        //r.getWidth(0,0, r.points);
        System.out.println(r.getWidth(0, 0, r.points));
        //r.getHeight(1,1, r.points);
        System.out.println(r.getHeight(1, 1, r.points));
        System.out.println(r.getBorders(r.points));
    }
}
