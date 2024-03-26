
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;
import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public abstract class AbstractFuryRoad2022Test {
    abstract Solution getTestObject();

    Solution testObject;

    @BeforeEach
    void setup() {
        testObject = getTestObject();
    }

    @ParameterizedTest
    @MethodSource
    void test_samples(int E, String R) {
        assertEquals(E, testObject.solution(R));
    }

    static Stream<Arguments> test_samples() {
        return Stream.of( //
                Arguments.of(115, "ASAASS"), //
                Arguments.of(80, "SSA"), //
                Arguments.of(175, "SSSSAAA"));
    }

    @ParameterizedTest
    @MethodSource
    void test_very_short_road(int E, String R) {
        assertEquals(E, testObject.solution(R));
    }

    static Stream<Arguments> test_very_short_road() {
        return Stream.of( //
                Arguments.of(5, "A"), //
                Arguments.of(30, "S"));
    }

    @ParameterizedTest
    @MethodSource
    void test_short_road(int E, String R) {
        assertEquals(E, testObject.solution(R));
    }

    static Stream<Arguments> test_short_road() {
        return Stream.of( //
                Arguments.of(10, "AA"), //
                Arguments.of(35, "AS"), //
                Arguments.of(45, "SA"), //
                Arguments.of(60, "SS"), //
                Arguments.of(15, "AAA"), //
                Arguments.of(40, "AAS"), //
                Arguments.of(50, "ASA"), //
                Arguments.of(50, "SAA"), //
                Arguments.of(80, "SSA"), //
                Arguments.of(75, "SAS"), //
                Arguments.of(65, "ASS"), //
                Arguments.of(90, "SSS"));
    }

    @ParameterizedTest
    @MethodSource
    void test_only_scooter(int E, String R) {
        assertEquals(E, testObject.solution(R));
    }

    static Stream<Arguments> test_only_scooter() {
        return Stream.of( //
                Arguments.of(25, "AAAAA"), //
                Arguments.of(60, "SAAAA"));
    }

    @ParameterizedTest
    @MethodSource
    void test_only_walking(int E, String R) {
        assertEquals(E, testObject.solution(R));
    }

    static Stream<Arguments> test_only_walking() {
        return Stream.of( //
                Arguments.of(150, "SSSSS"), //
                Arguments.of(140, "SSSSA"));
    }

    @ParameterizedTest
    @MethodSource
    void test_all_asphalt_first(int E, String R) {
        assertEquals(E, testObject.solution(R));
    }

    static Stream<Arguments> test_all_asphalt_first() {
        return Stream.of( //
                Arguments.of(175, "AAAAASSSSS"), //
                Arguments.of(350, "AAAAAAAAAASSSSSSSSSS"));
    }

    private Duration getTimeoutDuration() {
        return Duration.ofMillis(2000);
    }

    @ParameterizedTest
    @MethodSource
    void test_long(int E, String R) {
        assertTimeoutPreemptively(getTimeoutDuration(), () -> assertEquals(E, testObject.solution(R)));
    }

    static Stream<Arguments> test_long() {
        return Stream.of( //
                Arguments.of(500_000, new String(new char[100000]).replace("\0", "A")), //
                Arguments.of(3_000_000, new String(new char[100000]).replace("\0", "S")),
                Arguments.of(1_750_000, //
                        new String(new char[50000]).replace("\0", "A")
                                + new String(new char[50000]).replace("\0", "S")));
    }
}
