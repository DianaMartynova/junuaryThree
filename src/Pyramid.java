public class Pyramid extends Shape {
    public Pyramid(double obyom) {
        super(obyom);
    }

    public double vPyramid(double sOsnovanie, double hPyramid) {
        return ((1 / 3) * sOsnovanie) * hPyramid;
    }

}
