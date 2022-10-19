package core.basesyntax;
/**
 * Feel free to remove this class and create your own.
 */
public class Program {
    public static void main(String[] args) {
        Figure[] figures = { new Square("red"),
                             new Rectangle("green"),
                             new RightTriangle("blue"),
                             new Circle("black"),
                             new IsoscelesTrapezoid("white") };
        for (Figure figure: figures) {
            System.out.println(figure.color);
        }
    }
}
