public class RightTriangle extends Figure {
    private double cathetus1;
    private double cathetus2;

    public RightTriangle(String color, double cathetus1, double cathetus2) {
        super(color);
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    public double getCathetus1() {
        return cathetus1;
    }

    public double getCathetus2() {
        return cathetus2;
    }

    public void setCathetus1(double cathetus1) {
        this.cathetus1 = cathetus1;
    }

    public void setCathetus2(double cathetus2) {
        this.cathetus2 = cathetus2;
    }

    @Override
    public void draw() {
        System.out.println("Figure : RightTriangle, area: " + getArea() + ", cathetus1: "
                + Math.round(getCathetus1()) + ", cathetus2: " + Math.round(getCathetus2())
                + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.round((0.5 * cathetus1 * cathetus2 * 100) / 100.0);
    }
}
