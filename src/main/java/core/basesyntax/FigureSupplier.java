package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_INDEX = 10;
    private static final int RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private Figure figure;

    public Figure getRandomFigure() {
        FigureEnum figureEnum = FigureEnum.values()[random.nextInt(FigureEnum.values().length)];
        switch (figureEnum) {
            case SQUARE:
                figure = createRandomSquare();
                break;
            case RECTANGLE:
                figure = createRandomRectangle();
                break;
            case ISOSCELES_TRAPEZOID:
                figure = createRandomIsoscelesTrapezoid();
                break;
            case CIRCLE:
                figure = createRandomCircle();
                break;
            case RIGHT_TRIANGLE:
                figure = createRandomRightTriangle();
                break;
            default:
                figure = getDefaultFigure();
                break;
        }
        return figure;
    }

    public Figure createRandomSquare() {
        int sideA = random.nextInt(MAX_INDEX) + 1;
        return new Square(FigureEnum.SQUARE.name(),
                supplier.getRandomColor(),
                sideA);
    }

    public Figure createRandomRectangle() {
        int sideA = random.nextInt(MAX_INDEX) + 1;
        int sideB = random.nextInt(MAX_INDEX) + 1;
        return new Rectangle(FigureEnum.RECTANGLE.name(),
                supplier.getRandomColor(),
                sideA,
                sideB);
    }

    public Figure createRandomIsoscelesTrapezoid() {
        int sideA = random.nextInt(MAX_INDEX) + 1;
        int sideB = random.nextInt(MAX_INDEX) + 1;
        int sideC = random.nextInt(MAX_INDEX) + 1;
        int index = sideA - (sideB + 2 * sideC);

        if (index >= 0) {
            while (index >= 0) {
                sideB = random.nextInt(MAX_INDEX) + 1;
                sideC = random.nextInt(MAX_INDEX) + 1;
                index = sideA - (sideB + 2 * sideC);
            }
        }
        if (sideA < sideB) {
            figure = new IsoscelesTrapezoid(FigureEnum.ISOSCELES_TRAPEZOID.name(),
                    supplier.getRandomColor(),
                    sideB,
                    sideA,
                    sideC);
        } else {
            figure = new IsoscelesTrapezoid(FigureEnum.ISOSCELES_TRAPEZOID.name(),
                    supplier.getRandomColor(),
                    sideA,
                    sideB,
                    sideC);
        }
        return figure;
    }

    public Figure createRandomCircle() {
        int radius = random.nextInt(MAX_INDEX) + 1;
        return new Circle(FigureEnum.CIRCLE.name(),
                supplier.getRandomColor(),
                radius);
    }

    public Figure createRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_INDEX) + 1;
        int secondLeg = random.nextInt(MAX_INDEX) + 1;
        return new RightTriangle(FigureEnum.RIGHT_TRIANGLE.name(),
                supplier.getRandomColor(),
                firstLeg,
                secondLeg);
    }

    public Figure getDefaultFigure() {
        return new Circle(FigureEnum.CIRCLE.name(), Color.WHITE.name(), RADIUS);
    }
}
