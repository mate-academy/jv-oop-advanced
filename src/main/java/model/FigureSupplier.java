package model;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10, ColorOfFigure.WHITE.name());
    }

    public Figure getRandomFigure() {
        int index = new Random().nextInt(5);

        switch (index) {
            case 0: return getRandomCircle();
            case 1: return getRandomIsoscelesTrapezoid();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            case 4: return getRandomSquare();
            default: return getDefaultFigure();
        }
    }

    private Figure getRandomCircle() {
        int radius = new Random().nextInt(20);
        String color = colorSupplier.getRandomColorOfFigure().name();
        Circle circle = new Circle(radius, color);
        return circle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int base1 = new Random().nextInt(20);
        int base2 = new Random().nextInt(20);
        int height = new Random().nextInt(20);
        String color = colorSupplier.getRandomColorOfFigure().name();
        return new IsoscelesTrapezoid(base1, base2, height, color);
    }

    private Figure getRandomRectangle() {
        int side1 = new Random().nextInt(20);
        int side2 = new Random().nextInt(20);
        String color = colorSupplier.getRandomColorOfFigure().name();
        Rectangle rectangle = new Rectangle(side1, side2, color);
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        int leg1 = new Random().nextInt(20);
        int leg2 = new Random().nextInt(20);
        String color = colorSupplier.getRandomColorOfFigure().name();
        RightTriangle rightTriangle = new RightTriangle(leg1, leg2, color);
        return rightTriangle;
    }

    private Figure getRandomSquare() {
        int side = new Random().nextInt(20);

        String color = colorSupplier.getRandomColorOfFigure().name();
        Square square = new Square(side, color);
        return square;
    }
}




