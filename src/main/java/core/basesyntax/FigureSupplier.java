package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
    //generating figures with random properties.
    public static final int FIGURE_COUNT = 5;
    private static final Color white = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private final String color = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        switch (figureType) {
            case 0 : {
                return new Circle(color, random.nextInt(10) + 1);
            }
            case 1 : {
                return new Square(color, random.nextInt(10) + 1);
            }
            case 2 : {
                return new Rectangle(color, random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            }
            case 3 : {
                return new RightTriangle(color,random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
            }
            case 4 : {
                return new IsoscelesTrapezoid(color,random.nextInt(10) + 1,
                                                    random.nextInt(10) + 1,
                                                    random.nextInt(10) + 1)
                        ;
            }

            default:
                return new Figure();
        }

    }

    public Figure getDefaultFigure() {
        return new Circle(white.name(), 10);
    }
}
