public class Hindex {
    public int hIndex(int[] citations) {
        int maxNumOfCitations = 0;
        // Loop per paper
        for (int i = 0; i < citations.length; i++) {
            int numberOfCitations = citations[i];
            // MAX number of citations 
            if (citations[i] >= maxNumOfCitations) {
                maxNumOfCitations = citations[i];
            }
            System.out.println("maxNumOfCitations: " + maxNumOfCitations);
            System.out.println("citations: " + numberOfCitations);
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] citations = new int[]{1,3,1};
        Hindex algo = new Hindex();
        algo.hIndex(citations);
    }
}
