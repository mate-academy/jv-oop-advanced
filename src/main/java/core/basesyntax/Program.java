package core.basesyntax;
/**
 * Feel free to remove this class and create your own.
 */
public class Program {
    public static void main(String[] args) {
        Figure[] figures = { new Square("red", 10),
                             new Rectangle("green", 10, 20),
                             new RightTriangle("blue", 10 , 20),
                             new Circle("black", 10),
                             new IsoscelesTrapezoid("white") };
        for (Figure figure: figures) {
            System.out.println(figure.color);
        }
    }
}
