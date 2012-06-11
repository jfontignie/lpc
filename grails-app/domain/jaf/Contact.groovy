package jaf

abstract class Contact {

    static belongsTo = [Person]

    ContactMode mode
    String number
    boolean enabled

    static constraints = {

    }
}

enum ContactMode {
    HOME, WORK
}
