package core.basesyntax;

import java.util.Random;

public class Main {
    static private int BOUND = 100;
    static private FigureSupplier figureSupplier = new FigureSupplier();
    static private ColorSupplier colorSupplier = new ColorSupplier();
    static private Random random = new Random();

    public static void main(String[] args) {
        Figure[] figureArray = new Figure[6];
        figureArray[0] = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND), random.nextInt(BOUND));
        figureArray[1] = new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
        figureArray[2] = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(BOUND), random.nextInt(BOUND), random.nextInt(BOUND));
        figureArray[3] = figureSupplier.getRandomFigure();
        figureArray[4] = figureSupplier.getRandomFigure();
        figureArray[5] = figureSupplier.getRandomFigure();
        for (Figure figure:figureArray) {
            System.out.println(figure);
        }
    }
}
