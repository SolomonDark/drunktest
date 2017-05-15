//imports 
import java.util.Random;
//questions objects
public class question
{
	private Random rand = new Random();

	private String Question;//storing the question
	
	private String Answer;//storing the answer. both wil have corresponding places in respective arrays to make it easy
	
	private String[] Questions1 = new String[]{"2+3","10+9","20-3","10-4","10x2","6x1","6/2","16/2","30-6","4+14"};//I DONT CARE, IT WORKS AND IT WILL BE USED
	private String[] Answers1 = new String[]{  "5",  "19",  "17",  "6",   "20",  "6",  "3",  "8",   "24",  "18"};//HAHAHAHAHAHAAHAHAHAAHAH
	
	private String[] Questions2 = new String[]{"2^2","4^2","25^.5","4^.5","100^0","16^1","30*4","18/3","3^2","2x2"};
	private String[] Answers2 = new String[]{  "4",  "16", "5",    "2",   "1",    "16",  "120", "6",   "9",  "fish"};
	
	private String[] Questions3 = new String[]{
		"I have a rotten apple, a green apple, and a pear. How many ways can i line them up?",
		"is the angle acute or obtuse: 66",
		"is the angle right or left: 90",
		"What is the latin name of the human species",
		"5!",
		"First name of current president",
		"Chemical symbol of oxygen",
		"(7^3)/7",
		"How many legs does a centipede have?",
		"Chemical structure of water"};
	private String[] Answers3 = new String[]{"6","acute","right","homo sapien","60","Donald","O","49","100","H2O"};

	private int QNumber = 0;//the place in the array
	
	public void setQuestion(int intelLevel)
	{
		QNumber = rand.nextInt(10);//random number, so it chooses a random question- also used for answer
		if(intelLevel == 1)//determing hardness of question
		{
			this.Question = Questions1[QNumber];
			this.Answer = Answers1[QNumber];
			
		}else if(intelLevel == 2){
			this.Question = Questions2[QNumber];
			this.Answer = Answers2[QNumber];
			
		}else if(intelLevel == 3){
			this.Question = Questions3[QNumber];
			this.Answer = Answers3[QNumber];
			
		}else{
			System.out.println("Intel level is out of bounds: " + intelLevel);
		}
	}
	public String getQuestion()//returns stored question. MAKE SURE TO SET QUESTION FIRST
	{
		return this.Question;
	}
	public String getAnswer()//returns stored answers. MAKE SURE TO SET ANSWER FIRST
	{
		return this.Answer;
	}
}
