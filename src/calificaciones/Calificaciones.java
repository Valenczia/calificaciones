package calificaciones;

public class Calificaciones {
    public static void main(String[] args) {
        int[] grades = {100,100,90,80,76};
        Student student = new Student("Christian", grades);
        student.print();
    }
}