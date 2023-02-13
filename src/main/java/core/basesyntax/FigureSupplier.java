package core.basesyntax;

import core.basesyntax.figures.*;
import java.util.Random;

public class FigureSupplier {
    public static final int SIDE_LENGTH = 10;
    Random random = new Random();
    ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(Figure.FIGURES_NUMBER);
        switch (figureNumber) {
            case 0: return new Circle(random.nextInt(SIDE_LENGTH), colorSupplier.getRandomColor());
            case 1: return new Rectangle(random.nextInt(SIDE_LENGTH), random.nextInt(SIDE_LENGTH), colorSupplier.getRandomColor());
            case 2: return new RightTriangle(random.nextInt(SIDE_LENGTH), random.nextInt(SIDE_LENGTH), colorSupplier.getRandomColor());
            case 3: return new IsoscelesTrapezoid(random.nextInt(SIDE_LENGTH), random.nextInt(SIDE_LENGTH), random.nextInt(SIDE_LENGTH), colorSupplier.getRandomColor());
            case 4: return new Square(random.nextInt(SIDE_LENGTH), colorSupplier.getRandomColor());
            default: return this.getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(SIDE_LENGTH, Color.WHITE);
    }
}
