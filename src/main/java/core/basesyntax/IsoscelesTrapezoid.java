package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public void setFirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public void setSecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public void draw() {
        setFigureName("IsoscelesTrapezoid");
        System.out.println("Figure: " + getFigureName());
        setFigureArea(((firstBase + secondBase) / 2) * height);
        System.out.println("area: " + getFigureArea() + " sq. units");
        System.out.println("a: " + firstBase + " units");
        System.out.println("b: " + secondBase + " units");
        System.out.println("height: " + height + " units");
        System.out.println("color: " + getColor());
    }
}
