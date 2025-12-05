package p2;

public class P2_main {
    public static void main(String[] args) {
        // Objekterzeugung 1:
        LetterGame new_word = new LetterGame();

        // Testfälle (setWord: intArray -> String):
        new_word.setWord(new int[] {0,1,2,43});
        new_word.setWord(new int[] {6,7,23,7});
        new_word.setWord(new int[] {14,2,0,0,19,19});

        // Objekterzeugung 2:
        LetterGame new_code = new LetterGame();

        // Testfall (findCode: String -> intArray):
        new_code.findCode("UNI");
    }
}