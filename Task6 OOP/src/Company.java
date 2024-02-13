import java.util.ArrayList;

class Company {
    String companyName;
    String country;
    int  yearOfFoundation;
    String founder;
    Person person;
    Group[] groups;
    public Company(String companyName, String country, int yearOfFoundation, String founder,Group[]groups,Person person){
   this.companyName = companyName;
   this.country = country;
   this.yearOfFoundation = yearOfFoundation;
   this.founder = founder;
   this.groups = groups;
   this.person = person;

    }

    }

class Group{
    String groupName;
    String startDate;
    String mentor;
    Person person;
    public Group(String groupName, String startDate, String mentor,Person person){
        this.groupName = groupName;
        this.startDate = startDate;
        this.mentor = mentor;
        this.person = person;
    }
}
class Person{
    String firstName;
    String lastName;
    String dateOfBirth;
    public Person(String firstName, String lastName, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

}

