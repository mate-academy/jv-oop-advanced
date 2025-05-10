package classes;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        StringBuilder infoMessage = new StringBuilder("Figure: " + Figures.Circle.name() + ", ")
                .append("area: " + this.calculateArea() + " sq. units" + ", ")
                .append("radius: " + this.radius + " sq. units" + ", ")
                .append("color: " + this.getColor() + ".");
        return infoMessage.toString();
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
