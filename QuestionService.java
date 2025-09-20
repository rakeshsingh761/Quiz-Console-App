import java.util.Scanner;
public class QuestionService{
    Question[] questions =new Question[5];
    String selection[]=new String[5];

    public QuestionService(){
        questions[0] = new Question(1, "Which language runs in a web browser?", "Java", "C++", "Python", "JavaScript", "JavaScript");
        questions[1] = new Question(2, "Which language is known as platform independent?", "C", "C++", "Java", "Python", "Java");
        questions[2] = new Question(3, "Which of these is not an OOP language?", "Java", "C++", "C", "Python", "C");
        questions[3] = new Question(4, "Which company developed C#?", "Google", "Microsoft", "Apple", "IBM", "Microsoft");
        questions[4] = new Question(5, "Which language is best for Data Science?", "C", "Java", "Python", "C#", "Python");

    }

    public void playQuiz(){
        int i=0;
        for(Question q : questions){
            System.out.println("Question no :"+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc =new Scanner(System.in);
            selection[i++]=sc.nextLine();
        }
        for(String s :selection){
            System.out.println(s);
        }

    }
    public void printScore(){
        int score = 0;
        for (int i =0;i<questions.length;i++){
            Question que =questions[i];
            String acturalanswer = que.getAnswer();
            String userAnswer=selection[i];
            if(acturalanswer.equals(userAnswer)){
                score=score+1;
            }
        }
        System.out.println("your score is :"+score);
    }
}