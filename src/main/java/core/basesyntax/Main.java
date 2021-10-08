package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randGen = new Random();
        int numOfFigures = randGen.nextInt(10);
        System.out.println("Number of figures is: " + numOfFigures);
        Figure[] figures = new Figure[numOfFigures];
        for (int i = 0; i < numOfFigures; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
            System.out.println(i+1);
            figures[i].draw();
        }
    }
}
