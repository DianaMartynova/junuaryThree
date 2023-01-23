import java.util.Objects;

public class Box extends Shape {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Box box = (Box) o;
        return (box.resultBox == resultBox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resultBox);
    }

    private double resultBox;

    public Box(double obyom) {
        super(obyom);
        resultBox = obyom;

    }

    public boolean add(Shape shape) {
        if (resultBox > shape.getObyom()) {
            resultBox = resultBox - shape.getObyom();
            return true;
        } else {
            return false;
        }
    }
}
