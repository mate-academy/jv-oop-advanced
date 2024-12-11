package core.basesyntax;

import core.basesyntax.models.Circle;
import core.basesyntax.models.IsoscelesTrapezoid;
import core.basesyntax.models.Rectangle;
import core.basesyntax.models.RightTriangle;
import core.basesyntax.models.Square;
import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
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
            case SQUARE -> new Square(ColorSupplier.getRandomColor(), squareSide);
            case RECTANGLE -> new Rectangle(ColorSupplier.getRandomColor(), width, height);
            case RIGHT_TRIANGLE ->
                    new RightTriangle(ColorSupplier.getRandomColor(), firstLeg, secondLeg);
            case CIRCLE -> new Circle(ColorSupplier.getRandomColor(), radius);
            case ISOSCELES_TRAPEZOID ->
                    new IsoscelesTrapezoid(ColorSupplier.getRandomColor(), trapSide, bottom, top);
        };
        return randomFigure;
    }

    public static Figure getDefaultFigure() {
        return new Circle("rgb(255, 255, 255)", 10.0);
    }
}
