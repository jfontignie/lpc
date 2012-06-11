package jaf

class Address {

    String street1
    String street2
    String zipCode
    String city
    String country
    boolean parents

    Date dateCreated
    Date lastUpdated

    static constraints = {
    }

    def String toString() {
        return street1 + " " + street2 + " " + zipCode
    }
}
