package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure sc = new Square("red", 4);
        System.out.println(sc.getInformationOfFigure());
        Figure rc = new Rectangle("blue", 4, 9);
        System.out.println(rc.getInformationOfFigure());
        Figure rt = new RightTriangle("black", 7, 5);
        System.out.println(rt.getInformationOfFigure());
        Figure ci = new Circle("sdf", 7);
        System.out.println(ci.getInformationOfFigure());
    }
}
