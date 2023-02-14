package core.basesyntax;

import java.util.Random;

public class Main {
    private static int BOUND = 100;
    private static FigureSupplier figureSupplier = new FigureSupplier();
    private static ColorSupplier colorSupplier = new ColorSupplier();
    private static Random random = new Random();

    public static void main(String[] args) {
        Figure[] figureArray = new Figure[6];
        figureArray[0] = new Rectangle(colorSupplier.getRandomColor(), random.nextInt(BOUND),
                random.nextInt(BOUND));
        figureArray[1] = new Circle(colorSupplier.getRandomColor(), random.nextInt(BOUND));
        figureArray[2] = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(BOUND), random.nextInt(BOUND), random.nextInt(BOUND));
        figureArray[3] = figureSupplier.getDefaultFigure();
        figureArray[4] = figureSupplier.getDefaultFigure();
        figureArray[5] = figureSupplier.getDefaultFigure();
        for (Figure figure:figureArray) {
            System.out.println(figure.draw());
        }
    }
}
