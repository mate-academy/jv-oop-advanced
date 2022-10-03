package core.basesyntax;


public class IsoscelesTrapezoid extends Figure {
    
    private double height;
    private double middleline;

    public IsoscelesTrapezoid(String color, double middleline,  double height) {
        super(color);
        this.height = height;
        this.middleline = middleline;
    }

    public IsoscelesTrapezoid() {

    }

    public double calcArea() {
        return super.setArea(this.middleline * height);
    }

    @Override
    public String toString() {
        return "Figure: IsoscelesTrapezoid, " +
                "area: " + calcArea() +
                " sq.units, height: " +
                height  +
                " units, " +
                middleline +
                " units, color: " + super.getColor();
    }
}
