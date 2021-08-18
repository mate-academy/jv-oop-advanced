package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int RANDOM_SIDE_RANGE = 20;

    private String color() {
        return new ColorSupplier().getRandomColor();
    }

    private int randomNumber(int num) {
        Random random = new Random();
        return random.nextInt(num) + 1;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureNumber = randomNumber(FIGURE_COUNT);

        switch (figureNumber) {
            case 1:
                Square square = new Square();
                square.setColor(color());
                square.setSide(randomNumber(RANDOM_SIDE_RANGE));
                return square;

            case 2:
                Circle circle = new Circle();
                circle.setColor(color());
                circle.setRadius(randomNumber(RANDOM_SIDE_RANGE));
                return circle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(color());
                rightTriangle.setFirstLeg(randomNumber(RANDOM_SIDE_RANGE));
                rightTriangle.setSecondLeg(randomNumber(RANDOM_SIDE_RANGE));
                return rightTriangle;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(color());
                isoscelesTrapezoid.setUpSide(randomNumber(RANDOM_SIDE_RANGE));
                isoscelesTrapezoid.setDownSide(randomNumber(RANDOM_SIDE_RANGE));
                isoscelesTrapezoid.setHeight(randomNumber(RANDOM_SIDE_RANGE));
                return isoscelesTrapezoid;
            default:
                return new Figure();
        }
    }
}
