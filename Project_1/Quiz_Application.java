import java.util.Scanner;

class QuizModel{
    String[][] Questions = {{"1. What is the size of the int data type in Java?", "A) 2 bytes", "B) 4 bytes", "C) 8 bytes", "D) 16 bytes","B","B) 4 bytes"},
            {"2. What is the entry point of a Java program?","A) start()","B) init()","C) main()","D) run()","C","C) main()"},
            {"3. Which operator is used for comparison in Java?","A) =","B) ==","C) :=","D) !=","B","B) =="},
            {"4. Which of the following is NOT a primitive data type in Java?","A) int","B) float","C) String","D) boolean","C","C) String"},
            {"5. What will be the output of System.out.println(5 + \"5\");?","A) 10","B) 55","C) Compilation Error","D) 5 + 5","B","B) 55"}
    };
}

class QuizView {
   void displayQuiz(int a,String[][] Questions){
       for(int i=a ;i<=a;i++){
           for(int j=0; j<Questions.length; j++){
               System.out.println(Questions[i][j]);
           }
       }
   }

   String userInput(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Choose the correct option(A/B/C/D):");
       return sc.next().toUpperCase();
   }

   void TotalScore(int score,String[][] Questions){
       System.out.println("Quiz Completed!");
       System.out.println("Your Total Score is "+score+" Out of "+Questions.length);
   }
}

class QuizController{
    int Score=0;
    QuizModel m=new QuizModel();
    QuizView v=new QuizView();

    void Quiz(){
        for(int i=0 ;i<m.Questions.length;i++){

            v.displayQuiz(i,m.Questions);

            String input=v.userInput();

            if(m.Questions[i][5].equals(input)){
                Score++;
                System.out.println("Correct Answer! which is option: "+m.Questions[i][6]);
            }else{
                System.out.println("Wrong Answer! Correct Answer is option: "+m.Questions[i][6]);
            }
        }
      v.TotalScore(Score,m.Questions);
    }
}

 class Main {
    public static void main(String[] args){
        QuizController c=new QuizController();
        c.Quiz();
    }
}
