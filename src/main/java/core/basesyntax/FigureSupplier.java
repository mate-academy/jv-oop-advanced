package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT = 5;
    private static final int VALUE = 9;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    //    private Square getRandomSquare(Square square) {
    //        square.setColor(colorSupplier.getRandomColor());
    //        int randomSide = random.nextInt(VALUE) + 1;
    //        square.setSide(randomSide);
    //        return square;
    //    }

    public Figures getRandomFigure() {
        int randomFigureNumber = random.nextInt(COUNT);
        switch (randomFigureNumber) {
            case 0 :
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                int randomSide = random.nextInt(VALUE) + 1;
                square.setSide(randomSide);
                //square.getRandomSquare(square);
                return square;
            case 1 :
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                int randomRadius = random.nextInt(VALUE) + 1;
                circle.setRadius(randomRadius);
                return circle;
            case 2 :
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                int randomTopLength = random.nextInt(VALUE) + 1;
                int randomBaseLength = random.nextInt(VALUE) + 1;
                int randomHeight = random.nextInt(VALUE) + 1;
                isoscelesTrapezoid.setTopLength(randomTopLength);
                isoscelesTrapezoid.setHeight(randomBaseLength);
                isoscelesTrapezoid.setBaseLength(randomHeight);
                return isoscelesTrapezoid;
            case 3 :
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                int randomSideA = random.nextInt(VALUE) + 1;
                int randomSideB = random.nextInt(VALUE) + 1;
                rectangle.setSideA(randomSideA);
                rectangle.setSideB(randomSideB);
                return rectangle;
            default :
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                int randomFirstLeg = random.nextInt(VALUE) + 1;
                int randomSecondLeg = random.nextInt(VALUE) + 1;
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
