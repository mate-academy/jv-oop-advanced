package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5; //From 0 to 4 incl.
    private static final int RADIUS_SHOULD_RETURN = 10;
    private static final int BOUNDS_OF_VALUES_IN_ALL_FIGURES = 20;

    public Figure getRandomFigure() {
        int index = new Random().nextInt(NUMBER_OF_FIGURE_TYPES);
        switch (index) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            case 0:
                return getRandomCircle();
            default:
                System.out.println("Something went wrong");
                return getDefaultFigure();
        }
    }

    private Square getRandomSquare() {
        return new Square(new Random().nextInt(BOUNDS_OF_VALUES_IN_ALL_FIGURES),
                new ColorSupplier().getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(new Random().nextInt(BOUNDS_OF_VALUES_IN_ALL_FIGURES),
                new Random().nextInt(BOUNDS_OF_VALUES_IN_ALL_FIGURES),
                new ColorSupplier().getRandomColor());
    }

    private Circle getRandomCircle() {
        return new Circle(new Random().nextInt(BOUNDS_OF_VALUES_IN_ALL_FIGURES),
                new ColorSupplier().getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(new Random().nextInt(BOUNDS_OF_VALUES_IN_ALL_FIGURES),
                new Random().nextInt(BOUNDS_OF_VALUES_IN_ALL_FIGURES),
                new ColorSupplier().getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(new Random().nextInt(BOUNDS_OF_VALUES_IN_ALL_FIGURES),
                new Random().nextInt(BOUNDS_OF_VALUES_IN_ALL_FIGURES),
                new Random().nextInt(BOUNDS_OF_VALUES_IN_ALL_FIGURES),
                new ColorSupplier().getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS_SHOULD_RETURN, Color.WHITE.toString());
    }
}
