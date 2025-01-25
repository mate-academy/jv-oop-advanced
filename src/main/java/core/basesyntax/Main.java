package core.basesyntax;

import java.util.Random;

interface Figure {
    double getArea();
    void draw();
}

class Square implements Figure {
    private final String color;
    private final double side;

    public Square(String color, double side) {
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: " + side + " units, color: " + color);
    }
}

class Rectangle implements Figure {
    private final String color;
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq. units, length: " + length + " units, width: " + width + " units, color: " + color);
    }
}

class RightTriangle implements Figure {
    private final String color;
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + color);
    }
}

class Circle implements Figure {
    private final String color;
    private final double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius + " units, color: " + color);
    }
}

class IsoscelesTrapezoid implements Figure {
    private final String color;
    private final double base1;
    private final double base2;
    private final double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, base1: " + base1 + " units, base2: " + base2 + " units, height: " + height + " units, color: " + color);
    }
}

class ColorSupplier {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "black", "white"};

    public String getRandomColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}

class FigureSupplier {
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5); // 0 to 4 for five types
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Square(color, random.nextDouble() * 10 + 1); // side between 1 and 10
            case 1 ->
                    new Rectangle(color, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1); // length and width between 1 and 10
            case 2 ->
                    new RightTriangle(color, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1); // legs between 1 and 10
            case 3 -> new Circle(color, random.nextDouble() * 10 + 1); // radius between 1 and 10
            case 4 ->
                    new IsoscelesTrapezoid(color, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1); // bases and height between 1 and 10
            default -> throw new IllegalArgumentException("Unexpected figure type: " + figureType);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}