public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jhon", 30);
        persona1.mostrarInfo();
        System.out.println("____________________");
        Estudiante estudiante1 = new Estudiante("Sofía", 20, "Ingeniería");
        estudiante1.mostrarInfo();
    }
}
