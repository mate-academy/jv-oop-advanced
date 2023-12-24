package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX = 5;
    private static final int MIN = 1;
    private static final int N = 20;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        Figure randomFigure = null;

        int randomType = random.nextInt(MAX - MIN + MIN) + MIN;
        switch (randomType) {
            case 1 -> {
                Circle circle = new Circle();
                getRandomCircleParameters(circle);
                randomFigure = circle;
                return randomFigure;
            }
            case 2 -> {
                Rectangle rectangle = new Rectangle();
                getRandomRectangleParameters(rectangle);
                randomFigure = rectangle;
                return randomFigure;
            }
            case 3 -> {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                getRandomIsoscelesTrapezoidParameters(isoscelesTrapezoid);
                randomFigure = isoscelesTrapezoid;
                return randomFigure;
            }
            case 4 -> {
                RightTriangle rightTriangle = new RightTriangle();
                getRandomRightTriangleParameters(rightTriangle);
                randomFigure = rightTriangle;
                return randomFigure;
            }
            case 5 -> {
                Square square = new Square();
                getRandomSquareParameters(square);
                randomFigure = square;
                return randomFigure;
            }
            default -> getDefaultFigure();
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "Circle", Color.WHITE.name());
    }

    private void getRandomCircleParameters(Circle circle) {
        circle.setRadius(random.nextDouble() * N);
        circle.setName("Circle");
        circle.setColor(colorSupplier.getRandomColor());
    }

    private void getRandomRightTriangleParameters(RightTriangle rightTriangle) {
        rightTriangle.setCat1(random.nextDouble() * N);
        rightTriangle.setCat2(random.nextDouble() * N);
        rightTriangle.setName("RightTriangle");
        rightTriangle.setColor(colorSupplier.getRandomColor());
    }

    private void getRandomIsoscelesTrapezoidParameters(IsoscelesTrapezoid isoscelesTrapezoid) {
        isoscelesTrapezoid.setBottomBase(random.nextDouble() * N);
        isoscelesTrapezoid.setLateralSide(random.nextDouble() * N);
        isoscelesTrapezoid.setUpperBase(random.nextDouble() * N);
        isoscelesTrapezoid.setName("IsoscelesTrapezoid");
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
    }

    private void getRandomRectangleParameters(Rectangle rectangle) {
        rectangle.setSideA(random.nextDouble() * N);
        rectangle.setSideB(random.nextDouble() * N);
        rectangle.setName("Rectangle");
        rectangle.setColor(colorSupplier.getRandomColor());
    }

    private void getRandomSquareParameters(Square square) {
        square.setSide(random.nextDouble() * N);
        square.setName("Square");
        square.setColor(colorSupplier.getRandomColor());
    }
}
