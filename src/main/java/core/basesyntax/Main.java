package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Figure square1 = new Square("red", 4);
        Figure square2 = new Square("green", 7);
        Figure rectangle1 = new Rectangle("yellow", 6, 5);
        Figure rectangle2 = new Rectangle("black", 10, 6);
        Figure circle1 = new Circle("white", 5);
        Figure circle2 = new Circle("blue", 8);
        Figure isoscelesTrapezoid1 = new IsoscelesTrapezoid("black", 10, 5, 6);
        Figure isoscelesTrapezoid2 = new IsoscelesTrapezoid("green", 6, 4, 2);
        Figure rightTriangle1 = new RightTriangle("gray", 5);
        Figure rightTriangle2 = new RightTriangle("violet", 8);

        rectangle1.drawFigure();
        isoscelesTrapezoid2.drawFigure();

        Figure[] arrayOfFigure = new Figure[] {square1, square2, rectangle1, rectangle2, circle1,
            circle2, isoscelesTrapezoid1, isoscelesTrapezoid2, rightTriangle1, rightTriangle2};

        for (Figure figure : arrayOfFigure) {
            figure.infoAboutFigure();
        }
    }
}
