package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Figure[] figuresArr = new Figure[5];
        figuresArr[0] = new Circle();
        figuresArr[1] = new Rectangle();
        figuresArr[2] = new Square();
        figuresArr[3] = new Trapezoid();
        figuresArr[4] = new Triangle();
        return figuresArr[new Random().nextInt(4)];
    }

    public static Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor(Color.WHITE);
        return circle;
    }
}
