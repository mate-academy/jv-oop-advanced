package core.basesyntax.suppliers;

import core.basesyntax.colors.Color;
import core.basesyntax.figures.*;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_SIZE = 10;
    private static final int MAX_SIZE = 40;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int MIN_VALUE = 1;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public String getDefaultFigure() {
        return new Circle(DEFAULT_SIZE, DEFAULT_COLOR).getDraw();
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE);
    }

    public String getRandomFigure() {
        int index = random.nextInt(MIN_VALUE, Figures.values().length);
        String result = "";
        switch (index) {
            case 1:
                result = new Circle(getRandomSize(), colorSupplier.getRandomColor()).getDraw();
            case 2:
                result = new Square(getRandomSize(), colorSupplier.getRandomColor()).getDraw();
            case 3:
                result = new RightTriangle(getRandomSize(), colorSupplier.getRandomColor()).getDraw();
            case 4:
                result = new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize()).getDraw();
            case 5:
                result = new SoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize(), getRandomSize()).getDraw();
        }
        return result;
    }
}
