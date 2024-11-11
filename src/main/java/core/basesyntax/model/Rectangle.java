package core.basesyntax;

public class Rectangle extends Figure implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
