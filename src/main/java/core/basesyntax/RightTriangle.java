package core.basesyntax;

public class RightTriangle extends Figure {
    private int hipotenuse;

    public RightTriangle(String color, int hipotenuse) {
        super(color, "right triangle");
        this.hipotenuse = hipotenuse;
    }

    public int getHipotenuse() {
        return hipotenuse;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * (this.hipotenuse * this.hipotenuse);
    }

    @Override
    public String draw() {
        return super.draw() + ", hipotenuse: " + getHipotenuse() + " units.";
    }
}
