package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(NUMBER_OF_FIGURES);
        String color = colorSupplier.getRandomColor().toLowerCase();
        double figureProperty = random.nextDouble();

        switch (figureIndex) {
            case 0:
                return new IsoscelesTrapezoid(color, figureProperty,
                        figureProperty, figureProperty);
            case 1:
                return new Circle(color, figureProperty);
            case 2:
                return new RightTriangle(color, figureProperty, figureProperty);
            case 3:
                return new Rectangle(color, figureProperty, figureProperty);
            case 4:
                return new Square(color, figureProperty);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
