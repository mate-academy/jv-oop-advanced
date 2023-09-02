package core.basesyntax.suppliers;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.enums.Colors;
import core.basesyntax.figures.*;
import java.util.Random;

public class FigureSupplier {
    private final Circle circle = new Circle();
    private final IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    private final Rectangle rectangle = new Rectangle();
    private final RightTriangle rightTriangle = new RightTriangle();
    private final Square square = new Square();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int ALL_FIGURES = 5;
    private static final int DEF_PARAMETER = 10;


    public Figure getRandomFigure() {
        Figure[] allFigures = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};
        int trueRandom = random.nextInt(ALL_FIGURES);
        switch (trueRandom) {
            case 0 : {
                circle.setRadius(random.nextInt(DEF_PARAMETER));
                circle.setColor(colorSupplier.getRandomColor());
                circle.draw();
                return circle;
            }
            case 1 : {
                isoscelesTrapezoid.setHeight(random.nextInt(DEF_PARAMETER));
                isoscelesTrapezoid.setParallelSide(random.nextInt(DEF_PARAMETER));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                isoscelesTrapezoid.draw();
                return isoscelesTrapezoid;
            }
            case 2 : {
                rectangle.setLength(random.nextInt(DEF_PARAMETER));
                rectangle.setWidth(random.nextInt(DEF_PARAMETER));
                rectangle.setColor(colorSupplier.getRandomColor());
                rectangle.draw();
                return rectangle;
            }
            case 3 : {
                rightTriangle.setBaseLeg(random.nextInt(DEF_PARAMETER));
                rightTriangle.setHeightLeg(random.nextInt(DEF_PARAMETER));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                rightTriangle.draw();
                return rightTriangle;
            }
            case 4 : {
                square.setSide(random.nextInt(DEF_PARAMETER));
                square.setColor(colorSupplier.getRandomColor());
                square.draw();
                return square;
            }
        }
        return allFigures[trueRandom];
    }


    public Figure getDefaultFigure() {
        circle.setRadius(10);
        circle.setColor(Colors.WHITE.name().toLowerCase());
        circle.draw();
        return circle;
    }
}
