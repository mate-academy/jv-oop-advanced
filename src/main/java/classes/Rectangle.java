package classes;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public String draw() {
        StringBuilder infoMessage = new StringBuilder("Figure: " + Figures.Rectangle.name() + ", ")
                .append("area: " + this.calculateArea() + " sq. units" + ", ")
                .append("width: " + this.width + " units" + ", ")
                .append("height: " + this.height + " units" + ", ")
                .append("color: " + this.getColor() + ".");
        return infoMessage.toString();
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
