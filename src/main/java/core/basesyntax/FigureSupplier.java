package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();

        switch (new Random().nextInt(5)) {
            case 0:
                return new Circle(new Random().nextDouble() * 10, color);
            case 1:
                return new Square(new Random().nextDouble() * 10, color);
            case 2:
                return new Rectangle(new Random().nextDouble() * 10, new Random().nextDouble() * 10, color);
            case 3:
                return new RightTriangle(new Random().nextDouble() * 10,
                        new Random().nextDouble() * 10, color);
            case 4:
                return new IsoscelesTrapezoid(new Random().nextDouble() * 10,
                        new Random().nextDouble() * 10, new Random().nextDouble() * 10, color);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.toString());
    }
}
