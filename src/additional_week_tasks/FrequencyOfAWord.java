package additional_week_tasks;

public class FrequencyOfAWord {

    public static void main(String[] args) {
        String word = "java";
        String sentence = "Java Java Java JAVA Java";

        int frequency = calculateFrequency(word, sentence);
        System.out.println(frequency);
    }

    public static int calculateFrequency(String word, String sentence) {
        String normalizedWord = word.toLowerCase();
        String normalizedSentence = sentence.toLowerCase();

        int frequency = 0;
        int index = 0;

        while (index != -1) {
            index = normalizedSentence.indexOf(normalizedWord, index);

            if (index != -1) {
                frequency++;
                index += normalizedWord.length();
            }
        }

        return frequency;
    }
}

/*
4. Create a class named FrequencyOfAWord. Given the following variables:
			word: contains a single word
			sentence: contains a sentence

	Write a program that calculates the frequency of the word from the given sentence.

			Example:
				word = "java"
				sentence = "Java Java Java JAVA Java"

			Output:
				5



 */