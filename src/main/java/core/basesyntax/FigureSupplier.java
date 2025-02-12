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

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(NUMBER_OF_FIGURES);
        String color;
        BigDecimal bd;

        switch (figureType) {
            case 0:
                bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
                bd = bd.setScale(1, RoundingMode.HALF_UP);
                double side = bd.doubleValue();
                color = ColorSupplier.getRandomColor();
                return new Square(side, color);
            case 1:
                bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
                bd = bd.setScale(1, RoundingMode.HALF_UP);
                double smallSide = bd.doubleValue();
                bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
                bd = bd.setScale(1, RoundingMode.HALF_UP);
                double bigSide = bd.doubleValue();
                color = ColorSupplier.getRandomColor();
                return new Rectangle(smallSide, bigSide, color);
            case 2:
                bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
                bd = bd.setScale(1, RoundingMode.HALF_UP);
                double firstLeg = bd.doubleValue();
                bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
                bd = bd.setScale(1, RoundingMode.HALF_UP);
                double secondLeg = bd.doubleValue();
                color = ColorSupplier.getRandomColor();
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3:
                bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
                bd = bd.setScale(1, RoundingMode.HALF_UP);
                double radius = bd.doubleValue();
                color = ColorSupplier.getRandomColor();
                return new Circle(radius, color);
            default:
                bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
                bd = bd.setScale(1, RoundingMode.HALF_UP);
                double smallBase = bd.doubleValue();
                bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
                bd = bd.setScale(1, RoundingMode.HALF_UP);
                double bigBase = bd.doubleValue();
                bd = BigDecimal.valueOf(RANDOM.nextDouble(MAX_SIZE) + 1);
                bd = bd.setScale(1, RoundingMode.HALF_UP);
                double height = bd.doubleValue();
                color = ColorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(smallBase, bigBase, height, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
