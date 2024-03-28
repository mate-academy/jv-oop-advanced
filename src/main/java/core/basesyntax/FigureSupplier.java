package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    static final int NUMBER_OF_FIGURES = 5;
    static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getColorOfFigure();
        int randomFigure = random.nextInt(NUMBER_OF_FIGURES);

        switch (randomFigure) {
            case 0:
                return new Circle().getRandomCircle();
            case 1:
                return new Rectangle().getRandomRectangle();
            case 2:
                return new Square().getRandomSquare();
            case 3:
                return new RightTriangle().getRandomRightTriangle();
            case 4:
                return new IsoscelesTrapezoid().getRandomIsoscelesTrapezoid();
            default:
                return null;

        }
    }

    public Figure getDefaultFigure() {
        return new Circle().getDefaultCircle();
    }
}
