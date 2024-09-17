public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan";  // Имя
        String middleName = "Ivanovich"; // Отчество
        String lastName = "Ivanov";   // Фамилия

        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника " + fullName);
        System.out.println("------");

        // Задача 2
        System.out.println("Задача 2");
        System.out.println("Ф. И. О. сотрудника для заполнения отчета " + fullName.toUpperCase());
        System.out.println("------");

        // Задача 3
        System.out.println("Задача 3");
        fullName = "Иванов Иван Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName.replace("ё", "е"));
        System.out.println("------");
    }
}