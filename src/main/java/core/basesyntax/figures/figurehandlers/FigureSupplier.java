package core.basesyntax.figures.figurehandlers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 4; //from 0 to 4
    private final Random random = new Random();

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(FIGURES_COUNT) + 1;

        switch (randomIndex) {
            case 1: {
                String color = colorSupplier.getRandomColor();
                int radius = random.nextInt(30) + 1;
                return new Circle(color, radius);
            }
            case 2: {
                String color = colorSupplier.getRandomColor();
                int lowBase = random.nextInt(30) + 1;
                int highBase = random.nextInt(30) + 31;
                int leg = random.nextInt(20) + 1;
                int height = random.nextInt(10) + 1;
                return new IsoscelesTrapezoid(color, lowBase, highBase, leg, height);
            }
            case 3: {
                String color = colorSupplier.getRandomColor();
                int hypotenuse = random.nextInt(60) + 31;
                int firstLeg = random.nextInt(30) + 1;
                int secondLeg = random.nextInt(20) + 1;
                return new RightTriangle(color, hypotenuse, firstLeg, secondLeg);
            }
            case 4: {
                String color = colorSupplier.getRandomColor();
                int firstSide = random.nextInt(30) + 1;
                int secondSide = random.nextInt(20) + 1;
                return new Rectangle(color, firstSide, secondSide);
            }
            case 5: {
                String color = colorSupplier.getRandomColor();
                int side = random.nextInt(100) + 1;
                return new Square(color, side);
            }
            default:
                return new Circle("White", 10);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("White", 10);
    }
}
