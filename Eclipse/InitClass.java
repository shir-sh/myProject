package finalProject;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class InitClass {
	public finalProjectClass myProject;
	public WebElement Question;
	public WebElement NextButtonBuildGame;
	public WebElement NextButtonInGame;
	public WebElement StartButton;
	public WebElement WriteAnswer;
	public WebElement MarkAnswer1;
	public WebElement PlayButton;
	public WebElement ChooseAnswerGame11;
	public WebElement ChooseAnswerGame21;
	public WebElement ChooseAnswerGame31;
	public WebElement AnswerFieldA;
	public WebElement AnswerFieldB;
	public WebElement AnswerFieldC;
	public WebElement AnswerFieldD;
	public WebDriver driver;

	public WebElement BackButtonBuild;
	public WebElement BackButtonGame;
	public WebElement TryAgainButton;
	public WebElement QuitButton;
	public WebElement QuitButtonAfterGame;
	public WebElement MarkAnswer2;
	public WebElement MarkAnswer3;
	public WebElement MarkAnswer4;
	public WebElement ChooseAnswerGame12;
	public WebElement ChooseAnswerGame13;
	public WebElement ChooseAnswerGame14;
	public WebElement ChooseAnswerGame22;
	public WebElement ChooseAnswerGame23;
	public WebElement ChooseAnswerGame24;
	public WebElement ChooseAnswerGame32;
	public WebElement ChooseAnswerGame33;
	public WebElement ChooseAnswerGame34;

	public WebElement FacebookButton;
	public WebDriver driver2;

	
	
	
	@BeforeEach
	void init() throws InterruptedException{
		// try {
		myProject = new finalProjectClass("https://svcollegetest.000webhostapp.com/");
		driver = new ChromeDriver();
		myProject.setAnswerFieldA("//*[@id=\"answers\"]/div[1]/div[2]/input");
		myProject.setAnswerFieldB("//*[@id=\"answers\"]/div[2]/div[2]/input");
		myProject.setAnswerFieldC("//*[@id=\"answers\"]/div[3]/div[2]/input");
		myProject.setAnswerFieldD("//*[@id=\"answers\"]/div[4]/div[2]/input");
		myProject.setChooseAnswerGame11("//*[@id=\"2\"]/input[1]");
		myProject.setChooseAnswerGame21("//*[@id=\"1\"]/input[1]");
		myProject.setChooseAnswerGame31("//*[@id=\"0\"]/input[1]");
		myProject.setMarkAnswer1("//*[@id=\"answers\"]/div[1]/div[1]/input");
		myProject.setNextButtonBuildGame("nextquest");
		myProject.setNextButtonInGame("btnnext");
		myProject.setPlayButton("//*[@id=\"secondepage\"]/center/button[1]");
		myProject.setQuestion("question");
		myProject.setStartButton("startB");

		myProject.setBackButtonBuild("backquest"); // id
		myProject.setBackButtonGame("btnback"); // id
		myProject.setTryAgainButton("//*[@id=\"markpage\"]/center/button[1]");
		myProject.setQuitButton("//*[@id=\"secondepage\"]/center/button[2]");
		myProject.setQuitButtonAfterGame("//*[@id=\"markpage\"]/center/button[2]");
		myProject.setMarkAnswer2("//*[@id=\"answers\"]/div[2]/div[1]/input");
		myProject.setMarkAnswer3("//*[@id=\"answers\"]/div[3]/div[1]/input");
		myProject.setMarkAnswer4("//*[@id=\"answers\"]/div[4]/div[1]/input");
		myProject.setChooseAnswerGame12("//*[@id=\"2\"]/input[2]");
		myProject.setChooseAnswerGame13("//*[@id=\"2\"]/input[3]");
		myProject.setChooseAnswerGame14("//*[@id=\"2\"]/input[4]");
		myProject.setChooseAnswerGame22("//*[@id=\"1\"]/input[2]");
		myProject.setChooseAnswerGame23("//*[@id=\"1\"]/input[3]");
		myProject.setChooseAnswerGame24("//*[@id=\"1\"]/input[4]");
		myProject.setChooseAnswerGame32("//*[@id=\"0\"]/input[2]");
		myProject.setChooseAnswerGame33("//*[@id=\"0\"]/input[3]");
		myProject.setChooseAnswerGame34("//*[@id=\"0\"]/input[4]");
		
		
		myProject.setFacebookButton("//*[@id=\"fackBook2\"]/img");

		this.driver.get(myProject.myPath);
		
		
	  //   WebDriver driver= new InternetExplorerDriver();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
