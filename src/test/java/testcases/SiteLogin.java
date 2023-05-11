package testcases;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

public class SiteLogin {
    @ParameterizedTest
    @MethodSource("example1Provider")
    public void exampleTest1(String username, String password, String city){

    }
    private static Stream<Arguments> example1Provider() {
        return Stream.of(
                Arguments.of ("User1", "Pass1", "City1"),
                Arguments.of("User2", "Pass2", "City2"),
                Arguments.of("User3", "Pass3", "City3"),
                Arguments.of("User4", "Pass4", "City4"));
    }
}
