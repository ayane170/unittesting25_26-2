package week1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {
Greetings g = new Greetings();
    @Test
    void sayHelloNullName() {
        assertEquals("Hello there! ", g.sayHello(null));
    }

    @Test
    void sayHelloEmptyName() {
        assertEquals("Hello there! ", g.sayHello(""));
    }
    @Test
    void sayHelloWhitespace(){
        assertEquals("Hello there! ", g.sayHello(" "));
    }

    @Test
    void sayHelloName() {
        assertEquals("Hello aya!", g.sayHello("aya"));
    }

    @Test
    void testSayHelloWithEnglish() {
        assertEquals("Hello Aya!", g.sayHello("Aya","English"));

    }
    @Test
    void testSayHelloWithSpanish() {
        assertEquals("Hola Casandra!", g.sayHello("Casandra","Spanish"));

    }
    @Test
    void testSayHelloWithFrench() {
        assertEquals("Bonjour Martin!", g.sayHello("Martin","French"));
    }

    @Test
    void sayHelloNullNameAndNullLanguage() {
        assertEquals("Hello there! ", g.sayHello(null,null));
    }

    @Test
    void sayHelloEmptyNameAndNullLanguage() {
        assertEquals("Hello there! ", g.sayHello("",""));
    }
    @Test
    void sayHelloWhitespaceNameAndWhitespaceLanguage() {
        assertEquals("Hello there! ", g.sayHello(" "," "));
    }
    @Test
    void testSayHelloWithDefault() {
        assertEquals("I don't know how to say hello to you, Martin",
                g.sayHello("Martin", "German"));
    }



}