package classes;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        return "right triangle";
    }

    @Override
    public String draw() {
        StringBuilder infoMessage = new StringBuilder("Figure: " + Figures.Right_triangle.name() + ", ")
                .append("area: " + this.calculateArea() + " sq. units" + ", ")
                .append("firstLeg: " + this.firstLeg + " sq. units" + ", ")
                .append("secondLeg: " + this.secondLeg + " sq. units" + ", ")
                .append("color: " + this.getColor() + ".");
        return infoMessage.toString();
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg * 0.5;
    }
}
