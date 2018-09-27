import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestionTest {

    @org.junit.jupiter.api.Test
    void question() {



    }

    @Test
    public void testQuestion(){
        String question = "Is this a test?";
        String correctAnswer = "yes";
        String answer1 = "yes";
        String answer2 = "no";
        String answer3 = "maybe";
        String answer4 = "possibly";

        Question Q1 = new Question(question,correctAnswer,answer1,answer2,answer3,answer4);

        assertEquals(question, Q1.theQuestion);
        assertEquals(answer1, Q1.A1);
        assertEquals(answer2, Q1.A2);
        assertEquals(answer3, Q1.A3);
        assertEquals(answer4, Q1.A4);
        assertEquals(correctAnswer, Q1.correctA);

    }

}