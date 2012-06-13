/*
 * This program is intended to help the Luethi-Peterson Camps association
 *     to help them store and manage their users
 *
 *     Copyright (C) 2012 Jacques Fontignie
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

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