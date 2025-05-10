package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int NUMBER_OF_FUGURES = 5;
    private static final int MAX_SIZE_OF_FIRST_PARAMETR = 60;
    private static final int MAX_SIZE_OF_SECOND_PARAMETR = 70;
    private static final int MAX_SIZE_OF_THIRS_PARAMETR = 80;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(NUMBER_OF_FUGURES);
        switch (randomFigureNumber) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRectangle();
            case 4:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private Figure getRandomCircle() {
        int radius = random.nextInt(MAX_SIZE_OF_FIRST_PARAMETR) + 1;
        String color = colorSupplier.getRandomColor();
        return new Circle(radius, color);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int leg = random.nextInt(MAX_SIZE_OF_FIRST_PARAMETR) + 1;
        int upbase = random.nextInt(MAX_SIZE_OF_SECOND_PARAMETR) + 1;
        int downbase = random.nextInt(MAX_SIZE_OF_THIRS_PARAMETR) + 1;
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(leg, upbase, downbase, color);
    }

    private Figure getRandomRectangle() {
        int firstLeg = random.nextInt(MAX_SIZE_OF_FIRST_PARAMETR) + 1;
        int secondLeg = random.nextInt(MAX_SIZE_OF_SECOND_PARAMETR) + 1;
        String color = colorSupplier.getRandomColor();
        return new Rectangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomRightTriangle() {
        int firstLeg = random.nextInt(MAX_SIZE_OF_FIRST_PARAMETR) + 1;
        int secondLeg = random.nextInt(MAX_SIZE_OF_SECOND_PARAMETR) + 1;
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomSquare() {
        int leg = random.nextInt(MAX_SIZE_OF_FIRST_PARAMETR) + 1;
        String color = colorSupplier.getRandomColor();
        return new Square(leg, color);
    }

}
