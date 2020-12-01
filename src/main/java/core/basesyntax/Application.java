package core.basesyntax;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Random rnd = new Random();
        int x = rnd.nextInt(10);
        Object [] randomArray = new Object[x];
        for (int i = 0; i < x; i++) {
            randomArray[i] = FigureGenerator.random();
        }
        for (Object print: randomArray) {
            System.out.println(print.toString());
        }
    }
}
