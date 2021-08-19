package core.basesyntax;

public class RightTriangle extends Figure {
    private int hipotenusa;
    private int longerSide;
    private int shorterSide;

    public RightTriangle(String name, String color,
                         int hipotenusa, int longerSide, int shorterSide) {
        super(name, color);
        this.hipotenusa = hipotenusa;
        this.longerSide = longerSide;
        this.shorterSide = shorterSide;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + countArea() + ", hipotenusa: "
                + hipotenusa + ", bigger side: " + longerSide + ", smaller side: " + shorterSide);
    }

    @Override
    public double countArea() {
        double area = (longerSide * shorterSide) / 2;
        return area;
    }
}
