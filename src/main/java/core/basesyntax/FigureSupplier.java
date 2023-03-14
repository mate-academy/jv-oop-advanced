package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int CIRCLE_RADIUS = 10;
    public static final int MAX_OF_BOUND = 40;
    public static final String COLOR = "white";
    private Random random = new Random();
    private final Figure defaultFigure = new Circle(CIRCLE_RADIUS);

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[]{
                new Circle(random.nextInt(MAX_OF_BOUND)),
                new IsoscelesTrapezoid(random.nextInt(MAX_OF_BOUND), random.nextInt(MAX_OF_BOUND),
                        random.nextInt(MAX_OF_BOUND)),
                new Rectangle(random.nextInt(MAX_OF_BOUND), random.nextInt(MAX_OF_BOUND)),
                new RightTriangle(random.nextInt(MAX_OF_BOUND), random.nextInt(MAX_OF_BOUND)),
                new Square(random.nextInt(MAX_OF_BOUND))};
        return figures[random.nextInt(figures.length)];
    }

    public Figure getDefaultFigure() {
        defaultFigure.setColor(COLOR);
        return defaultFigure;
    }
}
