
package mainquiz;

import java.util.Scanner;

public class MainQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // QuizQuestions quiz = new QuizQuestions();
        
        String q1 = "Who is the prisident of Nigeria?\n"
                            + "a: Buhri\n"
                            + "b: Hauke\n"
                            + "c: Jame\n"
                            + "d: GoodLuck\n";
        
         String q2 = "Who is the prisident of Nigeria?\n"
                            + "a: Buhri\n"
                            + "b: Hauke\n"
                            + "c: Jame\n"
                            + "d: GoodLuck\n";
        
       QuizQuestions [] quizQuestions = {
        
           new QuizQuestions("q1", "a"),
           new QuizQuestions("q2", "a")
           
           
    };
         
        takeTest(quizQuestions);
    }
    
       public static void takeTest(QuizQuestions [] quizQuestions){
           
          int score = 0;
        Scanner userInput = new Scanner(System.in);
           for (int i = 0; i < quizQuestions.length; i++) {
               System.out.println(quizQuestions[i].toString());
               String anwser = userInput.nextLine();
               if (anwser.equals(quizQuestions[i].anwser)) {
                   score++;
               }
               
           }
           System.out.println("******* Your Score is: " +score);
       }
    
}
