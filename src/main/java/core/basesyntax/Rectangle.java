package core.basesyntax;

public class Rectangle extends Figure {
    public Rectangle(String color) {
        super(color);
    }

    public Rectangle() {
    }

    @Override
    public void draw() {

        System.out.println("Figure: Rectangle, " + "color: " + super.getColor());
    }
}
