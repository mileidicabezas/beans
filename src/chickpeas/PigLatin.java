package chickpeas;
    public  class PigLatin {

    /*
    - add suffix in each word of a massage


    rules:
    - message(suffix) --> equal or grater than 2 characters
    - massage --> contain at least one word to alter
    - words --> separated by a single withe space
    - input --> only character a-z

     */

        public static  void pigLatin(String suffix,String message) {
            String[] vowels = new String[]{"a", "e", "i", "o", "u", "y"};
            String[] consonants = new String[]{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m",
                    "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

            String[] arraySentence;
            arraySentence = message.split(" ");
            int arrLength = arraySentence.length;

            for (String splitMessage : arraySentence) {
                String firstConsonant = splitMessage.substring(0, 1);
                if (arrLength >= 2) {
                    for (String vowel : vowels) {
                        if ((splitMessage.startsWith(vowel))) {
                            splitMessage = splitMessage + suffix; // message.concat(prefix);
                            //  System.out.println(splitMessage);
                        }
                    }
                    for (String consonant : consonants) {
                        if (splitMessage.startsWith(consonant)) {
                            splitMessage = splitMessage.replace(firstConsonant, "");
                            splitMessage = splitMessage + firstConsonant + suffix;
                            // System.out.println(splitMessage);
                        }
                    }
                }
                message = splitMessage;
                System.out.print(message + " ");
            }
        }
        public static void main(String[] args) {

            pigLatin( "op", "your first occasion Is");
            // pigLatin("aut simple as normal", "op");

        }


}
