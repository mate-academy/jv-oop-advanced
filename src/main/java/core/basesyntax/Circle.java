package core.basesyntax;

public class Circle extends Figure {
    private static final int MAX_RADIUS = 15;
    private int radius;

    public Circle() {
        radius = this.getRandom().nextInt(MAX_RADIUS);
        this.setColor();
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public Double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        System.out.format("Figure: circle, area: %f, radius: %d, color: %s",
                this.getArea(), this.getRadius(), this.getColor());
    }
}
