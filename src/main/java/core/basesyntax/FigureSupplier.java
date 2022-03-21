package core.basesyntax;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        ColourSupplier colourSupplier = new ColourSupplier();
        String randomColor = colourSupplier.getRandomColor();
        switch (figureNumber) {
            case 1:
                int radius = random.nextInt(100);
                return new Circle(randomColor, radius);
            case 2:
                int firstLeg = random.nextInt(100);
                int secondLeg = random.nextInt(100);
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            case 3:
                int firstSide = random.nextInt(100);
                int secondSide = random.nextInt(100);
                return new Rectangle(randomColor, firstSide, secondSide);
            case 4:
                int side = random.nextInt(100);
                return new Square(randomColor, side);
            default: //case 0:
                int base = random.nextInt(100);
                int upperSide = random.nextInt(100);
                int leg = random.nextInt(100);
                int height = random.nextInt(100);
                return new IsoscelesTrapezoid(randomColor, base, upperSide, leg, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE), 10);
    }
}
