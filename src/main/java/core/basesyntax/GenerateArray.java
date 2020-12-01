package core.basesyntax;

import java.util.ArrayList;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class GenerateArray {
    private static Colors[] color = Colors.values();

    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(10);
        Object [] randomArray = new Object[x];
        for (int i = 0; i < x; i++) {
            randomArray[i] = random();
        }
        for (Object print:
             randomArray) {
            System.out.println(print.toString());
        }
    }

    private static Object random() {
        Random figures = new Random();
        int y = figures.nextInt(5);
        int areas = figures.nextInt(150);
        int uniques = figures.nextInt(150);
        switch (y) {
            case 1:
                return new Square(colorRand(), areas, uniques);
            case 2:
                return new IsoscelesTrapezoid(colorRand(), areas, uniques);
            case 3:
                return new RightTriangle(colorRand(), areas, uniques);
            case 4:
                return new Rectangle(colorRand(), areas, uniques);
            default:
                return new Circle(colorRand(), areas, uniques);
        }
    }

    static Colors colorRand(){
        Random random = new Random();
        return color[random.nextInt(color.length)];
    }
}
