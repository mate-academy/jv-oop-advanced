package core.basesyntax;

import org.w3c.dom.css.Rect;

import java.util.Random;

public class FigureSupplier {

    String[] figures = {"Circle", "Isosceles trapezoid", "Rectangle", "Right triangle", "Square"};
    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();

        switch (figures[random.nextInt(figures.length)]) {
            case "Circle":
                Circle circle = new Circle(random.nextInt(50));
                circle.color = colorSupplier.getRandomColor();
                return circle;
            case "Isosceles trapezoid":
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(50),random.nextInt(50),random.nextInt(50));
                isoscelesTrapezoid.color = colorSupplier.getRandomColor();
                return isoscelesTrapezoid;
            case "Rectangle":
                Rectangle rectangle = new Rectangle(random.nextInt(50),random.nextInt(50));
                rectangle.color = colorSupplier.getRandomColor();
                return rectangle;
            case "Right triangle":
                RightTriangle rightTriangle = new RightTriangle(random.nextInt(50), random.nextInt(50));
                rightTriangle.color = colorSupplier.getRandomColor();
                return rightTriangle;
            default:
                Square square = new Square(random.nextInt(50));
                square.color = colorSupplier.getRandomColor();
                return square;

        }
    }
    public Figure getDefaultFigure() {
        Circle circle = new Circle(10);
        circle.color = Color.WHITE.toString();
        return circle;
    }
}
