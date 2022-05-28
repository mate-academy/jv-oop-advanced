package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS_CIRCLE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Circle circle = new Circle(random.nextInt(100), colorSupplier.getRandomColor());
    private IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(100),
            random.nextInt(100), random.nextInt(100), colorSupplier.getRandomColor());
    private Rectangle rectangle = new Rectangle(random.nextInt(100), random.nextInt(100),
            colorSupplier.getRandomColor());
    private RightTriangle rightTriangle = new RightTriangle(random.nextInt(100),
            random.nextInt(100), colorSupplier.getRandomColor());
    private Square square = new Square(random.nextInt(100), colorSupplier.getRandomColor());

    private String[] figures = new String[]{circle.toDraw(), isoscelesTrapezoid.toDraw(),
            rectangle.toDraw(), rightTriangle.toDraw(), square.toDraw()};

    public String getRandomFigure() {
        int index = random.nextInt(figures.length);
        return figures[index];
    }

    public String getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS_CIRCLE,Color.WHITE).toDraw();
    }
}
