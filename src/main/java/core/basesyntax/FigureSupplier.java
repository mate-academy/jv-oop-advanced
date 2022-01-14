package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 6;
    public static final double FIGURE_BOUNDARY = 10.0;
    public static final String DEFAULT_COLOR = "white";
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    private double generateNumber(double max) {
        double number = Math.round(random.nextDouble(max));
        if (number == 0) {
            return generateNumber(max);
        } else {
            return number;
        }
    }

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);

        switch(randomFigure){
            case 1:
                return new Circle(generateNumber(FIGURE_BOUNDARY), color.getRandomColor());
            case 2:
                return new Square(generateNumber(FIGURE_BOUNDARY), color.getRandomColor());
            case 3:
                return new RightTriangle(generateNumber(FIGURE_BOUNDARY), generateNumber(FIGURE_BOUNDARY), color.getRandomColor());
            case 4:
                return new Rectangle(generateNumber(FIGURE_BOUNDARY), generateNumber(FIGURE_BOUNDARY), color.getRandomColor());
            case 5:
                return new IsoscelesTrapezoid(generateNumber(FIGURE_BOUNDARY), generateNumber(FIGURE_BOUNDARY), generateNumber(FIGURE_BOUNDARY), color.getRandomColor());
        }
        return getRandomFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(FIGURE_BOUNDARY,DEFAULT_COLOR);
    }
}
