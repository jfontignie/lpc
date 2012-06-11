package jaf

class Attendance {

    static belongsTo = [camp: CampYear, person: Person]
    Status status
    CampType type

    static constraints = {
    }

    def String toString() {
        return person + " in " + camp
    }
}

enum CampType {}
