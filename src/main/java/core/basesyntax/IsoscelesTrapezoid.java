package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int firstBase,int secondBase,int height) {
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
        String string = ", firstbase: " + this.getFirstBase() + " units,";
        string += " secondbase: " + this.getSecondBase() + " units, color:" + this.getColor();
        System.out.println(string);
    }
}
