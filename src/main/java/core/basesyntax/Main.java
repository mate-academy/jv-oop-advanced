package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure figure1 = new RightTriangle("Red", 3, 4);
        ((Drawable) figure1).draw(); // Використання Drawable замість Figure.Drawable
        System.out.println("Area: " + figure1.area() + ", Perimeter: " + figure1.perimeter());

        Figure figure2 = new Rectangle("Blue", 5, 7);
        ((Drawable) figure2).draw(); // Використання Drawable замість Figure.Drawable
        System.out.println("Area: " + figure2.area() + ", Perimeter: " + figure2.perimeter());

        Figure figure3 = new Square("Green", 6);
        ((Drawable) figure3).draw(); // Використання Drawable замість Figure.Drawable
        System.out.println("Area: " + figure3.area() + ", Perimeter: " + figure3.perimeter());

        Figure figure4 = new IsoscelesTrapezoid("Yellow", 4, 6, 5);
        ((Drawable) figure4).draw(); // Використання Drawable замість Figure.Drawable
        System.out.println("Area: " + figure4.area() + ", Perimeter: " + figure4.perimeter());
    }
}
