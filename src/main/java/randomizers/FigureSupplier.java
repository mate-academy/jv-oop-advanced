package randomizers;

import core.figures.Circle;
import core.figures.IsoscelesTrapezoid;
import core.figures.Rectangle;
import core.figures.RightTriangle;
import core.figures.Square;
import java.util.Random;
import randomizers.sourcerand.Colors;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public String getRandomFigure(int i) {
        switch (i) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public String getDefaultFigure() {
        return new Circle(Colors.WHITE,10).drawFigure();
    }

    private String getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), RANDOM.nextInt(15)).drawFigure();
    }

    private String getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), RANDOM.nextInt(15)).drawFigure();
    }

    private String getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                RANDOM.nextInt(15),
                RANDOM.nextInt(15)).drawFigure();
    }

    private String getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                RANDOM.nextInt(15),
                RANDOM.nextInt(15)).drawFigure();
    }

    private String getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                RANDOM.nextInt(15),
                RANDOM.nextInt(10),
                RANDOM.nextInt(10)).drawFigure();
    }
}
