package core.basesyntax;

public class RightTriangle extends Figure implements Informable, AreaCounter {
    private int hipotenusa;
    private int side1;
    private int side2;

    public RightTriangle(String name, String color, int hipotenusa, int side1, int side2) {
        super(name, color);
        this.hipotenusa = hipotenusa;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName() + ", area: " + getArea() + ", hipotenusa: "
                + hipotenusa + ", bigger side: " + side1 + ", smaller side: " + side2);
    }

    @Override
    public void countArea() {
        double area = (side1 * side2) / 2;
        super.setArea(area);
    }
}
