package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int unitsLimit = (25 - 1) + 1;
    private static final int figureNumber = 4;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(figureNumber);
        switch (randomNumber) {
            case 0:
                Square square = new Square();
                square.setColor(supplier.getRandomColor().name());
                square.setSide(random.nextInt(unitsLimit));
                square.areaCalculator();
                return square;
            case 1:
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(supplier.getRandomColor().name());
                rectangle.setVerticalSide(random.nextInt(unitsLimit));
                rectangle.setHorizontalSide(random.nextInt(unitsLimit));
                rectangle.areaCalculator();
                return rectangle;
            case 2:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(supplier.getRandomColor().name());
                rightTriangle.setFirstLeg(random.nextInt(unitsLimit));
                rightTriangle.setSecondLeg(random.nextInt(unitsLimit));
                rightTriangle.areaCalculator();
                return rightTriangle;
            case 3:
                Circle circle = new Circle();
                circle.setColor(supplier.getRandomColor().name());
                circle.setRadius(random.nextInt(unitsLimit));
                circle.diameterCalculator();
                circle.areaCalculator();
                return circle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(supplier.getRandomColor().name());
                isoscelesTrapezoid.setUpperBase(random.nextInt(unitsLimit));
                isoscelesTrapezoid.setLowerBase(random.nextInt(unitsLimit));
                isoscelesTrapezoid.heightCalculator();
                isoscelesTrapezoid.areaCalculator();
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Color.WHITE.name());
        circle.setRadius(10);
        circle.diameterCalculator();
        circle.areaCalculator();
        return circle;
    }
}
