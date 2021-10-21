package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int number = random.nextInt(5);
        switch (number) {
            case 0 : return new Square(colorSupplier.getRandomColor(), random.nextDouble());
            case 1 : return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(), random.nextDouble());
            case 2 : return new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble(), random.nextDouble());
            case 3 : return new Circle(colorSupplier.getRandomColor(), random.nextDouble());
            case 4 : return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble(), random.nextDouble(), random.nextDouble());
            default: return new Square(null, 0.0);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
