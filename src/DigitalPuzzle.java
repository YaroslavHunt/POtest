import java.util.*;

public class DigitalPuzzle {

    public static String findLargestPuzzle(String[] numbers) {
        String largestSequence = "";

        for (String startNumber : numbers) {
            List<String> currentSequence = new ArrayList<>();
            Set<String> usedNumbers = new HashSet<>();
            currentSequence.add(startNumber);
            usedNumbers.add(startNumber);

            buildSequence(numbers, currentSequence, usedNumbers);

            String sequence = String.join("", currentSequence);
            if (sequence.length() > largestSequence.length()) {
                largestSequence = sequence;
            }
        }

        return largestSequence;
    }

    private static void buildSequence(String[] numbers, List<String> currentSequence, Set<String> usedNumbers) {
        String lastNumber = currentSequence.getLast();
        String lastTwo = lastNumber.substring(lastNumber.length() - 2);

        for (String number : numbers) {
            if (usedNumbers.contains(number)) continue;

            String firstTwo = number.substring(0, 2);
            if (lastTwo.equals(firstTwo)) {
                currentSequence.add(number);
                usedNumbers.add(number);
                buildSequence(numbers, currentSequence, usedNumbers);
                break;
            }
        }
    }
}

