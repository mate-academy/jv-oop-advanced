package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_SIZE = 10;
    private static final int MAX_SIZE = 40;
    private static final String DEFAULT_COLOR = Color.WHITE.toString();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    public String getDefaultFigure() {
        return new Circle(DEFAULT_SIZE, DEFAULT_COLOR).toString();
    }

    public int getRandomSize() {
        return random.nextInt(MAX_SIZE);
    }

    public String getRandomFigure() {
        int index = random.nextInt(Figures.values().length);
        String figure = Figures.values()[index].toString();
        if (figure.equals("CIRCLE")) {
            return new Circle(getRandomSize(), colorSupplier.getRandomColor()).toString();
        }
        if (figure.equals("SQUARE")) {
            return new Square(getRandomSize(), colorSupplier.getRandomColor()).toString();
        }
        if (figure.equals("RIGHT_TRIANGLE")) {
            return new RightTriangle(getRandomSize(), colorSupplier.getRandomColor()).toString();
        }
        if (figure.equals("RECTANGLE")) {
            return new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                    getRandomSize()).toString();
        } else {
            return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomSize(),getRandomSize(),
                    getRandomSize()).toString();
        }
    }
}
