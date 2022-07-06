package core.basesyntax;

public class Circle extends Figure{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int GetArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public String toDraw() {
        return null;
    }
}
