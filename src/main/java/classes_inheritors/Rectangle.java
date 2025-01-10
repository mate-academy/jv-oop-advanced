package classes_inheritors;

public class Rectangle extends Figure {
    private double width;
    private double height;

    @Override
    public String toString() {
        return "Rectangle";
    }

    @Override
    public String draw() {
        StringBuilder infoMessage = new StringBuilder("Figure: " + Figures.Rectangle + ", ")
                .append("area: " + this.calculateArea() + " sq. units" + ", ")
                .append("width: " + this.width + " sq. units" + ", ")
                .append("height: " + this.height + " sq. units" + ", ")
                .append("color: " + this.getColor() + ".");
        return infoMessage.toString();
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
