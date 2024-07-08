package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getDefaultFigure() {
        final int DEFOUT_RADIUS = 10;
        final Color DEFOULT_COLOR = Color.WHITE;

        return new Circle(DEFOUT_RADIUS, DEFOULT_COLOR);
    }

    public Figure getRandomFigure() {
        final int MAX_COUNT = 5;
        int number = new Random().nextInt(MAX_COUNT);
        ColorSupplier colorSupplier = new ColorSupplier();
        int index = new Random().nextInt(MAX_COUNT);

        switch (index) {
            case 0:
                return new Circle(number, colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(number, number, colorSupplier.getRandomColor());
            case 2:
                return new IsoscelesTrapezoid(number, number, number, colorSupplier.getRandomColor());
            case 3:
                return new RightTriangle(number, number, colorSupplier.getRandomColor());
            case 4:
                return new Square(number, colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }
}
