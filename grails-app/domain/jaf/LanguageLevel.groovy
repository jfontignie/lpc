package jaf

class LanguageLevel {

    Locale language
    Level level

    static constraints = {
    }

    def String toString() {
        return language.getDisplayName() + "(" + level + ")"
    }

}

enum Language {

    //TODO, fill the language
    ENGLISH, SPANISH, FRENCH, PORTUGUESE
}


enum Level {

    BASIC, GOOD, FLUENT
}