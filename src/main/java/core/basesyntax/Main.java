package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
public static void main(String[] args){
Circle circle = new Circle(4, Color.RED);
Rectangle rectangle = new Rectangle(5, 3, Color.RED);
Figure circle2 = new Circle(4, Color.BLACK);

System.out.println(circle.draw());
    System.out.println(rectangle.draw());
}
}
