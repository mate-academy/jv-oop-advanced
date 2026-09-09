package core.basesyntax;

// [ERROR] /Users/ansachuk/Desktop/PROJECTS/jv-oop-advanced/src/main/java/core/
// basesyntax/Figure.java:2:1: 'import' should be separated from previous line. [EmptyLineSeparator]

import core.basesyntax.enums.Colors;
import core.basesyntax.enums.Figures;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private final int maxSideBound = 20;
    /*
    * [ERROR] /Users/ansachuk/Desktop/PROJECTS/jv-oop-advanced/src/main/
     java/core/basesyntax/FigureSupplier.java:13:23:
     Abbreviation in name 'MAX_SIDE_BOUND' must contain no more\
      than '2' consecutive capital letters. [AbbreviationAsWordInName]
    *[ERROR] /Users/ansachuk/Desktop/PROJECTS/jv-oop-advanced/src/main/
    java/core/basesyntax/FigureSupplier.java:13:23:
    Member name 'MAX_SIDE_BOUND' must match pattern '^[a-z][a-z0-9][a-zA-Z0-9]*$'. [MemberName]
    *I got errors on mvn clean package if I change it how you say
    *  static final int MAX_SIDE_BOUND = 20;
    */
    private final Random random = new Random();
    private final ColorSupplier cs = new ColorSupplier(random);
    private Figure defaultFigure = new Circle(Colors.white.name(), 10);

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(Figures.values().length);
        String randomColor = cs.getRandomColor();

        switch (Figures.values()[figureIndex]) {
            case SQUARE:
                return new Square(randomColor,
                        random.nextInt(maxSideBound));
            case RECTANGLE:
                return new Rectangle(randomColor,
                        random.nextInt(maxSideBound),
                        random.nextInt(maxSideBound));
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor,
                        random.nextInt(maxSideBound),
                        random.nextInt(maxSideBound));
            case CIRCLE:
                return new Circle(randomColor,
                        random.nextInt(maxSideBound));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(maxSideBound),
                        random.nextInt(maxSideBound),
                        random.nextInt(maxSideBound));
            default:
                return defaultFigure;
        }
    }

    public Figure getDefaultFigure() {
        return defaultFigure;
    }
}
