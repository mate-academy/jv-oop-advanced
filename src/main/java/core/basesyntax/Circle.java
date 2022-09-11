package core.basesyntax;

public class Circle extends Figure {
    private float radius = getSomething();

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public String printInfo() {
        setName("circle");
        System.out.println("Figure: " + getName() + ", area: "
                + getArea()
                + " cr.units, radius: " + radius
                + " units, color: " + getColor() + "\n");
        return null;
    }
}
