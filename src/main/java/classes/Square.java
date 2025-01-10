package classes;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.setColor(color);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public String draw() {
        StringBuilder infoMessage = new StringBuilder("Figure: " + Figures.Square + ", ")
                .append("area: " + this.calculateArea() + " sq. units" + ", ")
                .append("side: " + this.side + " sq. units" + ", ")
                .append("color: " + this.getColor() + ".");
        return infoMessage.toString();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    public double getSide() {
        return this.side;
    }
}
