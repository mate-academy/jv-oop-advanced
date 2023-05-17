package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle(int radius) {
        this.setName("circle");
        this.setRadius(radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double obtainArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        super.draw();
        StringBuilder builder = new StringBuilder();
        builder.append(", radius: ");
        builder.append(this.getRadius());
        builder.append(" units");
        System.out.println(builder.toString());
    }

}
