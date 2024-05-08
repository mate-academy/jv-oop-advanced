package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        // generate a specific figure based on the `figureNumber` value
        switch (figureNumber) {
            case 0:
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(random.nextInt(10));
                return circle;
            case 1:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setBottomSide(random.nextInt(1, 10));
                isoscelesTrapezoid.setTopSide(random.nextInt(1, 10));
                isoscelesTrapezoid.setHeight(random.nextInt(1, 10));
                return isoscelesTrapezoid;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.setFirstSide(random.nextInt(1, 10));
                rectangle.setSecondSide(random.nextInt(1, 10));
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.setFirstLeg(random.nextInt(1, 10));
                rightTriangle.setSecondLeg(random.nextInt(1, 10));
                return rightTriangle;
            default:
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                square.setSide(random.nextInt(10));
                return square;
        }
    }

    public Figure getDefaultFigure() {
        Circle defCircle = new Circle();
        defCircle.setColor("white");
        defCircle.setRadius(10);
        return defCircle;
    }
}
