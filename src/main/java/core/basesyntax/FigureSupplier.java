package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FigureType.values().length);
        switch (figureNumber) {
            case 0:
                return createSquare();
            case 1:
                return createRectangle();
            case 2:
                return createRightTriangle();
            case 3:
                return createCircle();
            case 4:
                return createIsoscelesTrapezoid();
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    private Figure createSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(1000));
    }

    private Figure createRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(1000), random.nextInt(1000));
    }

    private Figure createRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(1000), random.nextInt(1000));
    }

    private Figure createCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(1000));
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(1000), random.nextInt(1000), random.nextInt(1000));
    }
}
