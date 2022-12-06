package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;

    ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getDefaultFigure() {
        return new Circle("circle", "white", 10.00);
    }

    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(NUMBER_OF_FIGURES);
        switch (figureIndex) {
            case 1:
              return new Circle("circle", colorSupplier.getRandomColor());
              break;
            case 2:
              return new Rectangle("rectangle", colorSupplier.getRandomColor());
              break;
            case 3:
              return new RightTriangle("right triangle", colorSupplier.getRandomColor());
              break;
            case 4:
              return new Square("square", colorSupplier.getRandomColor());
              break;
            case 5:
              return new IsoscelesTrapezoid("isosceles trapezoid",
                      colorSupplier.getRandomColor());
              break;
        }
    }
}
