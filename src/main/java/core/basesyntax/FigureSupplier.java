package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int LIMIT = 100;

    public Figure getRandomFigure() {
        Random random = new Random();
        String randomFigure = TypesOfFigures.values()[random
                .nextInt(TypesOfFigures.values().length)].name();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure figure = new Figure();
        switch (randomFigure) {
            case ("CIRCLE"):
                Circle circle = new Circle();
                circle.setName("Circle");
                circle.setRadius(random.nextInt(LIMIT));
                circle.setColor(colorSupplier.getRandomColor());
                figure = circle;
                break;
            case ("SQUARE"):
                Square square = new Square();
                square.setName("Square");
                square.setSide(random.nextInt(LIMIT));
                square.setColor(colorSupplier.getRandomColor());
                figure = square;
                break;
            case ("RECTANGLE"):
                Rectangle rectangle = new Rectangle();
                rectangle.setName("Rectangle");
                rectangle.setSideOne(random.nextInt(LIMIT));
                rectangle.setSideTwo(random.nextInt(LIMIT));
                rectangle.setColor(colorSupplier.getRandomColor());
                figure = rectangle;
                break;
            case ("RIGHT_TRIANGLE"):
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setName("Right Triangle");
                rightTriangle.setFirstLeg(random.nextInt(LIMIT));
                rightTriangle.setSecondLeg(random.nextInt(LIMIT));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                figure = rightTriangle;
                break;
            case ("ISOSCELES_TRAPEZOID"):
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setName("Isosceles Trapezoid");
                isoscelesTrapezoid.setLeg(random.nextInt(LIMIT));
                isoscelesTrapezoid.setBase(random.nextInt(LIMIT));
                isoscelesTrapezoid.setTop(random.nextInt(LIMIT));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                figure = isoscelesTrapezoid;
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setRadius((10));
        circle.setColor("WHITE");
        return circle;
    }
}
