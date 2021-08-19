package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final int RANDOM_SIDE_RANGE = 20;
    private Random random = new Random();

    private int randomNumber(int num) {
        return random.nextInt(num) + 1;
    }

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();
        int figureNumber = randomNumber(FIGURE_COUNT);
        switch (figureNumber) {
            case 1:
                Square square = new Square();
                square.setColor(color);
                square.setSide(randomNumber(RANDOM_SIDE_RANGE));
                return square;
            case 2:
                Circle circle = new Circle();
                circle.setColor(color);
                circle.setRadius(randomNumber(RANDOM_SIDE_RANGE));
                return circle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(color);
                rightTriangle.setFirstLeg(randomNumber(RANDOM_SIDE_RANGE));
                rightTriangle.setSecondLeg(randomNumber(RANDOM_SIDE_RANGE));
                return rightTriangle;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(color);
                isoscelesTrapezoid.setUpSide(randomNumber(RANDOM_SIDE_RANGE));
                isoscelesTrapezoid.setDownSide(randomNumber(RANDOM_SIDE_RANGE));
                isoscelesTrapezoid.setHeight(randomNumber(RANDOM_SIDE_RANGE));
                return isoscelesTrapezoid;
            default:
                Square square1 = new Square();
                square1.setColor(color);
                square1.setSide(randomNumber(RANDOM_SIDE_RANGE));
                return square1;
        }
    }
}
