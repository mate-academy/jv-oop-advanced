package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private final int figureCount = 5;
    private final int figureMaxValue = 9;

    public Figures getRandomFigure() {
        int randomFigureNumber = random.nextInt(figureCount);
        switch (randomFigureNumber) {
            case 0 :
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                int randomSide = random.nextInt(figureMaxValue) + 1;
                square.setSide(randomSide);
                return square;
            case 1 :
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                int randomRadius = random.nextInt(figureMaxValue) + 1;
                circle.setRadius(randomRadius);
                return circle;
            case 2 :
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                int randomTopLength = random.nextInt(figureMaxValue) + 1;
                int randomBaseLength = random.nextInt(figureMaxValue) + 1;
                int randomHeight = random.nextInt(figureMaxValue) + 1;
                isoscelesTrapezoid.setTopLength(randomTopLength);
                isoscelesTrapezoid.setHeight(randomBaseLength);
                isoscelesTrapezoid.setBaseLength(randomHeight);
                return isoscelesTrapezoid;
            case 3 :
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                int randomSideA = random.nextInt(figureMaxValue) + 1;
                int randomSideB = random.nextInt(figureMaxValue) + 1;
                rectangle.setSideA(randomSideA);
                rectangle.setSideB(randomSideB);
                return rectangle;
            default :
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                int randomFirstLeg = random.nextInt(figureMaxValue) + 1;
                int randomSecondLeg = random.nextInt(figureMaxValue) + 1;
                rightTriangle.setFirstLeg(randomFirstLeg);
                rightTriangle.setSecondLeg(randomSecondLeg);
                return rightTriangle;
        }
    }

    public Figures getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(colorSupplier.getDefaultColor());
        return circle;
    }
}
