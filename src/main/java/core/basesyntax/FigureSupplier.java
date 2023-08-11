package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static int maxIndex = 5;
    private static double maxUnits = 100;
    private static int defaultRadius = 10;
    private static String defaultColor = Color.WHITE.name().toLowerCase();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(maxIndex);
        switch (randomIndex) {
            case 0:
                return new Square(new ColorSupplier().getRandomColor(),
                                  random.nextDouble());
            case 1:
                return new Rectangle(new ColorSupplier().getRandomColor(),
                                     random.nextDouble(), random.nextDouble());
            case 2:
                return new Circle(new ColorSupplier().getRandomColor(),
                                  random.nextDouble());
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(),
                                    random.nextDouble(), random.nextDouble());
            default:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(),
                                     random.nextDouble(), random.nextDouble(),
                                     random.nextDouble(), random.nextDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }
}
