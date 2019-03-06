package finalProject;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functionality extends InitClass {

//1
	@Test
	void firstBackButtonTest() throws InterruptedException { // back from first Q

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.BackButtonBuild = driver.findElement(By.id(myProject.getBackButtonBuild()));// Back
			this.BackButtonBuild.click();

			assertTrue(driver.getPageSource().contains("QA Test"));
			System.out.println("First Back Button Test - works");
		} catch (Exception e) {
			System.out.println("First Back Button Test - ERROR");
		}
		Thread.sleep(4000);

		driver.close();
	}

//2
	@Test
	void SecondBackButtonTest() throws InterruptedException { // back from Answers of the first Q
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);

			this.BackButtonBuild = driver.findElement(By.id(myProject.getBackButtonBuild()));
			this.BackButtonBuild.click();

			assertTrue(driver.getPageSource().contains("question number: 1"));
			System.out.println("Second BACK button field works");
		} catch (Exception e) {
			System.out.println("Second BACK button field - ERROR");
		}

		Thread.sleep(4000);

		driver.close();
	}

//3
	@Test
	void ThirdBackButtonTest() throws InterruptedException { // back from second Q

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.BackButtonBuild = driver.findElement(By.id(myProject.getBackButtonBuild()));
			this.BackButtonBuild.click();

			assertTrue(driver.getPageSource().contains("Mark"));
			System.out.println("Third Back Button Test - works");
		} catch (Exception e) {
			System.out.println("Third Back Button Test - ERROR");
		}
		Thread.sleep(4000);

		driver.close();

	}

//4
	@Test
	void FourthBackButtonTest() throws InterruptedException { // back from answers of the second Q

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.BackButtonBuild = driver.findElement(By.id(myProject.getBackButtonBuild()));
			this.BackButtonBuild.click();

			assertEquals(true, driver.getPageSource().contains("question number: 2"));
			System.out.println("Fourth BACK button field works");

		} catch (Exception e) {
			System.out.println("Fourth BACK button field - ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//5
	@Test
	void FifthBackButtonTest() throws InterruptedException { // back from third Q - bug at the back button - works like
																// the next

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(2000);
			this.BackButtonBuild = driver.findElement(By.id(myProject.getBackButtonBuild()));
			this.BackButtonBuild.click();

			assertTrue(driver.getPageSource().contains("Mark"));
			System.out.println("Fifth Back Button Test - works");
		} catch (Exception e) {
			System.out.println("Fifth Back Button Test - ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//6
	@Test
	void SixthBackButtonTest() throws InterruptedException { // back from answers of the third Q

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.BackButtonBuild = driver.findElement(By.id(myProject.getBackButtonBuild()));
			this.BackButtonBuild.click();

			assertTrue(driver.getPageSource().contains("question number: 3"));
			System.out.println("Sixth  BACK button field works");
		} catch (Exception e) {
			System.out.println("Sixth  BACK button field - ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//7
	@Test
	void QuitButtonAfterBuldingTheGameTest() throws InterruptedException { // BUG -first quit button doesn't works

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");

			}
			Thread.sleep(2000);
			this.QuitButton = driver.findElement(By.xpath(myProject.getQuitButton()));
			this.QuitButton.click();

			assertTrue(driver.getPageSource().contains("Mark"));
			System.out.println("Quit button after bulding the game - works");
		} catch (Exception e) {
			System.out.println("first QUIT Button ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//8
	@Test
	void BackButtonOnAtTheGameFirstAnswerTest() throws InterruptedException { // BUG

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.BackButtonGame = driver.findElement(By.id(myProject.getBackButtonGame()));
			this.BackButtonGame.click();

			assertTrue(driver.getPageSource().contains("finished"));
			System.out.println("GAME -first BACK button - works");
		} catch (Exception e) {
			System.out.println("GAME -first BACK button - ERROR");
		}

		Thread.sleep(4000);
		driver.close();
	}

//9
	@Test
	void BackButtonOnAtTheGameSecondAnswerTest() throws InterruptedException {

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.BackButtonGame = driver.findElement(By.id(myProject.getBackButtonGame()));
			this.BackButtonGame.click();

			assertTrue(driver.getPageSource().contains("finished"));
			System.out.println("GAME -second BACK button - works");
		} catch (Exception e) {
			System.out.println("GAME -second BACK button - ERROR");
		}

		Thread.sleep(4000);
		driver.close();
	}

//10
	@Test
	void BackButtonOnAtTheGameThirdAnswerTest() throws InterruptedException {
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.BackButtonGame = driver.findElement(By.id(myProject.getBackButtonGame()));
			this.BackButtonGame.click();

			assertTrue(driver.getPageSource().contains("B?"));
			System.out.println("GAME -third BACK button - works");
		} catch (Exception e) {
			System.out.println("GAME -third BACK button - ERROR");
		}

		Thread.sleep(4000);
		driver.close();
	}

//11
	@Test
	void QuitButtonAfterTheGameTest() throws InterruptedException { // bug

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			this.QuitButtonAfterGame = driver.findElement(By.xpath(myProject.getQuitButtonAfterGame()));
			this.QuitButtonAfterGame.click();

			assertTrue(driver.getPageSource().contains("QA Test"));
			System.out.println("QUIT button in the end of the game - works");
		} catch (Exception e) {
			System.out.println("QUIT button in the end of the game - ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//12
	@Test
	void TryAgainButtonTest() throws InterruptedException {
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			Thread.sleep(2000);
			this.TryAgainButton = driver.findElement(By.xpath(myProject.getTryAgainButton()));
			this.TryAgainButton.click();
			assertTrue(driver.getPageSource().contains("Test"));
			System.out.println("Try again button- works");

		} catch (Exception e) {
			System.out.println("Try again button - ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//13
	@Test
	void MarkingTheSecondAnswerWhileBuldingTheGameAndAtTheGame() throws InterruptedException { // second answers

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer2 = driver.findElement(By.xpath(myProject.getMarkAnswer2()));
			this.MarkAnswer2.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer2 = driver.findElement(By.xpath(myProject.getMarkAnswer2()));
			this.MarkAnswer2.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer2 = driver.findElement(By.xpath(myProject.getMarkAnswer2()));
			this.MarkAnswer2.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame12 = driver.findElement(By.xpath(myProject.getChooseAnswerGame12()));
			this.ChooseAnswerGame12.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame22 = driver.findElement(By.xpath(myProject.getChooseAnswerGame22()));
			this.ChooseAnswerGame22.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame32 = driver.findElement(By.xpath(myProject.getChooseAnswerGame32()));
			this.ChooseAnswerGame32.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("all second answers are marked");
		} catch (Exception e) {
			System.out.println("ERROR - NOT all second answers are marked");
		}
		Thread.sleep(4000);
		driver.close();
	}

//14
	@Test
	void MarkingTheThirdAnswerWhileBuldingTheGameAndAtTheGame() throws InterruptedException { // third answers

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer3 = driver.findElement(By.xpath(myProject.getMarkAnswer3()));
			this.MarkAnswer3.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer3 = driver.findElement(By.xpath(myProject.getMarkAnswer3()));
			this.MarkAnswer3.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer3 = driver.findElement(By.xpath(myProject.getMarkAnswer3()));
			this.MarkAnswer3.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame13 = driver.findElement(By.xpath(myProject.getChooseAnswerGame13()));
			this.ChooseAnswerGame13.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame23 = driver.findElement(By.xpath(myProject.getChooseAnswerGame23()));
			this.ChooseAnswerGame23.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame33 = driver.findElement(By.xpath(myProject.getChooseAnswerGame33()));
			this.ChooseAnswerGame33.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("all Third answers are marked");
		} catch (Exception e) {
			System.out.println("ERROR - NOT all Third answers are marked");
		}
		Thread.sleep(4000);
		driver.close();
	}

//15
	@Test
	void MarkingTheFourthAnswerWhileBuldingTheGameAndAtTheGame() throws InterruptedException { // fourth answers

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer4 = driver.findElement(By.xpath(myProject.getMarkAnswer4()));
			this.MarkAnswer4.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer4 = driver.findElement(By.xpath(myProject.getMarkAnswer4()));
			this.MarkAnswer4.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer4 = driver.findElement(By.xpath(myProject.getMarkAnswer4()));
			this.MarkAnswer4.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame14 = driver.findElement(By.xpath(myProject.getChooseAnswerGame14()));
			this.ChooseAnswerGame14.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame24 = driver.findElement(By.xpath(myProject.getChooseAnswerGame24()));
			this.ChooseAnswerGame24.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame34 = driver.findElement(By.xpath(myProject.getChooseAnswerGame34()));
			this.ChooseAnswerGame34.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("all Fourth answers are marked");
		} catch (Exception e) {
			System.out.println("ERROR - NOT all Fourth answers are marked");
		}
		Thread.sleep(4000);
		driver.close();
	}

//16
	@Test
	void ChoosenMixAnswersAtTheGame() throws InterruptedException { // Succeed
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer2 = driver.findElement(By.xpath(myProject.getMarkAnswer2()));
			this.MarkAnswer2.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer3 = driver.findElement(By.xpath(myProject.getMarkAnswer3()));
			this.MarkAnswer3.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame22 = driver.findElement(By.xpath(myProject.getChooseAnswerGame22()));
			this.ChooseAnswerGame22.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame34 = driver.findElement(By.xpath(myProject.getChooseAnswerGame34()));
			this.ChooseAnswerGame34.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE!");
		} catch (Exception e) {
			System.out.println("ERROR - didnt get to the last page of the game");
		}
		Thread.sleep(4000);
		driver.close();
	}

//17
	@Test
	void ChangingTheRadioBubttonsOfTheQuestionAtTheGame() throws InterruptedException { // Succeed
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}
			this.ChooseAnswerGame12 = driver.findElement(By.xpath(myProject.getChooseAnswerGame12()));
			this.ChooseAnswerGame12.click();
			Thread.sleep(1000);
			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}
			this.ChooseAnswerGame23 = driver.findElement(By.xpath(myProject.getChooseAnswerGame23()));
			this.ChooseAnswerGame23.click();
			Thread.sleep(1000);
			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}
			this.ChooseAnswerGame34 = driver.findElement(By.xpath(myProject.getChooseAnswerGame34()));
			this.ChooseAnswerGame34.click();
			Thread.sleep(1000);
			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE!");
		} catch (Exception e) {
			System.out.println("ERROR - didnt get to the last page of the game");
		}
		Thread.sleep(4000);
		driver.close();
	}

//18
	@Test
	void ChangingTheRadioBubttonsOfTheQuestionWhileBuldingTheGame() throws InterruptedException { // Succeed
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");

			Thread.sleep(1000);
			this.MarkAnswer2 = driver.findElement(By.xpath(myProject.getMarkAnswer2()));
			this.MarkAnswer2.click();
			Thread.sleep(1000);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");

			Thread.sleep(1000);
			this.MarkAnswer3 = driver.findElement(By.xpath(myProject.getMarkAnswer3()));
			this.MarkAnswer3.click();
			Thread.sleep(1000);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);

			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");

			Thread.sleep(1000);
			this.MarkAnswer4 = driver.findElement(By.xpath(myProject.getMarkAnswer4()));
			this.MarkAnswer4.click();
			Thread.sleep(1000);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE!");
		} catch (Exception e) {
			System.out.println("ERROR - didnt get to the last page of the game");
		}
		Thread.sleep(4000);
		driver.close();
	}

//19
	@Test
	void ChoosenTwoWronghAnswerInTheGame() throws InterruptedException { // Succeed
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame22 = driver.findElement(By.xpath(myProject.getChooseAnswerGame22()));
			this.ChooseAnswerGame22.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame33 = driver.findElement(By.xpath(myProject.getChooseAnswerGame33()));
			this.ChooseAnswerGame33.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE! just one quesion is right -you failed the game!");
		} catch (Exception e) {
			System.out.println("ERROR at the test - not only 1 question is marked");
		}
		Thread.sleep(4000);
		driver.close();
	}

//20
	@Test
	void ChoosenOneWronghAnswerInTheGame() throws InterruptedException { // Succeed
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame33 = driver.findElement(By.xpath(myProject.getChooseAnswerGame33()));
			this.ChooseAnswerGame33.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE! two quesion are right ");
		} catch (Exception e) {
			System.out.println("ERROR - two question didnt failed");
		}
		Thread.sleep(4000);
		driver.close();
	}

//21
	@Test
	void ChoosenTreeWronghAnswerInTheGame() throws InterruptedException { // Succeed
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame14 = driver.findElement(By.xpath(myProject.getChooseAnswerGame14()));
			this.ChooseAnswerGame14.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame22 = driver.findElement(By.xpath(myProject.getChooseAnswerGame22()));
			this.ChooseAnswerGame22.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame33 = driver.findElement(By.xpath(myProject.getChooseAnswerGame33()));
			this.ChooseAnswerGame33.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE! all 3 question are worng");
		} catch (Exception e) {
			System.out.println("ERROR - not all 3 question are worng");
		}
		Thread.sleep(4000);
		driver.close();
	}

//22
	@Test
	void FirstQuestionWithoutQuestionMark() throws InterruptedException { // Succeed
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE!");
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//23
	@Test
	void SecondQuestionWithoutQuestionMark() throws InterruptedException { //
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE!");
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//24
	@Test
	void ThirdQuestionWithoutQuestionMark() throws InterruptedException { //
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE!");
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//25	
	@Test
	void RandomOrderOfTheQuestions() throws InterruptedException { //
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Sucsses") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}
			Thread.sleep(1000);
			this.TryAgainButton = driver.findElement(By.xpath(myProject.getTryAgainButton()));
			this.TryAgainButton.click();
			Thread.sleep(1000);

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("The questions are not in a random order");
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

//26
	@Test
	void EditTheRadioButtonsOfFirstAnswerAfterClickingOnNextAndBack() throws InterruptedException { // back from second
																									// Q
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			Thread.sleep(1500);
			this.BackButtonBuild = driver.findElement(By.id(myProject.getBackButtonBuild()));
			this.BackButtonBuild.click();
			Thread.sleep(1500);
			this.MarkAnswer2 = driver.findElement(By.xpath(myProject.getMarkAnswer2()));
			this.MarkAnswer2.click();
			Thread.sleep(1500);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE! editing the radio Button works");
		} catch (Exception e) {
			System.out.println("ERROR - editing the radio Button doesnt works");
		}
		Thread.sleep(4000);
		driver.close();
	}

	// Boundary Values
//1
	@Test
	void UpTo50LettersAtTheQuestions() throws InterruptedException { // bug
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question"))
					.sendKeys("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question"))
					.sendKeys("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE!");
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 2
	@Test
	void UpTo30LettersAtTheAnswersFieldshh() throws InterruptedException { //
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("cccccccccccccccccccccccccccccc");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("dddddddddddddddddddddddddddddd");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("cccccccccccccccccccccccccccccc");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("dddddddddddddddddddddddddddddd");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("eeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("cccccccccccccccccccccccccccccc");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("dddddddddddddddddddddddddddddd");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("eeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("ffffffffffffffffffffffffffffff");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE!");
		} catch (Exception e) {
			System.out.println("ERROR");
		}

		Thread.sleep(4000);
		driver.close();
	}

	// Error Handling
// 1
	@Test
	void WriteTheQuestionInHebrew() throws InterruptedException { // bug
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("היי עולם");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question"));
			System.out.println("first question input -works!");
		} catch (Exception e) {
			System.out.println("ERROR at the first question input");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 2
	@Test
	void WriteTheQuestionInEnglishAndNumbers() throws InterruptedException { //
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("hello123");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question"));
			System.out.println("first question input -works!");
		} catch (Exception e) {
			System.out.println("ERROR at the first question input");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 3
	@Test
	void WriteTheQuestionWithNumbers() throws InterruptedException { //
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("123");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question"));
			System.out.println("first question input -works!");
		} catch (Exception e) {
			System.out.println("ERROR at the first question input");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 4
	@Test
	void WriteTheQuestionInEnglishAndSymbols() throws InterruptedException { //
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("Hello!@#$%^&*");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question"));
			System.out.println("first question input -works!");
		} catch (Exception e) {
			System.out.println("ERROR at the first question input");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 5
	@Test
	void WriteTheQuestionInSymbols() throws InterruptedException { //
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("!@#$%^&*");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question"));
			System.out.println("first question input -works!");
		} catch (Exception e) {
			System.out.println("ERROR at the first question input");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 6
	@Test
	void WriteTheAnswersInHebrew() throws InterruptedException { // bug
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("א");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("ב");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("ג");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("ד");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1500);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 2"));
			System.out.println("EXELENTE! -  fill the answers fields - Hebrew");
		} catch (Exception e) {
			System.out.println("ERROR - didnt fill the answers fields - Hebrew");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 7
	@Test
	void WriteTheAnswersInEnglishAndNumbers() throws InterruptedException { // bug
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("a1a1a1");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("b2b2b2");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("c3c3c3");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("d4d4d4");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1500);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 2"));
			System.out.println("EXELENTE! -  fill the answers fields - English And Numbers");
		} catch (Exception e) {
			System.out.println("ERROR - didnt fill the answers fields - English And Numbers");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 8
	@Test
	void WriteTheAnswersWithNumbers() throws InterruptedException { // bug
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("1111");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("2222");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("3333");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("4444");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1500);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 2"));
			System.out.println("EXELENTE! - fill the answers fields - Numbers");
		} catch (Exception e) {
			System.out.println("ERROR - didnt fill the answers fields - Numbers");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 9
	@Test
	void WriteTheAnswersInEnglishAndSymbols() throws InterruptedException { // bug
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("aa!@#$%^");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("bb!@#$%^");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("cc!@#$%^");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("dd!@#$%^");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1500);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 2"));
			System.out.println("EXELENTE! - fill the answers fields - English And Symbols");
		} catch (Exception e) {
			System.out.println("ERROR - didnt fill the answers fields - English And Symbols");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 10
	@Test
	void WriteTheAnswersInSymbols() throws InterruptedException { // bug
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("!@#$%^");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("!@#$%^");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("!@#$%^");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("!@#$%^");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			Thread.sleep(1500);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 2"));
			System.out.println("EXELENTE! - fill the answers fields - Symbols");
		} catch (Exception e) {
			System.out.println("ERROR - didnt fill the answers fields - Symbols");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 11
	@Test
	void MoreTheno50LettersAtTheQuestions() throws InterruptedException { // bug
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("Mark"));
			System.out.println("EXELENTE! - didnt get to first answers page");
		} catch (Exception e) {
			System.out.println("ERROR - More than 50 letters were received in question");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 12
	@Test
	void ZeroLettersAtTheQuestions() throws InterruptedException { // bug

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("Mark"));
			System.out.println("Excellent - question without letters is not accepted!");
		} catch (Exception e) {
			System.out.println("ERROR -  question without letters is accepted");
		}
		Thread.sleep(4000);
		driver.close();

	}

// 13
	@Test
	void MoerThen30LettersAtTheFirstAnswersFields() throws InterruptedException { //

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("b");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("c");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("d");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 2"));
			System.out.println("Excellent - Answer with 31 letters not accepted!");
		} catch (Exception e) {
			System.out.println("ERROR -  Answer with 31 letters was accepted");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 14
	@Test
	void MoerThen30LettersAtTheSecondAnswersFields() throws InterruptedException { //

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("a");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("c");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("d");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 2"));
			System.out.println("Excellent - Answer with 31 letters not accepted!");
		} catch (Exception e) {
			System.out.println("ERROR -  Answer with 31 letters was accepted");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 15
	@Test
	void MoerThen30LettersAtTheThirdAnswersFields() throws InterruptedException { //

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("a");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("b");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("cccccccccccdccccccccccccccccccc");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("d");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 2"));
			System.out.println("Excellent - Answer with 31 letters not accepted!");
		} catch (Exception e) {
			System.out.println("ERROR -  Answer with 31 letters was accepted");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 16
	@Test
	void MoerThen30LettersAtTheFourtAnswersFields() throws InterruptedException { //

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("a");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("b");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("c");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("ddddddddddddddddddddddddddddddd");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 2"));
			System.out.println("Excellent - Answer with 31 letters not accepted!");
		} catch (Exception e) {
			System.out.println("ERROR -  Answer with 31 letters was accepted");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 17
	@Test
	void ZeroLettersAtTheAnswersFields() throws InterruptedException { //

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("Mark"));
			System.out.println("Excellent - Answer with no letters not accepted!");
		} catch (Exception e) {
			System.out.println("ERROR - Answer with no letters was accepted");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 18
	@Test
	void SpacesAtTheAnswersFields() throws InterruptedException { // bug

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys(" ");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys(" ");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys(" ");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys(" ");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("Mark"));
			System.out.println("ERROR - Answer with space was accepted!");
		} catch (Exception e) {
			System.out.println("Excellent - Answer with space not accepted");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 19
	@Test
	void SpaceAtTheFirstQuestion() throws InterruptedException { // bug

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys(" ");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 1"));
			System.out.println("ERROR - question with space was accepted!");
		} catch (Exception e) {
			System.out.println("Excellent - question with space not accepted");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 20
	@Test
	void ZeroLettersAtTheFirstQuestion() throws InterruptedException { // bug

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 1"));
			System.out.println("ERROR - question with zero letters was accepted!");
		} catch (Exception e) {
			System.out.println("Excellent - question with zero letters accepted");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 21
	@Test
	void NextButtonBeforeWritingThwQuestion() throws InterruptedException { // bug

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("question number: 1"));
			System.out.println("Excellent - you can not click \"Next\" before writing a question");
		} catch (Exception e) {
			System.out.println("ERROR -   you can click \"Next\" before writing a question");
		}
		Thread.sleep(4000);
		driver.close();
	}

// 22
	@Test
	void NextButtonBeforeChoosingAnAnswer() throws InterruptedException { // bug

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();

			assertTrue(driver.getPageSource().contains("Mark"));
			System.out.println("Excellent - you can not click -Next- before choosing an answer");
		} catch (Exception e) {
			System.out.println("ERROR -   you can click -Next- before choosing an answer");
		}
		Thread.sleep(4000);
		driver.close();
	}
// 23 
	@Test
	void SanityOnOffline() throws InterruptedException { // Succeed
		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("EXELENTE! just one quesion is right -you failed the game!");
		} catch (Exception e) {
			System.out.println("ERROR at the test - not only 1 question is marked");
		}
		Thread.sleep(4000);
		driver.close();
	}
	
// Integration
	@Test
	void ConnectionToFacebok() throws InterruptedException { // bug

		try {
			this.driver.get(myProject.myPath);
			Thread.sleep(1500);
			if (driver.getPageSource().contains("QA Test") == true) {
			} else {
				fail("ERROR - didnt get to first page");
			}

			myProject.setStartButton("startB");
			Thread.sleep(500);
			this.StartButton = driver.findElement(By.id(myProject.getStartButton()));
			this.StartButton.click();
			if (driver.getPageSource().contains("question number: 1") == true) {
			} else {
				fail("ERROR - didnt get to first question page");
			}

			this.Question = driver.findElement(By.name(myProject.getQuestion()));
			this.Question.sendKeys("A?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to first answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("A");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("B");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("C");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("D");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 2") == true) {
			} else {
				fail("ERROR - didnt get to second question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("B?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to second answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("B");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("C");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("D");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("E");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("question number: 3") == true) {
			} else {
				fail("ERROR - didnt get to third question page");
			}

			this.Question = driver.findElement(By.id(myProject.getQuestion())); //
			this.Question.findElement(By.name("question")).sendKeys("C?");
			Thread.sleep(1000);
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("Mark") == true) {
			} else {
				fail("ERROR - didnt get to third answers page");
			}

			this.AnswerFieldA = driver.findElement(By.xpath(myProject.getAnswerFieldA()));
			this.AnswerFieldA.sendKeys("C");
			this.AnswerFieldB = driver.findElement(By.xpath(myProject.getAnswerFieldB()));
			this.AnswerFieldB.sendKeys("D");
			this.AnswerFieldC = driver.findElement(By.xpath(myProject.getAnswerFieldC()));
			this.AnswerFieldC.sendKeys("E");
			this.AnswerFieldD = driver.findElement(By.xpath(myProject.getAnswerFieldD()));
			this.AnswerFieldD.sendKeys("F");
			Thread.sleep(1500);
			this.MarkAnswer1 = driver.findElement(By.xpath(myProject.getMarkAnswer1()));
			this.MarkAnswer1.click();
			this.NextButtonBuildGame = driver.findElement(By.id(myProject.getNextButtonBuildGame()));
			this.NextButtonBuildGame.click();
			if (driver.getPageSource().contains("finished") == true) {
			} else {
				fail("ERROR - didnt get to PLAY GAME page");
			}
			Thread.sleep(2000);
			this.PlayButton = driver.findElement(By.xpath(myProject.getPlayButton()));
			this.PlayButton.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to FIRST question page in the game");
			}

			this.ChooseAnswerGame11 = driver.findElement(By.xpath(myProject.getChooseAnswerGame11()));
			this.ChooseAnswerGame11.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to SECOND question page in the game");
			}

			this.ChooseAnswerGame21 = driver.findElement(By.xpath(myProject.getChooseAnswerGame21()));
			this.ChooseAnswerGame21.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Test") == true) {
			} else {
				fail("ERROR - didnt get to THIRD question page in the game");
			}

			this.ChooseAnswerGame31 = driver.findElement(By.xpath(myProject.getChooseAnswerGame31()));
			this.ChooseAnswerGame31.click();
			Thread.sleep(1000);
			this.NextButtonInGame = driver.findElement(By.id(myProject.getNextButtonInGame()));
			this.NextButtonInGame.click();
			if (driver.getPageSource().contains("Sucsses") == true) {
			} else {
				fail("ERROR - didnt finish the game");
			}
			
			this.FacebookButton = driver.findElement(By.xpath(myProject.getFacebookButton()));
			this.FacebookButton.click();
			Thread.sleep(1000);

			assertTrue(driver.getPageSource().contains("Sucsses"));
			System.out.println("Facebook Button Works");
		} catch (Exception e) {
			System.out.println("Facebook Button Dosent Works");
		}
		Thread.sleep(4000);
		driver.close();
	}
}

