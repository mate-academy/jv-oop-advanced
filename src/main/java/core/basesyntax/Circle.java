package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void printParameter() {
        System.out.println(" Figure: Circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + color);
    }

    public int lengthCircle() {
        return (int) (Math.PI * radius * 2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
