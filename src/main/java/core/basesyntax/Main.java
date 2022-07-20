package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Square(Color.RED, 5.6).draw());

        System.out.println();

        System.out.println(new Rectangle(Color.YELLOW, 3.6, 4).draw());

        System.out.println();

        System.out.println(new RightTriangle(Color.WHITE, 4, 7).draw());

        System.out.println();

        System.out.println(new Circle(Color.YELLOW, 4.5).draw());

        System.out.println();

        System.out.println(new IsoscelesTrapezoid(Color.GREEN, 15, 17.6, 10).draw());
    }
}
