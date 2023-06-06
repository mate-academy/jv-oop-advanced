package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        String figureType = String.valueOf(Figures.values()[index]);

        if (figureType.equals(Figures.SQUARE.toString())) {
            return new Square(randomColor.getRandomColor(),
                    random.nextDouble() + random.nextInt(10));
        }
        if (figureType.equals(Figures.RECTANGLE.toString())) {
            return new Rectangle(randomColor.getRandomColor(),
                    random.nextDouble() + random.nextInt(10),
                    random.nextDouble() + random.nextInt(10));
        }
        if (figureType.equals(Figures.RIGHT_TRIANGLE.toString())) {
            return new RightTriangle(randomColor.getRandomColor(),
                    random.nextDouble() + random.nextInt(10),
                    random.nextDouble() + random.nextInt(10));
        }
        if (figureType.equals(Figures.CIRCLE.toString())) {
            return new Circle(randomColor.getRandomColor(), random.nextDouble());
        }
        if (figureType.equals(Figures.ISOSCELES_TRAPEZOID.toString())) {
            return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                    random.nextDouble() + random.nextInt(10),
                    random.nextDouble() + random.nextInt(10),
                    random.nextDouble() + random.nextInt(10));
        } else {
            return null;

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), DEFAULT_RADIUS);
    }

}
