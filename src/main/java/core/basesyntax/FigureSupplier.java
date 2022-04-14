package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends Figure {

    private String[] figures = {"Circle", "Isosceles trapezoid",
            "Rectangle", "Right triangle", "Square"};

    public String[] getFigures() {
        return figures;
    }

    public void setFigures(String[] figures) {
        this.figures = figures;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (figures[random.nextInt(figures.length)]) {
            case "Circle":
                Circle circle = new Circle(random.nextInt(50));
                circle.setColor(colorSupplier.getRandomColor());
                return circle;
            case "Isosceles trapezoid":
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(50),
                        random.nextInt(50),random.nextInt(50));
                isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
                return isoscelesTrapezoid;
            case "Rectangle":
                Rectangle rectangle = new Rectangle(random.nextInt(50),random.nextInt(50));
                rectangle.setColor(colorSupplier.getRandomColor());
                return rectangle;
            case "Right triangle":
                RightTriangle rightTriangle = new RightTriangle(random.nextInt(50),
                        random.nextInt(50));
                rightTriangle.setColor(colorSupplier.getRandomColor());
                return rightTriangle;
            default:
                Square square = new Square(random.nextInt(50));
                square.setColor(colorSupplier.getRandomColor());
                return square;
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.setColor(Color.WHITE.toString());
        return circle;
    }

    @Override
    public void printSquareInfo() {
    }
}
