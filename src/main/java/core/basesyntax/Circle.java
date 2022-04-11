package core.basesyntax;

public class Circle extends Figure implements FigureBehaviour {
    private double radius;

    public void setColor(String color) {
        super.setColor(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Circle setRandomParameters() {
        Circle circle = new Circle();
        circle.radius = Main.getRandom().nextInt(maxParameterLength);
        return circle;
    }

    @Override
    public double calculateArea() {
        return (Math.PI * this.radius * this.radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + this.calculateArea()
                + " sq.units, radius: "
                + this.getRadius()
                + " units, color: "
                + this.getColor()
                + "\n");

    }
}
