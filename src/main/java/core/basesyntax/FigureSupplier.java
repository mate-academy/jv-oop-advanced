package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_SIZE = 100;
    private static final int FIGURES_TYPES_COUNT = FigureType.values().length;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    
    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_TYPES_COUNT);
        FigureType figureType = FigureType.values()[index];

        return switch (figureType) {
            case CIRCLE -> getRandomCircle();
            case SQUARE -> getRandomSquare();
            case RECTANGLE -> getRandomRectangle();
            case RIGHT_TRIANGLE -> getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid();
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private Rectangle getRandomRectangle() {
        double width = random.nextFloat() * MAX_SIZE;
        double height = random.nextFloat() * MAX_SIZE;
        String color = colorSupplier.getRandomColor();

        return new Rectangle(color, width, height);
    }

    private Square getRandomSquare() {
        double side = random.nextFloat() * MAX_SIZE;
        String color = colorSupplier.getRandomColor();

        return new Square(color, side);
    }

    private RightTriangle getRandomRightTriangle() {
        double firstLeg = random.nextFloat() * MAX_SIZE;
        double secondLeg = random.nextFloat() * MAX_SIZE;
        String color = colorSupplier.getRandomColor();

        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        double firstBase = random.nextFloat() * MAX_SIZE;
        double secondBase = random.nextFloat() * firstBase;
        double minLegLength = (firstBase - secondBase) / 2;
        double leg = random.nextFloat() * MAX_SIZE + minLegLength;
        String color = colorSupplier.getRandomColor();

        return new IsoscelesTrapezoid(color, firstBase, secondBase, leg);
    }

    private Circle getRandomCircle() {
        double radius = random.nextFloat() * MAX_SIZE;
        String color = colorSupplier.getRandomColor();

        return new Circle(color, radius);
    }
}
