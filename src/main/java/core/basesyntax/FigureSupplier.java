package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final int DEFAULT_RADIUS = 10;
    private static String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURES_NUMBER);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomIsoscelesTrapezoid();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomRectangle();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        int sideRandom = random.nextInt(MAX_RANDOM_NUMBER);
        square.setSide(sideRandom);
        square.setColor(getRandomColor());
        return square;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        double firstSideRandom = random.nextInt(MAX_RANDOM_NUMBER);
        double secondSideRandom = random.nextInt(MAX_RANDOM_NUMBER);
        rectangle.setFirstSide(firstSideRandom);
        rectangle.setSecondSide(secondSideRandom);
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        int firstLegRandom = random.nextInt(MAX_RANDOM_NUMBER);
        int secondLegRandom = random.nextInt(MAX_RANDOM_NUMBER);
        rightTriangle.setFirstLeg(firstLegRandom);
        rightTriangle.setSecondLeg(secondLegRandom);
        rightTriangle.setColor(getRandomColor());
        return rightTriangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        int topSideRandom = random.nextInt(MAX_RANDOM_NUMBER);
        int bottomSideRandom = random.nextInt(MAX_RANDOM_NUMBER);
        int lateralSideRandom = random.nextInt(MAX_RANDOM_NUMBER);
        isoscelesTrapezoid.setTopSide(topSideRandom);
        isoscelesTrapezoid.setBottomSide(bottomSideRandom);
        isoscelesTrapezoid.setLateralSide(lateralSideRandom);
        isoscelesTrapezoid.setColor(getRandomColor());
        return isoscelesTrapezoid;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        int randomRadius = random.nextInt(MAX_RANDOM_NUMBER);
        circle.setColor(getRandomColor());
        circle.setRadius(randomRadius);
        return circle;
    }
}



