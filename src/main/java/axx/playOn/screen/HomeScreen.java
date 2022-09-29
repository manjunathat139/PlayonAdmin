package axx.playOn.screen;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import axx.playOn.base.TestBase;

public class HomeScreen extends TestBase {
	@FindBy(id = "children_baseline")
	WebElement student;

	/*@FindBy(using = "Add Student Baseline")
	WebElement baselineselect;*/

	@FindBy(className = "android.view.View")
	List<WebElement> studentsurveys;

	public HomeScreen() {
		PageFactory.initElements(driver, this);
	}

	public void selectStudentForm() {
		student.click();
	}

//	public void selectbaseline() {
//		baselineselect.click();
//		System.out.println("clicked on baseline");
//	}

	public void getallsurvey() {
		System.out.println(studentsurveys.size());
		for (int i = 0; i < studentsurveys.size(); i++) {
			String surveydetails = studentsurveys.get(i).getText();
			System.out.println(surveydetails + ":-index" + i);
			if (surveydetails.contentEquals("Add Student Baseline")) {
				studentsurveys.get(i).click();
				System.out.println("clicked on Add Student Baseline");
			}
		}
	}

}
