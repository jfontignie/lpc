package jaf

import org.apache.commons.validator.EmailValidator

class Contact {

    static belongsTo = [Person]


    ContactType type
    ContactMode mode
    String value
    boolean enabled

    static constraints = {
        value(blank: false, validator: {val,obj ->
            if (obj.type == ContactType.EMAIL) return EmailValidator.instance.isValid(val)
            true
        })
    }
}

enum ContactType {
    PHONE, FAX, EMAIL
}

enum ContactMode {
    HOME, WORK
}


