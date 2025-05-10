package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        Random random = new Random();
        int figureNumber = random.nextInt(FIGURE_COUNT);

        switch (figureNumber) {
            case 1:
                return new Circle(color.getRandomColor(), getLength());
            case 2:
                return new Square(color.getRandomColor(), getLength());
            case 3:
                return new Rectangle(color.getRandomColor(), getLength(), getLength());
            case 4:
                return new RightTriangle(color.getRandomColor(), getLength(),
                        getLength(), getLength());
            default:
                return new IsoscelesTrapezoid(color.getRandomColor(), getLength(),
                        getLength(), getLength());
        }
    }

    private int getLength() {
        return new Random().nextInt(100);
    }
}
