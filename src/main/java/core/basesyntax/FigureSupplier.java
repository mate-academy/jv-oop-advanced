package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 1:
                Circle circle = generateCircle(color);
                return circle;
            case 2:
                IsoscelesTrapezoid isoscelesTrapezoid = generateIsoscelesTrapezoid(color);
                return isoscelesTrapezoid;
            case 3:
                Rectangle rectangle = generateRectangle(color);
                return rectangle;
            case 4:
                RightTriangle rightTriangle = generateRightTriangle(color);
                return rightTriangle;
            default:
                Square square = generateSquare(color);
                return square;
        }
    }

    private Square generateSquare(String color) {
        Square square = new Square();
        square.setSide(random.nextInt(100));
        square.color = color;
        return square;
    }

    private RightTriangle generateRightTriangle(String color) {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setBase(random.nextInt(100));
        rightTriangle.setAltitude(random.nextInt(100));
        rightTriangle.color = color;
        return rightTriangle;
    }

    private Rectangle generateRectangle(String color) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(random.nextInt(100));
        rectangle.setWidth(random.nextInt(100));
        rectangle.color = color;
        return rectangle;
    }

    private IsoscelesTrapezoid generateIsoscelesTrapezoid(String color) {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(random.nextInt(100));
        isoscelesTrapezoid.setBottomSide(random.nextInt(100));
        isoscelesTrapezoid.setTopSide(random.nextInt(100));
        isoscelesTrapezoid.color = color;
        return isoscelesTrapezoid;
    }

    private Circle generateCircle(String color) {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(100));
        circle.color = color;
        return circle;
    }

    public Figure getDefaultFigure() {
        Color whiteColor = Color.values()[0];
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.color = String.valueOf(whiteColor);
        return circle;
    }
}
