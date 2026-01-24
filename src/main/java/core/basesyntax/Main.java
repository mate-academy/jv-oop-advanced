package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {new Circle(Color.WHITE, 10),
                new Square(Color.RED, 7)};
        for (Figure f : figures) {
            if (f != null) {
                System.out.println(f.draw());
            }
        }
    }
}
