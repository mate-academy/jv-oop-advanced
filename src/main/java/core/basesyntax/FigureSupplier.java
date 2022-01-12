package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
   ColorSupplier colorSupplier = new ColorSupplier();
   public Random random = new Random();
   public static final int FIGURE_COUNT = 5;
   public static final int FIGURE_MAX_VALUE = 9;

    public Figures getRandomFigure() {
        int randomFigureNumber = random.nextInt(FIGURE_COUNT);
        Figures result;
        switch (randomFigureNumber) {
            case 0 :
                Square square = new Square();
                square.setColor(colorSupplier.getRandomColor());
                int randomSide = random.nextInt(FIGURE_MAX_VALUE) + 1;
                square.setSide(randomSide);
                return square;
            case 1 :
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                int randomRadius = random.nextInt(FIGURE_MAX_VALUE) + 1;
                circle.setRadius(randomRadius);
                return circle;
            case 2 :
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                int randomTopLength = random.nextInt(FIGURE_MAX_VALUE) + 1;
                int randomBaseLength = random.nextInt(FIGURE_MAX_VALUE) + 1;
                int randomHeight = random.nextInt(FIGURE_MAX_VALUE) + 1;
                isoscelesTrapezoid.setTopLength(randomTopLength);
                isoscelesTrapezoid.setHeight(randomBaseLength);
                isoscelesTrapezoid.setBaseLength(randomHeight);
                return isoscelesTrapezoid;
            case 3 :
                Rectangle rectangle = new Rectangle();
                rectangle.setColor(colorSupplier.getRandomColor());
                int randomSideA = random.nextInt(FIGURE_MAX_VALUE) + 1;
                int randomSideB = random.nextInt(FIGURE_MAX_VALUE) + 1;
                rectangle.setSideA(randomSideA);
                rectangle.setSideB(randomSideB);
                return rectangle;
            case 4 :
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setColor(colorSupplier.getRandomColor());
                int randomFirstLeg = random.nextInt(FIGURE_MAX_VALUE) + 1;
                int randomSecondLeg = random.nextInt(FIGURE_MAX_VALUE) + 1;
                rightTriangle.setFirstLeg(randomFirstLeg);
                rightTriangle.setSecondLeg(randomSecondLeg);
                return rightTriangle;
            default : return null;
        }
    }

    public Figures getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(colorSupplier.getDefaultColor());
        return circle;
    }


}
