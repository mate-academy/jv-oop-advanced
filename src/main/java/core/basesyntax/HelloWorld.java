package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main (String[] args){
        Figure circle = new Circle();
        Figure square = new Square();
        square.color = Color.WHITE;
        square.getDetails();
        circle.getDetails();

    }
}
