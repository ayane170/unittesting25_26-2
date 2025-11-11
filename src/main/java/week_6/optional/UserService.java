package week_6.optional;

import java.util.Optional;

public class UserService {
    public static Optional<String> getStreetName(User user) {
        return Optional.ofNullable(user)
                .flatMap(User::getAddress)      // Optional<Address>
                .flatMap(Address::getStreetName); // Optional<String>
    }
}
