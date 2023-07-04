package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure createCircle() {
        double radius = random.nextDouble() * 100;
        Figure circle = new Circle(colorSupplier.getRandomColor(), radius);
        return circle;
    }

    public Figure createRectangle() {
        double firstLeg = random.nextDouble() * 100;
        double secondLeg = random.nextDouble() * 100;
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
        return rectangle;
    }

    public Figure createRightTriangle() {
        double firstLeg = random.nextDouble() * 100;
        double secondLeg = random.nextDouble() * 100;
        Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(), firstLeg,
                secondLeg);
        return rightTriangle;
    }

    public Figure createIsoscelesTrapezoid() {
        double firstSide = random.nextDouble() * 100;
        double secondSide = random.nextDouble() * 100;
        double height = random.nextDouble() * 100;
        Figure trapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), firstSide,
                secondSide, height);
        return trapezoid;
    }

    public Figure createSquare() {
        double side = random.nextDouble() * 100;
        Figure square = new Square(colorSupplier.getRandomColor(), side);
        return square;
    }

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[5];
        figures[0] = createCircle();
        figures[1] = createRectangle();
        figures[2] = createRightTriangle();
        figures[3] = createIsoscelesTrapezoid();
        figures[4] = createSquare();
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public Figure getDefaultFigure() {
        Figure defaultFigure = new Circle(Color.WHITE.name(), 10.0);
        return defaultFigure;
    }
}
