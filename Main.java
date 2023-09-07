import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        int choice;

        do{

            System.out.println(
                    "1. Add a question to the quiz\n" +
                            "2. Remove a question from the quiz\n"+
                            "3. Modify a question in the quiz\n"+
                            "4. Take the quiz\n"+
                            "5. Quit");

            Scanner x = new Scanner (System.in);
            choice = x.nextInt();
            x.nextLine();


            if (choice == 1){
                quiz.add_question();


            }



            else if (choice == 2){
                quiz.remove_question();
            }



            else if (choice == 3){
                quiz.modify_question();

            }



            else if (choice == 4){
                quiz.give_quiz();

            }



        }while (choice != 5);


    }
}
