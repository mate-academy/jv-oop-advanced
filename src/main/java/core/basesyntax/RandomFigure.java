package core.basesyntax;

import java.util.Random;

public class RandomFigure {
    private static final String[] figures = new String[]
            {"Square", "Rectangle", "RightTriangle", "Circle", "IsoscelesTrapezoid"};

    public Figure getFigure() {

        int colorIndex = new Random().nextInt(Color.values().length);
        Color randomColor = Color.values()[colorIndex];

        switch (figures[new Random().nextInt(figures.length)]) {
            case "Square":
                double side = new Random().nextInt(15);
                return new Square(side, randomColor.toString());
            case "Rectangle":
                double sideA = new Random().nextInt(15);
                double sideB = new Random().nextInt(20);
                return new Rectangle(sideA, sideB, randomColor.toString());
            case "RightTriangle":
                double sideT = new Random().nextInt(15);
                double base = new Random().nextInt(20);
                return new RightTriangle(sideT, base, randomColor.toString());
            case "Circle":
                double radius = new Random().nextInt(20);
                return new Circle(radius, randomColor.toString());
            case "IsoscelesTrapezoid":
                double topSide = new Random().nextInt(20);
                double bottomSide = new Random().nextInt(30);
                double height = new Random().nextInt(20);
                return new IsoscelesTrapezoid(topSide, bottomSide, height, randomColor.toString());
            default:
                double random = new Random().nextInt(15);
                return new Square(random, randomColor.toString());
        }
    }
}
