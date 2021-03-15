class Vector{
    double x;
    double y;
    double z;

    Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double getLength(){
        return Math.sqrt(x*x + y*y + z*z);
    }

    double getScalar(Vector vector) {
        return x * vector.x + y * vector.y + vector.z * z;
    }

    public Vector crossProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    // Косинус между двумя векторами
    public double cos(Vector vector) {
        // Для вычисления длины и произведения используются
        //методы multiply и length
        return getScalar(vector) / (getLength() * vector.getLength());
    }

    public Vector add(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    public Vector subtract(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }

    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}


public class Task_5 {
    public static void main(String args[]){
        Vector[] vectors = Vector.generate(10);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println(vectors[0].getLength());
        System.out.println(vectors[0].getScalar(vectors[1]));
        System.out.println(vectors[0].crossProduct(vectors[1]));
        System.out.println(vectors[0].cos(vectors[1]));
        System.out.println(vectors[0].add(vectors[1]));
        System.out.println(vectors[0].subtract(vectors[1]));
    }
}
