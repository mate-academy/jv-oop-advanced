package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;

    private String color() {
        return new ColorSupplier().getRandomColor();
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureNumber = random.nextInt(FIGURE_COUNT) + 1;

        switch (figureNumber) {
            case 1:
                Square square = new Square();
                square.setColor(color());
                square.setSide(random.nextInt(100) + 1);
                return square;

            case 2:
                Circle circle = new Circle();
                circle.setColor(color());
                circle.setRadius(random.nextInt(100) + 1);
                return circle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(color());
                rightTriangle.setFirstLeg(random.nextInt(100) + 1);
                rightTriangle.setSecondLeg(random.nextInt(100) + 1);
                return rightTriangle;
            case 4:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(color());
                isoscelesTrapezoid.setUpSide(random.nextInt(100) + 1);
                isoscelesTrapezoid.setDownSide(random.nextInt(100) + 1);
                isoscelesTrapezoid.setHeight(random.nextInt(100) + 1);
                return isoscelesTrapezoid;
            default:
                return new Figure();
        }
    }
}
