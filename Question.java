public class Question {

    private String text;
    private String answer;
    private int difficulty;

    public String getText(){
        return text;
    }

    public String getAnswer(){
        return answer;
    }

    public int getDifficulty(){
        return difficulty;
    }

    public void setText(String txt){
        text = txt;
    }

    public void setAnswer(String ans){
        answer = ans;
    }

    public void setDifficulty(int dif){
        difficulty = dif;
    }

    Question(int dif, String txt, String ans){
        setText(txt);
        setAnswer(ans);
        setDifficulty(dif);
    }




}
