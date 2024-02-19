package core.basesyntax.suppliers;

import core.basesyntax.colors.Color;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figures;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
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
        int index = random.nextInt(MIN_VALUE, Figures.values().length + MIN_VALUE);
        String result = "";
        switch (index) {
            case 1:
                result = new Circle(getRandomSize(), colorSupplier.getRandomColor()).getDraw();
                break;
            case 2:
                result = new Square(getRandomSize(), colorSupplier.getRandomColor()).getDraw();
                break;
            case 3:
                result = new RightTriangle(getRandomSize(), colorSupplier.getRandomColor())
                        .getDraw();
                break;
            case 4:
                result = new Rectangle(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize()).getDraw();
                break;
            case 5:
                result = new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSize(),
                        getRandomSize(), getRandomSize()).getDraw();
                break;
            default:
                break;
        }
        return result;
    }
}
