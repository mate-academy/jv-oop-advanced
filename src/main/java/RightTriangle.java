public class RightTriangle extends Figure {
    private int cathetus1;
    private int cathetus2;

    public RightTriangle(String color, int cathetus1, int cathetus2) {
        super(color);
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    public int getCathetus1() {
        return cathetus1;
    }

    public int getCathetus2() {
        return cathetus2;
    }

    @Override
    public void draw() {
        System.out.println("Figure : RightTriangle, area: " + String.format("%.2f", getArea())
                + ", cathetus1: " + getCathetus1() + ", cathetus2: "
                + getCathetus2() + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return 0.5 * cathetus1 * cathetus2;
    }
}
