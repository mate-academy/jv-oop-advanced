package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 25;
    private static final int DEFAULT_RADIUS = 10;
    private static final int TOTAL_NUMBER_OF_FIGURES = 5;
    Random random = new Random();
    Figure[] randomFigures = new Figure[TOTAL_NUMBER_OF_FIGURES];
    public Figure getRandomFigure() {
        randomFigures[0] = new IsoscelesTrapezoid(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
        randomFigures[1] = new RightTriangle(random.nextInt(MAX_SIZE),random.nextInt(MAX_SIZE));
        randomFigures[2] = new Rectangle(random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
        randomFigures[3] = new Circle(random.nextInt(MAX_SIZE));
        randomFigures[4] = new Square(random.nextInt(MAX_SIZE));
        int index = new Random().nextInt(randomFigures.length);
        return randomFigures[index];
    }
    public Figure getDefaultFigure() {
        Figure circle = new Circle(DEFAULT_RADIUS);
        circle.color = new ColorSupplier().getDefaultColor();
        return circle;
    }
    public void drawDefaultFigure() {
        System.out.println("Figure: circle, area: " + new Circle(DEFAULT_RADIUS).getArea() + " sq.units, radius: " +
                DEFAULT_RADIUS + " units, color: " + new ColorSupplier().getDefaultColor().toLowerCase());
    }
}
