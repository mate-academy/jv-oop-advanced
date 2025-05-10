package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_FIGURE = 5;
    private static final int RANDOM_PROPERTY = 3;
    private static final int RANDOM_VALUE = 20;

    public Figure[] figureGen() {
        ColorSupplier parseColor = new ColorSupplier();

        String[] figures = new String[]{"circle", "right triangle", "isosceles  trapezoid",
                "square", "rectangle"};
        String[] triangleProperties = new String[]{"pyramids are not triangular",
                "a triangle has three angles", "angle sum = 180 degrees"};
        String[] circleProperties = new String[]{"the circle is round",
                "diameter of a circle is the longest chord", "square circles matter"};
        String[] trapezoidProperties = new String[]{"complicated name", "nice sides",
                "beautiful angels"};
        String[] squareProperties = new String[]{"it's a square", "very square",
                "much square"};
        String[] rectangleProperties = new String[]{"nothing to see here",
                "rectangular shape", "nothing to be added"};

        Random property = new Random();
        Random randomValues = new Random();
        Random figure = new Random();

        int arrayLength = randomValues.nextInt(RANDOM_VALUE);
        Figure[] figureList = new Figure[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            switch (figure.nextInt(RANDOM_FIGURE)) {
                case 0:
                    figureList[i] = new Circle(figures[0], parseColor.randomColor(),
                            circleProperties[property.nextInt(RANDOM_PROPERTY)],
                            randomValues.nextInt(RANDOM_VALUE));
                    break;
                case 1:
                    figureList[i] = new RightTriangle(figures[1], parseColor.randomColor(),
                            triangleProperties[property.nextInt(RANDOM_PROPERTY)],
                            randomValues.nextInt(RANDOM_VALUE), randomValues.nextInt(RANDOM_VALUE));
                    break;
                case 2:
                    figureList[i] = new IsoscelesTrapezoid(figures[2], parseColor.randomColor(),
                            trapezoidProperties[property.nextInt(RANDOM_PROPERTY)],
                            randomValues.nextInt(RANDOM_VALUE), randomValues.nextInt(RANDOM_VALUE),
                            randomValues.nextInt(RANDOM_VALUE));
                    break;
                case 3:
                    figureList[i] = new Square(figures[3], parseColor.randomColor(),
                            squareProperties[property.nextInt(RANDOM_PROPERTY)],
                            randomValues.nextInt(RANDOM_VALUE));
                    break;
                case 4:
                    figureList[i] = new Rectangle(figures[4], parseColor.randomColor(),
                            rectangleProperties[property.nextInt(RANDOM_PROPERTY)],
                            randomValues.nextInt(RANDOM_VALUE), randomValues.nextInt(RANDOM_VALUE));
                    break;
                default:
                    break;
            }
        }
        return figureList;
    }
}


