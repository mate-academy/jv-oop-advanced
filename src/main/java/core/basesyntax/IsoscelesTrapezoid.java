package core.basesyntax;

public class IsoscelesTrapezoid extends State{//Trapez równoramienny
    private int upSide;
    private int downSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upSide, int downSide, int height) {
        super(color);
        this.upSide = upSide;
        this.downSide = downSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((upSide + downSide) * height) / 2;
    }
}
