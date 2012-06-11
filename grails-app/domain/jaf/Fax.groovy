package jaf

class Fax extends Contact {
    String number
    static constraints = {

    }

    def String toString() {
        return number
    }

}
