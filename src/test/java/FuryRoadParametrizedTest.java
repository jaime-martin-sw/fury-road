import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FuryRoadParametrizedTest {
    public static Stream<Arguments> possibleRoadsAndExpectedCost() {
        return Stream.of(
                Arguments.of("ASAASS", 115),
                Arguments.of("SSSSAAA", 175),
                Arguments.of("SSA", 80));
    }

    @ParameterizedTest
    @MethodSource("possibleRoadsAndExpectedCost")
    void checkAllRoadsCosts(String road, int cost) {
        int solution = Solution.solution(road);

        assertEquals(solution, cost);
    }
}
