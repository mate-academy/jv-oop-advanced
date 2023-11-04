package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int INDEX_BOUND = 5;
    private static final int DEFAULT_LENGTH = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private final Random index = new Random();
    private final Circle prepareCircle = new Circle();
    private final Rectangle prepareRectangle = new Rectangle();
    private final IsoscelesTrapezoid prepareTrapezoid = new IsoscelesTrapezoid();
    private final RightTriangle prepareTriangle = new RightTriangle();
    private final Square preparedSquare = new Square();

    public Figure getRandomFigure() {
        return switch (index.nextInt(INDEX_BOUND)) {
            case 0 -> prepareCircle.prepareCircle();
            case 1 -> preparedSquare.prepareSquare();
            case 2 -> prepareRectangle.prepareRectangle();
            case 3 -> prepareTrapezoid.prepareTrapezoid();
            case 4 -> prepareTriangle.prepareTriangle();
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_LENGTH);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }
}
