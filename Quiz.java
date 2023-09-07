import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Quiz {
    Scanner x = new Scanner (System.in);
    int choice;
    String choiceI;
    String choiceII;


    public ArrayList<Question> questions = new ArrayList<Question>();

    public void add_question(){
        System.out.println("Difficulty of question (1-3): ");
        choice = x.nextInt();
        x.nextLine();

        System.out.println("New question: ");
        choiceI = x.nextLine();

        System.out.println("Answer:  ");
        choiceII = x.nextLine();

        Question q = new Question(choice, choiceI, choiceII);
        questions.add(q);


    }

    public void remove_question(){
        for (int i = 0; i<questions.size(); i++){
            System.out.println(i + " " + questions.get(i).getText());
        }
        System.out.println("Which question would you like to remove: ");
        choice = x.nextInt();
        x.nextLine();
        questions.remove(choice);

    }

    public void modify_question(){
        int dif;
        for (int i = 0; i<questions.size(); i++){
            System.out.println(i + " " + questions.get(i).getText());
        }
        System.out.println("Which question would you like to modify: ");
        choice = x.nextInt();
        x.nextLine();

        System.out.println("Difficulty of question (1-3): ");
        dif = x.nextInt();
        x.nextLine();

        System.out.println("New question: ");
        choiceI = x.nextLine();

        System.out.println("Answer:  ");
        choiceII = x.nextLine();

        questions.get(choice).setDifficulty(dif);
        questions.get(choice).setText(choiceI);
        questions.get(choice).setAnswer(choiceII);

    }

    public void give_quiz(){
        int correct = 0;
        String answer;

        for (int i = 0; i<questions.size(); i++) {

            System.out.println(questions.get(i).getText());
            answer = x.nextLine();
            if(Objects.equals(answer, questions.get(i).getAnswer())){
                correct++;
            }

        }
        System.out.println("You got " + correct + " out of " + questions.size() + " correct");

    }
}