package core.basesyntax.entity;

public class Circle extends Figure implements FigureBehaviour {
    public final static int MAX_RADIUS = 25;
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void printSquare() {

    }
}
