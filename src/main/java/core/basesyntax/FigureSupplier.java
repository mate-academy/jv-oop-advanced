package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private Square square = new Square(colorSupplier.getRandomColor(), random.nextInt(10));
    private RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
            random.nextInt(10), random.nextInt(10));
    private Circle circle = new Circle(colorSupplier.getRandomColor(), random.nextInt(10));
    private IsoscelesTrapezoid isoscelesTrapezoid
            = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            random.nextInt(10), random.nextInt(10),
            random.nextInt(10));
    private Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
            random.nextInt(10),
            random.nextInt(10));
    private Figure [] figures = new Figure[] {square, rightTriangle, circle,
            isoscelesTrapezoid, rectangle};

    public Figure getRandomFigure() {
        return figures[(int)Math.floor(Math.random() * figures.length)];
    }

    public static Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
