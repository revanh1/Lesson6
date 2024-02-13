package Lesson6.Hometask.task1;

public class Main {
    public static void main(String[] args) {
        GenericClass<Human> storage = new GenericClass<>();

        Student student1 = new Student("Revan", 20);
        Student student2 = new Student("Hajiey", 21);
        storage.add(student1);
        storage.add(student2);

        Teacher teacher1 = new Teacher("Kenan", 35);
        Teacher teacher2 = new Teacher("Hajiyev", 40);
        storage.add(teacher1);
        storage.add(teacher2);

        storage.displayItems();
        storage.remove(teacher1.getId());

        System.out.println("\nAll items after removal:");
        storage.displayItems();

        Teacher foundTeacher = (Teacher) storage.searchFor(2);
        if (foundTeacher != null) {
            System.out.println("Found: " + foundTeacher);
        } else {
            System.out.println("Teacher not found.");
        }
    }
}
