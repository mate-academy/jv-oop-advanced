package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random rand = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = rand.nextInt(5);
        switch (number) {
            case 1:
                return new Circle(rand.nextInt(100),
                        colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(rand.nextDouble(50),
                        rand.nextDouble(50, 100),
                        colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(colorSupplier.getRandomColor(),
                        rand.nextDouble(100),
                        rand.nextDouble(150));
            case 4:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        rand.nextInt(100),
                        rand.nextInt(150));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        rand.nextDouble(100));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.white);
    }
}
