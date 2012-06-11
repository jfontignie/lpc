package jaf

class Email extends Contact {

    String email

    static constraints = {
        email(email: true)
    }

    def String toString() {
        return email
    }
}
