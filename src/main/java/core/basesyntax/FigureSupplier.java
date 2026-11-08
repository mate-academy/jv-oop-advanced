package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureType[] figures = FigureType.values();
        FigureType randomFigure = figures[random.nextInt(figures.length)];

        return switch (randomFigure) {
            case SQUARE -> new Square(colorSupplier.getRandomColor(), random.nextInt(10) + 1);
            case RECTANGLE -> new Rectangle(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1, random.nextInt(10) + 1);
            case RIGHT_TRIANGLE -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1, random.nextInt(10) + 1);
            case CIRCLE -> new Circle(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1);
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextInt(10) + 1,
                    random.nextInt(10) + 1,
                    random.nextInt(10) + 1);
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);

    }

}
