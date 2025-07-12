package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        FigureType[] types = FigureType.values();
        FigureType selected = types[new Random().nextInt(types.length)];

        switch (selected) {
            case Circle: return new Circle(new Random().nextInt(101),
                    new ColorSupplier().getRandomColor());
            case IsoscelesTrapezoid: return new IsoscelesTrapezoid(new Random().nextInt(101) + 1,
                    new Random().nextInt(101) + 1, new Random().nextInt(101) + 1,
                    new ColorSupplier().getRandomColor());
            case Rectangle: return new Rectangle(new Random().nextInt(101) + 1,
                    new Random().nextInt(101) + 1,
                    new ColorSupplier().getRandomColor());
            case RightTriangle: return new RightTriangle(new Random().nextInt(101) + 1,
                    new Random().nextInt(101) + 1,
                    new ColorSupplier().getRandomColor());
            case Square: return new Square(new Random().nextInt(101) + 1,
                    new ColorSupplier().getRandomColor());
            default:
                System.out.println("Default");
        }

        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
