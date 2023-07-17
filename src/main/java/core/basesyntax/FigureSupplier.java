package core.basesyntax;

import static core.basesyntax.Constant.COUNTER_FIGURE;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure;

        int randomNumber = random.nextInt(COUNTER_FIGURE);
        switch (randomNumber) {
            case 0 :
                figure = new Circle(colorSupplier.getRandomColor());
                break;
            case 1 :
                figure = new IsoscelesTrapezoid(colorSupplier.getRandomColor());
                break;
            case 2 :
                figure = new Rectangle(colorSupplier.getRandomColor());
                break;
            case 3 :
                figure = new RightTriangle(colorSupplier.getRandomColor());
                break;
            case 4 :
                figure = new Square(colorSupplier.getRandomColor());
                break;
            default:
                return getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
