package core.basesyntax;

import core.basesyntax.models.Circle;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

import static core.basesyntax.Colors.WHITE;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = WHITE.name();
    public static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        double squareSide = random.nextDouble();
        double width = random.nextDouble();
        double height = random.nextDouble();
        double firstLeg = random.nextDouble();
        double secondLeg = random.nextDouble();
        double radius = random.nextDouble();
        double bottom = random.nextDouble();
        double top = random.nextDouble();
        double trapSide = random.nextDouble();
        int randomFigureIndex = random.nextInt(Figures.values().length);
        Figures figure = Figures.values()[randomFigureIndex];
        Figure randomFigure = switch (figure) {
            case SQUARE -> new Square(this.colorSupplier.getRandomColor(), squareSide);
            case RECTANGLE -> new Rectangle(this.colorSupplier.getRandomColor(), width, height);
            case RIGHT_TRIANGLE ->
                    new RightTriangle(this.colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case CIRCLE -> new Circle(this.colorSupplier.getRandomColor(), radius);
            case ISOSCELES_TRAPEZOID ->
                    new IsoscelesTrapezoid(
                            this.colorSupplier.getRandomColor(),
                            trapSide,
                            bottom,
                            top
                    );
        };
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
