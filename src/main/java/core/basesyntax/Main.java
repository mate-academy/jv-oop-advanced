package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "red");
        Square square = new Square(7.0, "green");
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid(3.0, 5.0, 4.0, "blue");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "yellow");
        RightTriangle triangle = new RightTriangle(3.0, 4.0, "purple");

        Drawable[] drawables = {circle, square, trapezoid, rectangle, triangle};

        for (Drawable drawable : drawables) {
            drawable.draw();
        }

        Figure[] figures = {
                new Circle(5.0, "red"),
                new Square(7.0, "green"),
                new IsoscelesTrapezoid(3.0, 5.0, 4.0, "blue"),
                new Rectangle(4.0, 6.0, "yellow"),
                new RightTriangle(3.0, 4.0, "purple")
        };

        for (Figure figure : figures) {
            System.out.println("Figure: " + figure.getClass().getSimpleName()
                    + ", area: " + figure.getArea() + " sq. units, color: " + figure.getColor());
        }
    }
}
