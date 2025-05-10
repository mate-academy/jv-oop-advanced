package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int variableA = random.nextInt(10);
    private int variableB = random.nextInt(10);
    private int variableC = random.nextInt(10);

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0 :
                Circle circle = new Circle();
                circle.setColor(colorSupplier.getRandomColor());
                circle.setRadius(variableA);
                return circle;
            case 1 :
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setSideTriangle(variableA);
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            case 2 :
                Rectangle rectangle = new Rectangle();
                rectangle.setSideARectangle(variableA);
                rectangle.setSideBRectangle(variableB);
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case 3 :
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.setBottomBase(variableA);
                isoscelesTrapezoid.setTopBase(variableB);
                isoscelesTrapezoid.setHeight(variableC);
                return isoscelesTrapezoid;
            default:
                Square square = new Square();
                square.setSideOfSquare(variableA);
                square.setColor(colorSupplier.getRandomColor());
                return square;
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle();
        defaultCircle.setColor("white");
        defaultCircle.setRadius(10);
        return defaultCircle;
    }
}
