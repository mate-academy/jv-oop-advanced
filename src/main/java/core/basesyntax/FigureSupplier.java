package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {
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

        Random figure = new Random();
        int randomFigure = figure.nextInt(5);
        Random property = new Random();

        Random randValues = new Random();

        int randomValue = randValues.nextInt(20);
        Figure[] figureList = new Figure[randomValue];

        for (int i = 0; i < randomValue; i++) {
            switch (figure.nextInt(5)) {
                case 0:
                    figureList[i] = new Circle(figures[0], parseColor.randomColor(),
                            circleProperties[property.nextInt(3)], randValues.nextInt(20));
                    break;
                case 1:
                    figureList[i] = new RightTriangle(figures[1], parseColor.randomColor(),
                            triangleProperties[property.nextInt(3)], randValues.nextInt(20),
                            randValues.nextInt(20));
                    break;
                case 2:
                    figureList[i] = new IsoscelesTrapezoid(figures[2], parseColor.randomColor(),
                            trapezoidProperties[property.nextInt(3)], randValues.nextInt(20),
                            randValues.nextInt(20), randValues.nextInt(20));
                    break;
                case 3:
                    figureList[i] = new Square(figures[3], parseColor.randomColor(),
                            squareProperties[property.nextInt(3)], randValues.nextInt(20));
                    break;
                case 4:
                    figureList[i] = new Rectangle(figures[4], parseColor.randomColor(),
                            rectangleProperties[property.nextInt(3)], randValues.nextInt(20),
                            randValues.nextInt(20));
                    break;
                default:
                    break;
            }
        }
        return figureList;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}


