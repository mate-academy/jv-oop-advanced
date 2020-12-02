package core.basesyntax;

public class Circle extends Figure implements Area {
    private int radius;

    @Override
    public int areaFigure() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void printParameter() {
        System.out.println(" Figure: Circle, area: " + areaFigure()
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
