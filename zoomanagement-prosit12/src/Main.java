import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Créer une instance de StudentManagement
        Management management = new StudentManagement();

        // Créer une liste d'étudiants
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 20));
        students.add(new Student(2, "Bob", 22));
        students.add(new Student(3, "Charlie", 19));
        students.add(new Student(4, "Diana", 21));

        // Afficher tous les étudiants
        System.out.println("Liste des étudiants :");
        management.displayStudents(students, System.out::println);

        // Filtrer et afficher les étudiants âgés de plus de 20 ans
        System.out.println("\nÉtudiants âgés de plus de 20 ans :");
        management.displayStudentsByFilter(students, student -> student.getAge() > 20, System.out::println);

        // Afficher les noms des étudiants
        System.out.println("\nNoms des étudiants :");
        String names = management.returnStudentsNames(students, Student::getName);
        System.out.println(names);

        // Créer un nouvel étudiant en utilisant un fournisseur
        System.out.println("\nCréation d'un nouvel étudiant :");
        Supplier<Student> studentSupplier = () -> new Student(5, "Eve", 23);
        Student newStudent = management.createStudent(studentSupplier);
        System.out.println(newStudent);
        students.add(newStudent);

        // Trier les étudiants par ID
        System.out.println("\nÉtudiants triés par ID :");
        management.sortStudentsById(students, Comparator.comparingInt(Student::getId));
        management.displayStudents(students, System.out::println);

        // Convertir la liste en Stream et afficher les étudiants
        System.out.println("\nÉtudiants (via Stream) :");
        management.convertToStream(students).forEach(System.out::println);
    }
}
