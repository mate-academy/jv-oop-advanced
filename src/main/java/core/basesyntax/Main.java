package core.basesyntax;

import java.util.Random;

enum Color {
    RED, BLUE, YELLOW, GREEN, ORANGE, PURPLE, PINK, WHITE;

    public static Color getRandomColor() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}

interface Figure {
    double getArea();
    void draw();
}

class Square implements Figure {
    private final double side;
    private final Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Рисунок: квадрат, площа: " + getArea() + " кв. од., сторона: " + side + " од., колір: " + color);
    }
}

class Rectangle implements Figure {
    private final double length;
    private final double width;
    private final Color color;

    public Rectangle(double length, double width, Color color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Рисунок: прямокутник, площа: " + getArea() + " кв. од., довжина: " + length +
                " од., ширина: " + width + " од., колір: " + color);
    }
}

class RightTriangle implements Figure {
    private final double leg1;
    private final double leg2;
    private final Color color;

    public RightTriangle(double leg1, double leg2, Color color) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * leg1 * leg2;
    }

    @Override
    public void draw() {
        System.out.println("Рисунок: прямий трикутник, площа: " + getArea() + " кв. од., перша нога: " + leg1 +
                " од., друга нога: " + leg2 + " од., колір: " + color);
    }
}

class Circle implements Figure {
    private final double radius;
    private final Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисунок: круг, площа: " + getArea() + " кв. од., радіус: " + radius + " од., колір: " + color);
    }
}

class IsoscelesTrapezoid implements Figure {
    private final double base1;
    private final double base2;
    private final double leg;
    private final Color color;

    public IsoscelesTrapezoid(double base1, double base2, double leg, Color color) {
        this.base1 = base1;
        this.base2 = base2;
        this.leg = leg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * leg;
    }

    @Override
    public void draw() {
        System.out.println("Рисунок: рівнобедрена трапеція, площа: " + getArea() + " кв. од., основа 1: " + base1 +
                " од., основа 2: " + base2 + " од., нога: " + leg + " од., колір: " + color);
    }
}

class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);

        return switch (figureNumber) {
            case 0 -> new Square(random.nextDouble() * 10 + 1, Color.getRandomColor());
            case 1 -> new Rectangle(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, Color.getRandomColor());
            case 2 ->
                    new RightTriangle(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, Color.getRandomColor());
            case 3 -> new Circle(random.nextDouble() * 10 + 1, Color.getRandomColor());
            case 4 -> new IsoscelesTrapezoid(random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1,
                    random.nextDouble() * 10 + 1, Color.getRandomColor());
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 3; i++) {
            Figure randomFigure = figureSupplier.getRandomFigure();
            randomFigure.draw();
        }

        for (int i = 0; i < 3; i++) {
            Figure defaultFigure = figureSupplier.getDefaultFigure();
            defaultFigure.draw();
        }
    }
}
