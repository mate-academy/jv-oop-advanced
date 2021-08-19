package core.basesyntax.figure;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = (int)(Math.random() * 5);
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();
        switch (randomIndex) {
            case 0:
                return new Circle(getRandomNum(), randomColor);
            case 1:
                return new Rectangle(getRandomNum(), getRandomNum(), randomColor);
            case 2:
                return new Square(getRandomNum(), randomColor);
            case 3:
                return new Trapezoid(getRandomNum(), getRandomNum(), getRandomNum(), randomColor);
            default:
                return new Triangle(getRandomNum(), getRandomNum(), randomColor);
        }
    }

    private int getRandomNum() {
        return (int)(Math.random() * 20);
    }
}
