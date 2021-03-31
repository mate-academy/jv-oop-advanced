package core.basesyntax;

public class RightTriangle extends Figure {
    private int hipitenuse;

    public RightTriangle(String color, int hipitenuse) {
        super(color, "right triangle");
        this.hipitenuse = hipitenuse;
    }

    public int getHipitenuse() {
        return hipitenuse;
    }

    @Override
    public int getArea() {
        return (int) (Math.sqrt(3) / 4) * (this.hipitenuse * this.hipitenuse);
    }

    @Override
    public String draw() {
        return super.draw() + ", hipotenuse: " + getHipitenuse() + " units.";
    }
}
