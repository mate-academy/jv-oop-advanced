package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        switch (new Random().nextInt(5)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomSquare();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE);
    }

    public Figure getRandomCircle() {
        return new Circle(new Random().nextInt(100),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                new Random().nextInt(50),
                new Random().nextInt(100),
                new Random().nextInt(50),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }

    public Figure getRandomRectangle() {
        return new Rectangle(new Random().nextInt(100),
                new Random().nextInt(100),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(new Random().nextInt(100),
                new Random().nextInt(100),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }

    public Figure getRandomSquare() {
        return new Square(new Random().nextInt(100),
                Colors.valueOf(new ColorSupplier().getRandomColor()));
    }
}
