package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANGE = 20;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier(random);
    private final Figure[] figures = {new Circle(), new Square(), new RightTriangle(),
            new Rectangle(), new IsoscelesTrapezoid()};

    public Figure getRandomFigure() {
        int randomNameFigure = random.nextInt(figures.length);
        switch (randomNameFigure) {
            case 0:
                Figure circle = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1);
                return circle;
            case 1:
                Figure square = new Square(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1);
                return square;
            case 2:
                Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1);
                return rightTriangle;
            case 3:
                Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1);
                return rectangle;
            default:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1,
                        random.nextInt(MAX_RANGE) + 1);
                return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
        return circle;
    }
}
