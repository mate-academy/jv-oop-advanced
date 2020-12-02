package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    private static final String[] figuresArray = new String[]{
            "circle", "right triangle", "rectangle", "square", "isosceles trapezoid"};

    public static Figure create() {
        switch (figuresArray[new Random().nextInt(figuresArray.length)]) {
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
                System.exit(404);
                return null;
        }
    }

    private static Colors getRandomColor() {
        return Colors.values()[new Random().nextInt(Colors.values().length)];
    }

    public static int getRandomNumber() {
        return new Random().nextInt(200);
    }

}
