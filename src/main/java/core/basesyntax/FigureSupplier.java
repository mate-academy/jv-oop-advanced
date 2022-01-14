package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNT = 5;
    private static final int VALUE = 9;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figures getRandomFigure() {
        int randomFigureNumber = random.nextInt(COUNT);
        switch (randomFigureNumber) {
            case 0 :
                return getRandomSquare();
            case 1 :
                return getRandomCircle();
            case 2 :
                return getRandomSIsoscelesTrapezoid();
            case 3 :
                return getRandomRectangle();
            default :
                return getRandomRightTriangle();
        }
    }

    private Square getRandomSquare() {
        Square randomSquare = new Square();
        randomSquare.setColor(colorSupplier.getRandomColor());
        int randomSide = random.nextInt(VALUE) + 1;
        randomSquare.setSide(randomSide);
        return randomSquare;
    }

    private Circle getRandomCircle() {
        Circle randomCircle = new Circle();
        randomCircle.setColor(colorSupplier.getRandomColor());
        int randomRadius = random.nextInt(VALUE) + 1;
        randomCircle.setRadius(randomRadius);
        return randomCircle;
    }

    private IsoscelesTrapezoid getRandomSIsoscelesTrapezoid() {
        IsoscelesTrapezoid randomIsoscelesTrapezoid = new IsoscelesTrapezoid();
        randomIsoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        int randomTopLength = random.nextInt(VALUE) + 1;
        int randomBaseLength = random.nextInt(VALUE) + 1;
        int randomHeight = random.nextInt(VALUE) + 1;
        randomIsoscelesTrapezoid.setTopLength(randomTopLength);
        randomIsoscelesTrapezoid.setHeight(randomBaseLength);
        randomIsoscelesTrapezoid.setBaseLength(randomHeight);
        return randomIsoscelesTrapezoid;
    }

    private Rectangle getRandomRectangle() {
        Rectangle randomRectangle = new Rectangle();
        randomRectangle.setColor(colorSupplier.getRandomColor());
        int randomSideA = random.nextInt(VALUE) + 1;
        int randomSideB = random.nextInt(VALUE) + 1;
        randomRectangle.setSideA(randomSideA);
        randomRectangle.setSideB(randomSideB);
        return randomRectangle;
    }

    private RightTriangle getRandomRightTriangle() {
        RightTriangle randomRightTriangle = new RightTriangle();
        randomRightTriangle.setColor(colorSupplier.getRandomColor());
        int randomFirstLeg = random.nextInt(VALUE) + 1;
        int randomSecondLeg = random.nextInt(VALUE) + 1;
        randomRightTriangle.setFirstLeg(randomFirstLeg);
        randomRightTriangle.setSecondLeg(randomSecondLeg);
        return randomRightTriangle;
    }

    public Figures getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(colorSupplier.getDefaultColor());
        return circle;
    }
}
