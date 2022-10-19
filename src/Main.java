public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        String firstName = " Ivan";
        String middleName = " Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - " + fullName + "\n");

        System.out.println("Task 2");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);

        System.out.println("\nTask 3");
        String fullName2 = "Иванов Семён Семёнович";
        String fullNameReplace = fullName2.replace('ё', 'е');
        System.out.println(fullNameReplace);

    }
}
