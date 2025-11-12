public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double h;
    private final String name = "Trapez";

    public IsoscelesTrapezoid(double sideA, double sideB, double h) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.h = h;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * h / 2;
    }

    @Override
    public void draw() {
        System.out.println(name + " jest koloru: " + getColor() + " Długość jego jednej podstawy wynosi: " + sideA + " Długość jego drugiej podstawy wynosi: " + sideB +"cm. " + " Jego wysokość wynosi: " + h + " Jego pole wynosi: " + getArea());
    }
}
