package core.basesyntax;

import java.util.Random;

public class FigureGenerator {

    private static final String[] colors = new String[]{"black", "white", "whatever"};
    private static final String[] figuresArray = new String[]{
            "circle", "right triangle", "rectangle", "square", "isosceles trapezoid"};

    public static Figure create() {
        switch (figuresArray[new Random().nextInt(5)]) {
            case "circle":
                return new Circle(getRandomColor(), getRandomNumber());
            case "right triangle":
                return new RightTriangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            case "rectangle":
                return new Rectangle(getRandomColor(), getRandomNumber(), getRandomNumber());
            case "square":
                return new Square(getRandomColor(), getRandomNumber());
            case "isosceles trapezoid":
                return new IsoscelesTrapezoid(getRandomColor(), getRandomNumber(),
                                                getRandomNumber(), getRandomNumber());
            default:
                System.exit(-1);
                return new Circle(getRandomColor(), getRandomNumber());
        }
    }

    public static String getRandomColor() {
        return colors[new Random().nextInt(3)];
    }

    public static int getRandomNumber() {
        return new Random().nextInt(200);
    }

}
