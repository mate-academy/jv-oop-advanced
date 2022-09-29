package core.basesyntax.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_OF_SIZES = 100;
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(5);
        switch (randomNumber) {
            case 0:
                return figureSupplier.getRandomProperties(new Square());
            case 1:
                return figureSupplier.getRandomProperties(new Rectangle());
            case 2:
                return figureSupplier.getRandomProperties(new RightTriangle());
            case 3:
                return figureSupplier.getRandomProperties(new Circle());
            default:
                return figureSupplier.getRandomProperties(new IsoscelesTrapezoid());
        }
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(10, "white");
        return figure;
    }

    public Figure getRandomProperties(Figure figure) {
        String randomColor = colorSupplier.getRandomColor();
        String className = figure.getClass().getSimpleName();
        switch (className) {
            case "Circle":
                int randomRadius = random.nextInt(BOUND_OF_SIZES);
                return new Circle(randomRadius, randomColor);
            case "Rectangle":
                int randomLength = random.nextInt(BOUND_OF_SIZES);
                int randomWidth = random.nextInt(BOUND_OF_SIZES);
                return new Rectangle(randomLength, randomWidth, randomColor);
            case "IsoscelesTrapezoid":
                int rndTop = random.nextInt(BOUND_OF_SIZES);
                int rndDown = random.nextInt(BOUND_OF_SIZES);
                int rndHeight = random.nextInt(BOUND_OF_SIZES);
                return new IsoscelesTrapezoid(rndTop, rndDown, rndHeight, randomColor);
            case "RightTriangle":
                int randomFirstLeg = random.nextInt(BOUND_OF_SIZES);
                int randomSecondLeg = random.nextInt(BOUND_OF_SIZES);
                return new RightTriangle(randomFirstLeg, randomSecondLeg, randomColor);
            default:
                int randomSide = random.nextInt(BOUND_OF_SIZES);
                return new Square(randomSide, randomColor);
        }
    }
}
