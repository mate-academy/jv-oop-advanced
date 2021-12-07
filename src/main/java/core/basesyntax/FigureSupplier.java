package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Figure figure;

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Figure getRandomCircle() {
        return new Circle(random.nextInt(100), colorSupplier.getRandomColor());
    }

    public Figure getRandomSquare() {
        return new Square(random.nextInt(100), colorSupplier.getRandomColor());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(random.nextInt(100),
                random.nextInt(100),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(random.nextInt(100),
                random.nextInt(100),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100),
                colorSupplier.getRandomColor());
    }

    public Figure getRandomFigure() {
        FigureType[] figureTypes = FigureType.values();
        FigureType randomFigureType = figureTypes[random.nextInt(figureTypes.length)];

        switch (randomFigureType) {
            case CIRCLE:
                figure = getRandomCircle();
                break;
            case SQUARE:
                figure = getRandomSquare();
                break;
            case RECTANGLE:
                figure = getRandomRectangle();
                break;
            case RIGHT_TRIANGLE:
                figure = getRandomRightTriangle();
                break;
            case ISOSCELES_TRAPEZOID:
                figure = getRandomIsoscelesTrapezoid();;
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }
}
