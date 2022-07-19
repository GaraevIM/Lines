import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase(Locale.ROOT));

        fullName = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);

        String firstName1 = "Иванов";
        String middleName1 = "Семён";
        String lastName1 = "Семёнович";
        String fullName1 = firstName1 + " " + middleName1 + " " + lastName1;
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("ФИО сотрудника - " + fullName1);
    }
}
