package core.basesyntax;
import java.util.Random;
public class FigureSupplier {
    private static final int FIGURES_COUNT = FigureEnum.values().length;
    private static final int DEFAULT_RADIUS = 10;
    private static final double MAX_RANDOM_VALUE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    public Figure getRandomFigure() {
        int figure = random.nextInt(FIGURES_COUNT);
        Color randomColor = colorSupplier.getRandomColor();
        switch (figure) {
            case 0:
                double randomRadius = getRandomValue();
                return new Circle(randomColor, randomRadius);
            case 1:
                double randomFirstBase = getRandomValue();
                double randomSecondBase = getRandomValue();
                double randomHeight = getRandomValue();
                return new IsoscelesTrapezoid(
                        randomColor, randomFirstBase, randomSecondBase, randomHeight);
            case 2:
                double randomFirstSide = getRandomValue();
                double randomSecondSide = getRandomValue();
                return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
            case 3:
                double randomFirstLeg = getRandomValue();
                double randomSecondLeg = getRandomValue();
                return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
            default:
                double randomSide = getRandomValue();
                return new Square(randomColor, randomSide);
        }
    }
    private double getRandomValue() {
        return random.nextDouble(MAX_RANDOM_VALUE);
    }
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
