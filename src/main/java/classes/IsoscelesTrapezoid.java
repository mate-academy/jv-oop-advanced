package classes;

public class IsoscelesTrapezoid extends Figure {

    private double baseTop;
    private double baseBottom;
    private double height;

    public IsoscelesTrapezoid(Color color, double baseTop, double baseBottom, double height) {
        super(color);
        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Isosceles trapezoid";
    }

    @Override
    public String draw() {
        StringBuilder infoMessage = new StringBuilder()
                .append("Figure: " + Figures.Isosceles_Trapezoid.name() + ", ")
                .append("area: " + this.calculateArea() + " sq. units" + ", ")
                .append("baseTop: " + this.baseTop + " units" + ", ")
                .append("baseBottom: " + this.baseBottom + " units" + ", ")
                .append("height: " + this.height + " units" + ", ")
                .append("color: " + this.getColor() + ".");
        return infoMessage.toString();
    }

    @Override
    public double calculateArea() {
        return (baseTop + baseBottom) * 0.5 * height;
    }
}
