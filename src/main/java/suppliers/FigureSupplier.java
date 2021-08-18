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
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure figure;
        switch (figureNumber) {
            case 0 :
                figure = new Square(colorSupplier.getRandomColor(), random.nextInt(20));
                break;
            case 1 :
                figure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
                break;
            case 2 :
                figure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(20), random.nextInt(20));
                break;
            case 3 :
                figure = new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(20));
                break;
            case 4 :
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
