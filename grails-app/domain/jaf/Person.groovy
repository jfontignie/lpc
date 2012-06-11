package jaf

class Person {

    String firstName
    String lastName

    Date birthDay
    Nationality nationality //TODO convert it into an enumeration
    boolean vip
    String sgroup

    Set<LanguageLevel> languages

    String preference
    Gender gender

    boolean rejected
    Status status //TODO ask jacques for the enumeration

    boolean newClient //TODO ASK jacques for the purpose


    Date dateCreated
    Date lastUpdated

    Person father
    Person mother

    static hasMany = [contacts: Contact, attendances: Attendance]


    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
        birthDay()
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