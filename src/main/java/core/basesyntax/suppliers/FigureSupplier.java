package core.basesyntax.suppliers;

import core.basesyntax.Figure;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        int figureIndex = new Random().nextInt(Figures.values().length);
        Figures figures = Figures.values()[figureIndex];
        Random randomSize = new Random();

        if (figures.equals(Figures.Circle)) {
            return new Circle(randomSize.nextInt(9) + 1, colorGeneration());
        } else if (figures.equals(Figures.IsoscelesTrapezoid)) {
            return new IsoscelesTrapezoid(randomSize.nextInt(9) + 1, randomSize.nextInt(9) + 1,
                    randomSize.nextInt(9) + 1, colorGeneration());
        } else if (figures.equals(Figures.Rectangle)) {
            return new Rectangle(randomSize.nextInt(9) + 1,
                    randomSize.nextInt(9) + 1, colorGeneration());
        } else if (figures.equals(Figures.RightTriangle)) {
            return new RightTriangle(randomSize.nextInt(9) + 1,
                    randomSize.nextInt(9) + 1, colorGeneration());
        } else {
            return new Square(randomSize.nextInt(9) + 1, colorGeneration());
        }
    }

    public String colorGeneration() {
        ColorSupplier colorSupplier = new ColorSupplier();
        return colorSupplier.getRandomColor();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
