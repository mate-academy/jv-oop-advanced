package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 25;
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_FIGURE_NUMBER = 4;
    private static final String DEFAULT_COLOR = Colors.WHITE.toString();

    private Random random = new Random();
    private Figure figure = new Figure() {
        @Override
        public void draw() {

        }

        @Override
        public double getArea() {
            return 0;
        }
    };

    public int getRandom() {
        return random.nextInt(MAX_SIZE);
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    Figure getRandomCircle() {
        return new Circle(getRandom());
    }

    Figure getRandomSquare() {
        return new Square(getRandom());
    }

    Figure getRandomRectangle() {
        return new Rectangle(getRandom(), getRandom());
    }

    Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandom(), getRandom(), getRandom());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(getRandom(), getRandom());
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(RANDOM_FIGURE_NUMBER);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRightTriangle();
            default:
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        System.out.println("Figure: circle, area: " + circle.getArea()
                + " sq.units, radius: " + DEFAULT_RADIUS + " units, color: "
                + DEFAULT_COLOR.toLowerCase());
        return circle;
    }
}
