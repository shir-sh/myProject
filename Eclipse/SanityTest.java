package finalProject;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityTest extends InitClass {

	@Test
	void testOpenBrowser() throws InterruptedException {

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
			System.out.println("EXELENTE!");
		} catch (Exception e) {
			System.out.println("ERROR - didnt get to the last page of the game");
		}
		Thread.sleep(4000);
		driver.close();
	}

}