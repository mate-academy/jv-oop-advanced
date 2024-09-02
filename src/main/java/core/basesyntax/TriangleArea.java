package core.basesyntax;

public interface TriangleArea {
    default double getTriangleArea(double firstLeg, double secondLeg) {
        return firstLeg * secondLeg * 0.5;
    }
}
