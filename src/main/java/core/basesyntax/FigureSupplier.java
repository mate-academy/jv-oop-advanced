package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Random random = new Random();
        int values = random.nextInt(5);
        switch (values) {
            case 0:
                return new Square(new ColorSupplier().getRandomColor(), random.nextInt(10));
            case 1:
                return new Circle(new ColorSupplier().getRandomColor(), random.nextInt(10));
            case 2:
                return new Rectangle(new ColorSupplier().getRandomColor(), random.nextInt(10), random.nextInt(10));
            case 3:
                return new RightTriangle(new ColorSupplier().getRandomColor(), random.nextInt(10), random.nextInt(10));
            case 4:
                return new IsoscelesTrapezoid(new ColorSupplier().getRandomColor(), random.nextInt(10), random.nextInt(10), random.nextInt(10));
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE), 10);
    }
}