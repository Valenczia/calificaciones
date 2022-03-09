package calificaciones;

public class Student {
    private String name;
    private int [] grades;
    
    public Student(String name, int [] grades) {
        this.name = name;
        this.grades = grades;
    }
    
    public float average() {
        int sum = 0;
        for (int i=0; i < grades.length; i++ ) {
            sum += grades[i];
        }
        return sum / grades.length;
    }
    
    public String grade() {
        float a = this.average();
        if (a < 50) {
            return "F";
        } else if (a < 60) {
            return "E";
        } else if (a < 70) {
            return "D";
        } else if (a < 80) {
            return "C";
        } else if (a < 90) {
            return "B";
        } else {
            return "A";
        }
    }
    
    private void printGrades() {
        for (int i=0; i < grades.length; i++ ) {
            System.out.println("Calificación " + (i + 1) + ": " + grades[i]);
        }
    }
    
    public void print() {
        System.out.println("Nombre del estudiante: " + this.name);
        this.printGrades();
        System.out.println("Promedio: " + this.average());
        System.out.println("Calificación: " + this.grade());
    }
}
