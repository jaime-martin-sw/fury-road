public class Solution {

    public static int solution(String sr) {
        Road road = new Road(sr);
        int solution = road.calculateOptimizedJourney();

        return solution;
    }

    public static void main(String [] args) {
        int solution = Solution.solution("ASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAAASASASAAASASASASASASSSSSSSSSSSASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAAASASASAAASASASASASASSSSSSSSSSSASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAAASASASAAASASASASASASSSSSSSSSSSASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAAASASASAAASASASASASASSSSSSSSSSSASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASAASASASAAASASASASASA");

        System.out.println("Solution: " + solution);

    }
}