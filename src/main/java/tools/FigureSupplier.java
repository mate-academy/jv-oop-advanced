package tools;

import figure.Circle;
import figure.Figure;
import figure.IsoscelesTrapezoid;
import figure.Rectangle;
import figure.RightTriangle;
import figure.Square;
import java.util.Random;

public class FigureSupplier {

    public static final int MAX_COUNT_FIGURE = 6;
    public static final int MIN_COUNT_FIGURE = 3;
    public static final int COUNT_FIGURE = 5;

    public Figure getRandomFigure() {
        int randomFigureCase = new Random().nextInt(COUNT_FIGURE);
        switch (randomFigureCase) {
            case 0:
                return new Circle("Сircle");
            case 1:
                return new Square("Square");
            case 2:
                return new Rectangle("Rectangle");
            case 3:
                return new RightTriangle("RightTriangle");
            case 4:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid");
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("Circle",10, Color.White);
    }
}
