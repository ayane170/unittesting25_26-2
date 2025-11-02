package week1;

public class Greetings {
    public String sayHello(String name) {
        if (name == null || name.isEmpty() )
            return "Hello there! " ;
        if (name.contains(" ") || name.contains("\n") || name.contains("\t") || name.contains("\r"))
            return "Hello there! " ;
        return "Hello " + name + "!";
    }

    public String sayHello(String name, String language) {
        if (name == null || name.isBlank() || language == null || language.isBlank())
            return "Hello there! " ;
        return switch (language) {
            case "English" -> "Hello " + name + "!";
            case "Spanish" -> "Hola " + name + "!";
            case "French" -> "Bonjour " + name + "!";
            default -> "I don't know how to say hello to you, " + name;
        };
    }

}
