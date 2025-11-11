package week_6.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        //  Cas 1 : utilisateur valide avec adresse complète
        Address address = new Address("Kerkstraat", "Antwerpen", "Antwerpen", "2000");
        User userWithAddress = new User("Aya", 22, address);

        Optional<String> streetNameOpt = UserService.getStreetName(userWithAddress);

        // ifPresent() + map() pour afficher en MAJUSCULES
        streetNameOpt
                .map(String::toUpperCase)
                .ifPresent(street -> System.out.println("Straatnaam: " + street));

        //  Cas 2 : utilisateur sans adresse
        User userWithoutAddress = new User("Laurien", 23);

        try {
            String streetName = UserService.getStreetName(userWithoutAddress)
                    .orElseThrow(() -> new RuntimeException("Geen straatnaam gevonden voor gebruiker: " + userWithoutAddress.getName()));

            System.out.println("Straatnaam: " + streetName);
        } catch (RuntimeException e) {
            System.out.println("Fout: " + e.getMessage());
        }
    }
}
