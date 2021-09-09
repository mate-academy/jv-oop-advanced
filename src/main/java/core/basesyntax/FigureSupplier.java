package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static String getRandomFigure() {
        Random figure = new Random();
        int num = figure.nextInt(5) + 1;
        String info = "";

        switch (num) {
            case (1):
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setParameters(Math.abs(figure.nextInt(10) + 1),
                        Math.abs(figure.nextInt(10) + 1),Math.abs(figure.nextInt(10) + 1));
                info = isoscelesTrapezoid.behaviour();
                break;
            case (2):
                Square square = new Square();
                square.setParameters(Math.abs(figure.nextInt(10) + 1));
                info = square.behaviour();
                break;
            case (3):
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setParameters(Math.abs(figure.nextInt(10) + 1),
                        Math.abs(figure.nextInt(10) + 1));
                info = rightTriangle.behaviour();
                break;
            case (4):
                Circle circle = new Circle();
                circle.setParameters(Math.abs(figure.nextInt(10) + 1));
                info = circle.behaviour();
                break;
            case (5):
                Rectangle rectangle = new Rectangle();
                rectangle.setParameters(Math.abs(figure.nextInt(10) + 1),
                        Math.abs(figure.nextInt(10) + 1));
                info = rectangle.behaviour();
                break;
            default:
                info = "";
        }
        return info;
    }

}
