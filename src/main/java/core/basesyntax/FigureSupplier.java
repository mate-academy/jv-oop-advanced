package core.basesyntax;

import java.util.Random;

/**
 * The FigureSupplier class generates a random figure.
 */
public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;

    /**
     * Create an instance of Random class for generating random numbers
     */
    private Random random = new Random();
    /**
     * Create an instance of ColorSupplier class to get random colors
     */
    private ColorSupplier randomColor = new ColorSupplier();

    /**
     * Method to return a default Circle figure
     * @return the default figure
     */
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    /**
     * Method to generate a random figure
     * @return the random figure
     */
    public Figure getRandomFigure() {
        // get a random number between 0 and 5 (inclusive)
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);
        switch (figureNumber) { // choose a random figure based on the generated number
            case 1:
                // return a random Square figure
                return createRandomSquare();
            case 2:
                // return a random Rectangle figure
                return createRandomRectangle();
            case 3:
                // return a random RightTriangle figure
                return createRandomRightTriangle();
            case 4:
                // return a random Circle figure
                return createRandomCircle();
            case 5:
                // return a random IsoscelesTrapezoid figure
                return createRandomIsoscelesTrapezoid();
            default:
                // return the default Circle figure if the generated number is out of range
                return getDefaultFigure();
        }
    }

    /**
     * Method to create a random Square figure
     * @return return a new Square figure with a random color and size
     */
    private Figure createRandomSquare() {
        return new Square(randomColor.getRandomColor(), random.nextInt(101));
    }

    /**
     * Method to create a random Rectangle figure
     * @return a new Rectangle figure with a random color and size
     */
    private Figure createRandomRectangle() {
        return new Rectangle(randomColor.getRandomColor(),
                random.nextInt(101), random.nextInt(101));
    }

    /**
     * Method to create a random RightTriangle figure
     * @return a new RightTriangle figure with a random color and size
     */
    private Figure createRandomRightTriangle() {
        return new RightTriangle(randomColor.getRandomColor(),
                random.nextInt(101), random.nextInt(101));
    }

    /**
     * Method to create a random Circle figure
     * @return a new Circle figure with a random color and size
     */
    private Figure createRandomCircle() {
        return new Circle(randomColor.getRandomColor(), random.nextInt(101));
    }

    /**
     * Method to create a random IsoscelesTrapezoid figure
     * @return a new IsoscelesTrapezoid figure with a random color and size
     */
    private Figure createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomColor.getRandomColor(), random.nextInt(101),
                random.nextInt(101), random.nextInt(101));
    }
}
