package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(AMOUNT_OF_FIGURES);
        switch (randomIndex) {
            case 0:
                return new Circle().getRandomCircle();
            case 1:
                return Square.getRandomSquare();
            case 2:
                return new Rectangle().getRandomRectangle();
            case 3:
                return new RightTriangle().getRandomRightTriangle();
            case 4:
            default:
                return new IsoscelesTrapezoid().getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name());
    }
}
