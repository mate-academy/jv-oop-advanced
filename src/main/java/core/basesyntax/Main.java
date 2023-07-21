package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                String randomColor = colorSupplier.getRandomColor();
                switch (figureSupplier.getRandomFigure()) {
                    case CIRCLE:
                        double radius = random.nextInt(100);
                        figures[i] = new Circle(radius, randomColor);
                        break;
                    case SQUARE:
                        double side = random.nextInt(100);
                        figures[i] = new Square(side, randomColor);
                        break;
                    case RECTANGLE:
                        double length = random.nextInt(100);
                        double width = random.nextInt(100);
                        figures[i] = new Rectangle(length, width, randomColor);
                        break;
                    case ISOSCELES_TRAPEZOID:
                        double sideA = random.nextInt(100);
                        double sideB = random.nextInt(100);
                        double height = random.nextInt(100);
                        figures[i] = new IsoscelesTrapezoid(sideA, sideB, height, randomColor);
                        break;
                    case RIGHT_TRIANGLE:
                        double firstLeg = random.nextInt(100);
                        double secondLeg = random.nextInt(100);
                        figures[i] = new RightTriangle(firstLeg, secondLeg, randomColor);
                        break;
                    default:
                        break;
                }
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
            System.out.println(figures[i].draw());
        }

    }
}

