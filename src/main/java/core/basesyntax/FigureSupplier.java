package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random rg = new Random();
    private final ColorSupplier cs = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = rg.nextInt(Constant.NUMBER_OF_FIGURES);
        String randomColor = cs.getRandomColor();
        double range = Constant.MAX_DIMENSION - Constant.MIN_DIMENSION;
        double radius = Constant.MIN_DIMENSION + rg.nextDouble(range);
        double width = Constant.MIN_DIMENSION + rg.nextDouble(range);
        double height = Constant.MIN_DIMENSION + rg.nextDouble(range);
        double firstLeg = Constant.MIN_DIMENSION + rg.nextDouble(range);
        double secondLeg = Constant.MIN_DIMENSION + rg.nextDouble(range);
        double top = Constant.MIN_DIMENSION + rg.nextDouble(range);
        switch (randomNumber) {
            case 0: {
                return new Circle(randomColor, radius);
            }
            case 1: {
                return new Rectangle(randomColor, width, height);
            }
            case 2: {
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            }
            case 3: {
                return new Square(randomColor, width);
            }
            default: {
                return new IsoscelesTrapezoid(randomColor,width, height, top);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Constant.DEFAULT_COLOR, Constant.DEFAULT_CIRCLE_RADIUS);
    }
}
