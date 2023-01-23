import java.util.Objects;

public class Shape  {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Double.compare(shape.obyom, obyom) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(obyom);
    }

    private double obyom;
    public Shape(double obyom){

        this.obyom = obyom;
    }
    public double getObyom(){

        return obyom;
    }
}
