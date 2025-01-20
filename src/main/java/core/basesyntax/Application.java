package core.basesyntax;

public class Application {
    public static void main(String[] args) {

        Square square = new Square("Blue", 7);
        square.GetPrint();

        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid("Red", 10, 13,6);
        isoscelesTrapezoid.GetPrint();



    }
}
