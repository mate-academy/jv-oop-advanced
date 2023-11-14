package core.basesyntax;

public class Rectangle extends Figure implements FigureInfo {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(double firstLeg, double secondLeg,String color){
        super(color);
        this.firstLeg= firstLeg;
        this.secondLeg=secondLeg;

    }

    @Override
    public double getArea() {
        return firstLeg*secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure"+" "+"Rectangle"+" "+"firstLeg"+" "+firstLeg+" "+"secondLeg"+" "+secondLeg+" "+"Area"+" "+getArea()+" ");

    }
}
