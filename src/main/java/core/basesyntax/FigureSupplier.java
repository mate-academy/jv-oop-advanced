package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();
        Random random = new Random();
        Figure figure;
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                double side = random.nextDouble();
                figure = new Square(side, color);
                break;
            case 2:
                double side1 = random.nextDouble();
                double side2 = random.nextDouble();
                figure = new Rectangle(side1, side2, color);
                break;
            case 3:
                double firstLeg = random.nextDouble();
                double secondLeg = random.nextDouble();
                figure = new RightTriangle(firstLeg, secondLeg, color);
                break;
            case 4:
                double radius = random.nextDouble();
                figure = new Circle(radius, color);
                break;
            default:
                double firstbase = random.nextDouble();
                double secondbase = random.nextDouble();
                double height = random.nextDouble();
                figure = new IsoscelesTrapezoid(firstbase, secondbase, height, color);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
