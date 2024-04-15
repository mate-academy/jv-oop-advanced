package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_NUMBER);

        switch (figureType) {
            case 0:
                Circle randomCircle = new Circle(null, 0);
                return randomCircle.getRandomCircle();
            case 1:
                Square randomSquare = new Square(null, 0);
                return randomSquare.getRandomSquare();
            case 2:
                Rectangle randomRectangle = new Rectangle(null, 0, 0);
                return randomRectangle.getRandomRectangle();
            case 3:
                RightTriangle randomRightTriangle = new RightTriangle(null, 0, 0);
                return randomRightTriangle.getRandomRightTriangle();
            case 4:
                IsoscelesTrapezoid randomIsoscelesTrapezoid = new IsoscelesTrapezoid(null, 0,
                        0, 0, 0);
                return randomIsoscelesTrapezoid.getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
