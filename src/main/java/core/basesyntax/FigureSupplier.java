package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 25;
    private static final int DEFAULT_RADIUS = 10;
    private static final int TOTAL_NUMBER_OF_FIGURES = 5;
    private Random random = new Random();

    public int getRandom() {
        return random.nextInt(MAX_SIZE);
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    Figure[] randomFigures = new Figure[TOTAL_NUMBER_OF_FIGURES];

    public Figure getRandomFigure() {
        randomFigures[0] = new IsoscelesTrapezoid(getRandom(), getRandom(), getRandom());
        randomFigures[1] = new RightTriangle(getRandom(), getRandom());
        randomFigures[2] = new Rectangle(getRandom(), getRandom());
        randomFigures[3] = new Circle(getRandom());
        randomFigures[4] = new Square(getRandom());
        int index = new Random().nextInt(randomFigures.length);
        return randomFigures[index];
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(new ColorSupplier().getDefaultColor());
        return circle;
    }

    public void drawDefaultFigure() {
        System.out.println("Figure: circle, area: " + new Circle(DEFAULT_RADIUS).getArea()
                + " sq.units, radius: " + DEFAULT_RADIUS + " units, color: "
                + new ColorSupplier().getDefaultColor().toLowerCase());
    }
}
