package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        IsoscelesTrapezoid blue = new IsoscelesTrapezoid("Blue", 3, 9, 3);
        System.out.println(blue.calculateArea());
        blue.draw();


    }
}
