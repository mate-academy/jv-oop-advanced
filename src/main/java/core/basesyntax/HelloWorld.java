package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {

    public static void main(String[] args) {
        Figure[] figures = new Figure[5];

        figures[0] = new Square(Color.WHITE, 5.0);
        figures[1] = new Circle(Color.BLACK, 7);
        figures[2] = new Rectangle(Color.ORANGE, 4, 5);
        figures[3] = new RightTriangle(Color.BLUE, 4,5);
        figures[4] = new IsoscelesTrapezoid(Color.RED, 8,6,7);



        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }

    }

}
