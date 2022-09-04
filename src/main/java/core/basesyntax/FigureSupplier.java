package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 25;
    private static final int DEFAULT_RADIUS = 10;
    private static final int TOTAL_NUMBER_OF_FIGURES = 5;

    private Figure[] randomFigure = new Figure[TOTAL_NUMBER_OF_FIGURES];
    private Random random = new Random();

    public int getRandom() {
        return random.nextInt(MAX_SIZE);
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setRandomFigure(Figure[] randomFigure) {
        this.randomFigure = randomFigure;
    }

    public Figure getRandomFigure() {
        randomFigure[0] = new IsoscelesTrapezoid(getRandom(), getRandom(), getRandom());
        randomFigure[1] = new RightTriangle(getRandom(), getRandom());
        randomFigure[2] = new Rectangle(getRandom(), getRandom());
        randomFigure[3] = new Circle(getRandom());
        randomFigure[4] = new Square(getRandom());
        int index = new Random().nextInt(randomFigure.length);
        return randomFigure[index];
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
