package core.basesyntax;

public class Circle extends Figure implements Drawable {
    private  int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return 0;
    }
    @Override
    public String draw() {
        return null;
    }
}
