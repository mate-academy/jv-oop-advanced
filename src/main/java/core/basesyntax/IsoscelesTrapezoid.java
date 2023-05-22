package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase,int secondBase,int height) {
        this.setName("isosceles trapezoid");
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public void setSecondBase(int secondBase) {
        this.secondBase = secondBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double obtainArea() {
        return ((this.firstBase + this.secondBase) * this.height / 2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", firstbase: " + this.getFirstBase() + " units, secondbase: " + this.getSecondBase() + " units, color: " + this.getColor());
    }
}
