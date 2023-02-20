public class TriviaQuestion {
        private String question;
        private String correctAnswer;
        private String optionA;
        private String optionB;
        private String optionC;
        private String optionD;

        public TriviaQuestion(String question, String correctAnswer, String optionA, String optionB, String optionC, String optionD) {
            this.question = question;
            this.correctAnswer = correctAnswer;
            this.optionA = optionA;
            this.optionB = optionB;
            this.optionC = optionC;
            this.optionD = optionD;
        }

        public String getQuestion() {
            return question;
        }

        public String getCorrectAnswer() {
            return correctAnswer;
        }

        public String getOptionA() {
            return optionA;
        }

        public String getOptionB() {
            return optionB;
        }

        public String getOptionC() {
            return optionC;
        }

        public String getOptionD() {
            return optionD;
        }
    }
