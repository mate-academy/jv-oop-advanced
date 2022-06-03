package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure figure = new Circle(8);
        System.out.println(figure.area());
        figure.draw();
    }

}
