package challenges;

public class NumberFive {

    /**
     * Two strings, word1 and word2, are called anagrams if they contain all the same characters in the same
     * frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
     *
     * Example:
     * word 1 - cat
     * word 2 - act
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - acT
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - actt
     * false
     *
     * Example:
     * word 1 - cat
     * word 2 - acts
     * false
     *
     * @return true if word1 and word2 are case-insensitive anagrams, false otherwise.
     */
    public boolean isAnagram(String word1, String word2) {

        String wordOne = word1.toLowerCase();
        String wordTwo = word2.toLowerCase();

        boolean isAnagram = true;
        int word1Frequency = 0;
        int word2Frequency = 0;

        while(isAnagram){
            int index = 0;
            for(int i = 1; i < wordOne.length(); i++){
                if(wordOne.charAt(index)== wordOne.charAt(i)){
                    word1Frequency ++;
                }
            }

            for(int i = 1; i < wordTwo.length(); i++){
                if(wordTwo.charAt(index)== wordTwo.charAt(i)){
                    word1Frequency ++;
                }
            }

            if(word1Frequency == word2Frequency){
                isAnagram = true;
            }
            else{
                isAnagram = false;
            }

        }



        throw new UnsupportedOperationException();
    }
}
