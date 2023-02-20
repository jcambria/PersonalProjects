import java.util.ArrayList;
import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // define the trivia questions and answers
        ArrayList<TriviaQuestion> triviaQuestions = new ArrayList<>();
        triviaQuestions.add(new TriviaQuestion("What is the capital of France?", "a", "Paris", "London", "New York", "Berlin"));
        triviaQuestions.add(new TriviaQuestion("What is the largest country in the world by land area?", "d", "Canada", "United States", "China", "Russia"));
        triviaQuestions.add(new TriviaQuestion("What is the highest mountain in the world?", "c", "Mount Everest", "Mount Kilimanjaro", "Mount Fuji", "Mount Blanc"));
        triviaQuestions.add(new TriviaQuestion("What is the smallest country in the world by land area?", "a", "Vatican City", "Monaco", "Nauru", "San Marino"));

        int score = 0;

        // loop through each question
        for (int i = 0; i < triviaQuestions.size(); i++) {
            TriviaQuestion currentQuestion = triviaQuestions.get(i);
            System.out.println(currentQuestion.getQuestion());

            // display the answer options
            System.out.println("a. " + currentQuestion.getOptionA());
            System.out.println("b. " + currentQuestion.getOptionB());
            System.out.println("c. " + currentQuestion.getOptionC());
            System.out.println("d. " + currentQuestion.getOptionD());

            // prompt the user for their answer
            System.out.print("Enter your answer (a, b, c, or d): ");
            String answer = scanner.nextLine();

            // check if the answer is correct and update the score
            if (answer.equalsIgnoreCase(currentQuestion.getCorrectAnswer())) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + currentQuestion.getCorrectAnswer());
            }

            System.out.println();
        }

        // display the final score
        System.out.println("Trivia complete! Your final score is " + score + "/" + triviaQuestions.size());
    }
}
