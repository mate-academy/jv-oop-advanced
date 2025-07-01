package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_NUMBER = 6;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int num = random.nextInt(MAX_NUMBER);
        Figure figure = createNewFigure(num);

        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle("white",10);
        return figure;
    }

    public Figure createNewFigure(int number) {

        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor();

        if (number == 0) {
            return new Square(color,5.0);
        } else if (number == 1) {
            return new RightTriangle(color,8.0,5.0);
        } else if (number == 2) {
            return new Rectangle(color,6.0,7.0);
        } else if (number == 3) {
            return new IsoscelesTrapezoid(color,8.0,12.0,5.0,4.0);
        } else if (number == 4) {
            return new Circle(color,8.0);
        } else {
            return getDefaultFigure();
        }
    }
}
