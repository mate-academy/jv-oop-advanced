package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_UNITS = 10;
    private static final int FIGURES_NUMBER = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURES_NUMBER);
        String randomFiguresName = FigureType.values()[randomFigureNumber].name();
        String randomColor = colorSupplier.getRandomColor();
        if (randomFiguresName.equals(FigureTypeName.SQUARE.name())) {
            return new Square(random.nextInt(MAXIMUM_UNITS),
                    randomColor);
        } else if (randomFiguresName.equals(FigureTypeName.RECTANGLE.name())) {
            return new Rectangle(random.nextInt(MAXIMUM_UNITS),
                    random.nextInt(MAXIMUM_UNITS),
                    randomColor);
        } else if (randomFiguresName.equals(FigureTypeName.RIGHT_TRIANGLE.name())) {
            return new RightTriangle(random.nextInt(MAXIMUM_UNITS),
                    random.nextInt(MAXIMUM_UNITS),
                    randomColor);
        } else if (randomFiguresName.equals(FigureTypeName.CIRCLE.name())) {
            return new Circle(random.nextInt(MAXIMUM_UNITS), randomColor);
        } else {
            return new IsoscelesTrapezoid(random.nextInt(MAXIMUM_UNITS),
                    random.nextInt(MAXIMUM_UNITS),
                    random.nextInt(MAXIMUM_UNITS), randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Colors.WHITE.name());
    }
}

