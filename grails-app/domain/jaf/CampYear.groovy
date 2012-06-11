package jaf

class CampYear {

    static belongsTo = [camp: Camp]
    int year

    static constraints = {
        year(min: 1949)
    }

    def String toString() {
        return year
    }
}
