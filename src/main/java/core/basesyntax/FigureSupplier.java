package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int type = (int) (Math.random() * 5);
        Color color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                int radius = (int) (Math.random() * 100 + 1);
                return new Circle(color, radius);
            case 1:
                int side = (int) (Math.random() * 100 + 1);
                return new Square(color, side);
            case 2:
                int length = (int) (Math.random() * 100 + 1);
                int width = (int) (Math.random() * 100 + 1);
                return new Rectangle(color, length, width);
            case 3:
                int base = (int) (Math.random() * 100 + 1);
                int height = (int) (Math.random() * 100 + 1);
                return new RightTriangle(color, base, height);
            case 4:
                int longBase = (int) (Math.random() * 100 + 1);
                int shortBase = (int) (Math.random() * 100 + 1);
                int heightBase = (int) ((Math.random() * 100) + 1);
                return new IsoscelesTrapezoid(color, longBase, shortBase, heightBase);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        Color color = Color.WHITE;
        int radius = 10;
        return new Circle(color, radius);
    }
}
