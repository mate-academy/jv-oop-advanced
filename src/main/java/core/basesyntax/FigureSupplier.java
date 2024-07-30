package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random rand = new Random();
    private final ColorSupplier colorSuplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = rand.nextInt(5);
        switch (number) {
            case 0:
                return new Circle(colorSuplier.getRandomColor(), rand.nextDouble(100.00));
            case 1:
                return new Rectangle(
                        colorSuplier.getRandomColor(),
                        rand.nextDouble(100.00),
                        rand.nextDouble(100.00));
            case 2:
                return new Square(colorSuplier.getRandomColor(), rand.nextDouble(100.00));
            case 3:
                return new IsoscelesTrapezoid(
                        colorSuplier.getRandomColor(),
                        rand.nextDouble(100.00),
                        rand.nextDouble(100.00),
                        rand.nextDouble(100.00),
                        rand.nextDouble(85.00));
            case 4:
                return new RightTriangle(
                        colorSuplier.getRandomColor(),
                        rand.nextDouble(100.00),
                        rand.nextDouble(100.00));
            default:
                return getDefaultFigure(); //unreachable code
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);

    }
}
