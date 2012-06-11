package jaf

class Camp {

    String location
    static hasMany = [years : CampYear]

    static constraints = {
    }

    def String toString() {
        return location
    }
}
