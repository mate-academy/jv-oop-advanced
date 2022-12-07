package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 4;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.00;
    private Random random = new Random();

    private ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(NUMBER_OF_FIGURES);
        switch (figureIndex) {
            case 0:
              return new Circle(colorSupplier.getRandomColor(), getRandomSide());
            case 1:
              return new Rectangle(colorSupplier.getRandomColor(), getRandomSide(), getRandomSide());
            case 2:
              return new RightTriangle(colorSupplier.getRandomColor(), getRandomSide(), getRandomSide());
            case 3:
              return new Square(colorSupplier.getRandomColor(), getRandomSide());
            case 4:
              return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSide(),
                      getRandomSide(), getRandomSide());
            default:
              return getDefaultFigure();
        }
    }

    public int getRandomSide() {
        int side = random.nextInt(100);
        return side;
    }
}
