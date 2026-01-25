package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {new Circle(Color.WHITE, 10),
                new Square(Color.RED, 7),
        new Rectangle(Color.BLUE, 9, 12)};
        for (Figure f : figures) {
            if (f != null) {
                System.out.println(f.draw());
            }
        }
    }
}
