package core.basesyntax.supplier;

import core.basesyntax.shape.Circle;
import core.basesyntax.shape.IsoscelesTrapezoid;
import core.basesyntax.shape.Rectangle;
import core.basesyntax.shape.RightTriangle;
import core.basesyntax.shape.Shape;
import core.basesyntax.shape.Square;
import core.basesyntax.type.Color;

public class ShapeSupplier extends BasicRandomValueSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public Shape getRandom() {
        Color color = colorSupplier.getRandom();
        double randomDouble1 = randomGenerator.nextDouble();
        double randomDouble2 = randomGenerator.nextDouble();
        double randomDouble3 = randomGenerator.nextDouble();

        int randomShapePick = randomGenerator.nextInt(Shape.SHAPES_COUNT);

        switch (randomShapePick) {
            case 0:
                return new Square(color, randomDouble1);
            case 1:
                return new Rectangle(color, randomDouble1, randomDouble2);
            case 2:
                return new RightTriangle(color, randomDouble1, randomDouble2);
            case 3:
                return new IsoscelesTrapezoid(color, randomDouble1, randomDouble2, randomDouble3);
            default:
                return new Circle(color, randomDouble1);
        }
    }

    @Override
    public Shape getDefault() {
        return new Circle(colorSupplier.getDefault(), DEFAULT_RADIUS);
    }
}
