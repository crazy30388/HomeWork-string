import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
       String firstName = "Ivan";
       String middleName = "Ivanovich";
       String lastName = "Ivanov";
       String fullName1 = "Ivanov Ivan Ivanovich";
       String fullName2 = "Иванов Семён Семёнович";
       //задача 1
       System.out.println("ФИО сотрудника - " + lastName.concat(" " + firstName + " " + middleName));
       //задача 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1.toUpperCase());
        // задача 3
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2);
    }
}