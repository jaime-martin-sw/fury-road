import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FuryRoadTest {

    @Test
    void roadConsistsInOnly1AsphaltSurfaceTest () {
        int solution = Solution.solution("A");

        assertEquals(solution, 5);

    }

    @Test
    void roadConsistsInOnly1SandSurfaceTest () {
        int solution = Solution.solution("S");

        assertEquals(solution, 30);

    }

    @Test
    void roadConsistsIn2SandSurfaceAnd3AsphaltSurfaceTest () {
        int solution = Solution.solution("SSAAA");

        assertEquals(solution, 95);

    }

    @Test
    void roadConsistsIn3SandSurfaceAnd3AsphaltSurfaceTest () {
        int solution = Solution.solution("SSSAAA");

        assertEquals(solution, 135);

    }

    @Test
    void provided1Test () {
        int solution = Solution.solution("ASAASS");

        assertEquals(solution, 115);

    }

    @Test
    public void provided2Test () {
        int solution = Solution.solution("SSA");

        assertEquals(solution, 80);

    }

    @Test
    void provided3Test () {
        int solution = Solution.solution("SSSSAAA");

        assertEquals(solution, 175);

    }

    @Test
    void provided4Test () {
        int solution = Solution.solution("SSSSSSSAAAAASSSSSSAAASSSSSSSSASAS");

        assertEquals(solution, 890);

    }
}
