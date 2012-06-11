package jaf

class LanguageLevel {

    Language language
    Level level

    static constraints = {
    }

    def String toString() {
        return language + "(" + level + ")"
    }
}

enum Language {

    //TODO, fill the language
    ENGLISH, SPANISH, FRENCH, PORTUGUESE
}


enum Level {

    BASIC, GOOD, FLUENT
}