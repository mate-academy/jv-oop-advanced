package core.basesyntax;

import core.basesyntax.lists.FiguresList;
import java.util.Random;

public class FigureSupplier {
    public Figures getRandomFigure() {
        // to get a random name of figure from list
        Random random = new Random();
        int index = random.nextInt(FiguresList.values().length);
        String randomFigureName = String.valueOf(FiguresList.values()[index]);
        //creating random color
        String color = new ColorSupplier().getRandomColor();

        //depending on the choice, create a figure
        Figures result = null;
        switch (randomFigureName) {
            case ("rectangle"):
                int longSide = random.nextInt(100);
                int shortSide = random.nextInt(100);
                Figures rectangle = new Rectangle(longSide, shortSide, color);
                result = rectangle;
                break;

            case ("square"):
                int side = random.nextInt(100);
                Figures square = new Square(side, color);
                result = square;
                break;

            case ("triangle"):
                int firstLeg = random.nextInt(100);
                int secondLeg = random.nextInt(100);
                Figures rightTriangle = new RightTriangle(firstLeg, secondLeg, color);
                result = rightTriangle;
                break;

            case ("circle"):
                int radius = random.nextInt(100);
                Figures circle = new Circle(radius, color);
                result = circle;
                break;

            default:
                int longSide1 = random.nextInt(100);
                int shortSide1 = random.nextInt(100);
                int height = random.nextInt(100);
                Figures isoscelesTrapezoid = new IsoscelesTrapezoid(longSide1,
                        shortSide1, height, color);
                result = isoscelesTrapezoid;
                break;
        }
        return result;
    }

    public Figures getDefaultFigure() {
        Circle circle = new Circle(10, "white");
        return circle;
    }
}

