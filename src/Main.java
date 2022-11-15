public class Main {
    public static void main(String[] args) {




        ///Task 1

        String lastName = "Ivanov";
        String firstName = "Ivan";
        String middleName = "Ivanovich";

        String fullName = lastName + " " + firstName + " " + middleName + " ";

        System.out.println("ФИО сотрудника - " + fullName);


        ///Task 2


        String fullNameCapital2 = fullName.toUpperCase();

        System.out.println("ФИО сотрудника для заполнения отчёта - " + fullNameCapital2);


        ///Task 3

        String fullName3 = "Иванов Семён Семёнович";
        String fullName3Replace = fullName3.replace('ё', 'е');

        System.out.println("Данные ФИО сотрудника - " + fullName3Replace);



    }
}