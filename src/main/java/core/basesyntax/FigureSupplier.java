package core.basesyntax;

import core.basesyntax.service.Color;
import core.basesyntax.service.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public AbstractFigure getRandomFigure() {
        Random random = new Random();
        int figureType = random.nextInt(FigureType.values().length);

        switch (figureType) {
            case 0:
                return new Square(random.nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(random.nextDouble() * 10 + 1, random.nextDouble() * 10
                        + 1, colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(random.nextDouble() * 10
                        + 1, random.nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            case 3:
                return new Circle(random.nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextDouble() * 10
                        + 1, random.nextDouble() * 10 + 1, random
                        .nextDouble() * 10 + 1, colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();

        }
    }

    public AbstractFigure getDefaultFigure() {
        Color defaultColor = Color.WHITE;
        return new Circle(Constants.DEFAULT_RADIUS, defaultColor);
    }
}
