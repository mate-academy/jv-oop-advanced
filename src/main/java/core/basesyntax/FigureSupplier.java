package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURE_TYPES = 5;
    private final ColorSupplier colorSupplier;
    private final Random rand = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int figureType = rand.nextInt(NUMBER_OF_FIGURE_TYPES);
        Color randomColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return createRandomSquare(randomColor);
            case 1:
                return createRandomRectangle(randomColor);
            case 2:
                return createRandomRightTriangle(randomColor);
            case 3:
                return createRandomCircle(randomColor);
            case 4:
                return createRandomIsoscelesTrapezoid(randomColor);
            default:
                throw new IllegalArgumentException("Invalid figure type");
        }
    }

    private Figure createRandomSquare(Color color) {
        double sideLength = rand.nextDouble() * 10 + 1;
        return (Figure) new Square(color, sideLength);
    }

    private Figure createRandomRectangle(Color color) {
        double width = rand.nextDouble() * 10 + 1;
        double height = rand.nextDouble() * 10 + 1;
        return (Figure) new Rectangle(height, width, color);
    }

    private Figure createRandomRightTriangle(Color color) {
        double base = rand.nextDouble() * 10 + 1;
        double height = rand.nextDouble() * 10 + 1;
        return (Figure) new RightTriangle(height, base, color);
    }

    private Figure createRandomCircle(Color color) {
        double radius = rand.nextDouble() * 10 + 1;
        return (Figure) new Circle(color, radius);
    }

    private Figure createRandomIsoscelesTrapezoid(Color color) {
        double topBase = rand.nextDouble() * 10 + 1;
        double bottomBase = rand.nextDouble() * 10 + 1;
        double height = rand.nextDouble() * 10 + 1;
        return (Figure) new IsoscelesTrapezoid(color, topBase, bottomBase, height);
    }
}

