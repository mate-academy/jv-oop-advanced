package suppliers;

import figures.Circle;
import figures.Figure;
import figures.IsoscelesTrapezoid;
import figures.Rectangle;
import figures.RightTriangle;
import figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int SQUARE = 0;
    public static final int RECTANGLE = 1;
    public static final int RIGHT_TRIANGLE = 2;
    public static final int CIRCLE = 3;
    public static final int ISOSCELES_TRAPEZOID = 4;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (figureNumber) {
            case SQUARE:
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(20));
                break;
            case RECTANGLE:
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
                break;
            case RIGHT_TRIANGLE:
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
                break;
            case CIRCLE:
                figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(20));
                break;
            case ISOSCELES_TRAPEZOID:
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20), random.nextInt(20));
                break;
            default :
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(20));
                break;
        }
        return figure;
    }
}
