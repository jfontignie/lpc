package jaf

class Person {

    String firstName
    String lastName

    Date birthDay
    Nationality nationality //TODO convert it into an enumeration
    boolean vip
    String sgroup

    String preferences
    Gender gender

    boolean rejected
    Status status

    boolean newClient //TODO ASK jacques for the purpose

    Date dateCreated
    Date lastUpdated

    Person father
    Person mother

    static hasMany = [contacts: Contact, attendances: Attendance,languages: LanguageLevel]


    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
        nationality()
        birthDay()
        father(nullable: true)
        mother(nullable: true)
    }


    def String toString() {
        return firstName + " " + lastName
    }
}

enum Nationality {
     AMERICA,FRENCH

    //TODO fill the list of nationalities
}

enum Gender {
    MALE, FEMALE
}

enum Status {

    CD, CO, CA, DIT, I, D, PARENT

}