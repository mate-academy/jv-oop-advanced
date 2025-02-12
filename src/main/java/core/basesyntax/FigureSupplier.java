package core.basesyntax;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final double MAX_SIZE = 10;
    private static final int NUMBER_OF_FIGURES = 5;


    public enum Figures {
        Square,
        Rectangle,
        RightTriangle,
        Circle,
        IsoscelesTrapezoid
    }

    public double getRandomSize() {
        BigDecimal bd;
        bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
        bd = bd.setScale(1, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(NUMBER_OF_FIGURES);
        String color;

        switch (figureType) {
            case 0:
                double side = getRandomSize();
                color = ColorSupplier.getRandomColor();
                return new Square(side, color);
            case 1:
                double smallSide = getRandomSize();
                double bigSide = getRandomSize();
                color = ColorSupplier.getRandomColor();
                return new Rectangle(smallSide, bigSide, color);
            case 2:
                double firstLeg = getRandomSize();
                double secondLeg = getRandomSize();
                color = ColorSupplier.getRandomColor();
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3:
                double radius = getRandomSize();
                color = ColorSupplier.getRandomColor();
                return new Circle(radius, color);
            default:
                double smallBase = getRandomSize();
                double bigBase = getRandomSize();
                double height = getRandomSize();
                color = ColorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(smallBase, bigBase, height, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
