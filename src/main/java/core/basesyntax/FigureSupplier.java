package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int figcount = 5;
    private final int bound = 100;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private Figure getRandomCircle() {
        return new Circle(random.nextInt(bound), colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(bound));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(bound),
                random.nextInt(bound));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(bound), random.nextInt(bound));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(bound), random.nextInt(bound), random.nextInt(bound));
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(figcount);
        switch (figureNumber) {
            case 0: return getRandomIsoscelesTrapezoid();
            case 1: return getRandomCircle();
            case 2: return getRandomSquare();
            case 3: return getRandomRectangle();
            case 4: return getRandomRightTriangle();
            default:
                return getDefaultFigure();
        }
    }
}
