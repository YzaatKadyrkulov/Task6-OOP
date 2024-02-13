import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;



//import static jdk.nio.zipfs.ZipFileAttributeView.AttrID.group;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        /**
         * Company деген класс тузунуз, полелери (company name,
         * country, year of foundation, founder, groups[]).
         * Group деген класс тузунуз, полелери(group name, start date,
         * mentor), ушул класс Company класска поле катары массив болуп
         * барат.
         * Person деген класс тузунуз, полелери(first name, last name, date
         * of birth) ушул класс Company жана Group класстарга поле
         * катары барат.
         * main ден класстардын объектин тузуп полелерине маани
         * бериниз жана консольго чыгарыныз.
         */

        Person person = null;
        Group group1 = new Group("Java","8.01.2024year","Aizat",person);


        Group[] groups = new Group[0];

        Company company = new Company("Appple", "America", 1976,"Steve Jobs",groups,person);

        Person person1 = new Person("Kylychbek","Baltaev","27.02.1970");
        System.out.println("Company: " + company.companyName);
        System.out.println("Country: " + company.country);
        System.out.println("YearOfFoundation: " + company.yearOfFoundation);
        System.out.println("Founder: " + company.founder);
        System.out.println();


         {
            System.out.println("Band: " + group1.groupName);
            System.out.println("StartDate: " +group1.startDate );
            System.out.println("Mentor: " + group1.mentor);
            System.out.println();
        }

        System.out.println("Atakem:");
        System.out.println("Name: " + person1.firstName);
        System.out.println("DateOfBirth: " + person1.dateOfBirth);

    }



    }
