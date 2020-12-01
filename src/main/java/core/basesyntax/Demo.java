package core.basesyntax;

public class Demo {
    public static void main(String[] args) {
        Figure circle = new Circle("White", 2);
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid("Red", 10, 7, 15);
        Figure rectangle = new Rectangle("Black", 10, 20);
        Figure rightTriangle = new RightTriangle("Blue", 5);
        Figure square = new Square("Yellow", 7);

        Figure[] figures = new Figure[]{circle, isoscelesTrapezoid, rectangle, rightTriangle, square};

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }

    public static void printInfo(Figure figure) {
        System.out.println(figure.toString());
    }
}
