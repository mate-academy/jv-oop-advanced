package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();
        int[] randomArray = {
                random.nextInt(100),
                random.nextInt(100),
                random.nextInt(100)};
        switch (figureNumber) {
            case 1:
                return generateCircle(randomArray, color);
            case 2:
                return generateIsoscelesTrapezoid(randomArray, color);
            case 3:
                return generateRectangle(randomArray, color);
            case 4:
                return generateRightTriangle(randomArray, color);
            default:
                return generateSquare(randomArray, color);

        }
    }

    private Square generateSquare(int[] randomArray, String color) {
        Square square = new Square(randomArray[0]);
        square.setColor(color);
        return square;
    }

    private RightTriangle generateRightTriangle(int[] randomArray, String color) {
        RightTriangle rightTriangle =
                new RightTriangle(randomArray[0], randomArray[1], randomArray[2]);
        rightTriangle.setColor(color);
        return rightTriangle;
    }

    private Rectangle generateRectangle(int[] randomArray, String color) {
        Rectangle rectangle = new Rectangle(randomArray[0], randomArray[1]);
        rectangle.setColor(color);
        return rectangle;
    }

    private IsoscelesTrapezoid generateIsoscelesTrapezoid(int[] randomArray, String color) {
        IsoscelesTrapezoid isoscelesTrapezoid =
                new IsoscelesTrapezoid(randomArray[0], randomArray[1], randomArray[2]);
        isoscelesTrapezoid.setColor(color);
        return isoscelesTrapezoid;
    }

    private Circle generateCircle(int[] randomArray, String color) {
        Circle circle = new Circle(randomArray[0]);
        circle.setColor(color);
        return circle;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        Color color = Color.values()[0];
        circle.setColor(color.name());
        return circle;
    }
}
