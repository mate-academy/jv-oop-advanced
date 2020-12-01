package core.basesyntax;

public class RightTriangle extends Figures {
    private int firstCathetus;
    private int secondCathetus;

    public RightTriangle(Colors color, int firstCathetus, int secondCathetus) {
        super(color);
        this.firstCathetus = firstCathetus;
        this.secondCathetus = secondCathetus;
    }

    public int getHypotenuse() {
        return (int) Math.sqrt(firstCathetus * firstCathetus + secondCathetus * secondCathetus);
    }

    @Override
    public int getArea() {
        return firstCathetus * secondCathetus / 2;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle has been drawn");
    }

    @Override
    public String toString() {
        return "Shape: right triangle, area: "
                + getArea() + " sq. units, hypotenuse: "
                + getHypotenuse() + " units, color: " + getColor().toLowerCase();
    }
}
