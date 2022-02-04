package stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class StepsDefinitionCalculadora {

	WebDriver driver = Hooks.driver;
	
	@Dado("que estou no formulario de calculo de idade e signo")
	public void que_estou_no_formulario_de_calculo_de_idade_e_signo() {
		driver.get("https://trainingbypackt.github.io/Beginning-Selenium/lesson_6/exercise_6_1.html"); 
	    assertEquals("Lesson 6 - Age Calculator", driver.getTitle());
	}

	@Quando("preencho os campos obrigatorios {string}, {string}, {string}")
	public void preencho_os_campos_obrigatorios(String dia_aniversario, String mes_aniversario, String ano_aniversario) {
		Select selectDay = new Select(driver.findElement(By.id("dayOfBirth")));
		selectDay.selectByVisibleText(dia_aniversario);
		Select selectMonth = new Select(driver.findElement(By.id("monthOfBirth")));
		selectMonth.selectByVisibleText(mes_aniversario);
		driver.findElement(By.id("yearOfBirth")).sendKeys(ano_aniversario);		
	}

	@Quando("pressiono o botao de calcular")
	public void pressiono_o_botao_de_calcular() {
	    driver.findElement(By.id("calculate")).click();;
	}

	@Entao("deve exibir a idade esperada {string} e o signo do zoodiaco {string} para aquela data")
	public void deve_exibir_a_idade_esperada_e_o_signo_do_zoodiaco_para_aquela_data(String idade_esperada, String signo_esperado) {
		WebElement elementAge = driver.findElement(By.id("age"));
		assertEquals(idade_esperada, elementAge.getText());
		WebElement elementSigno = driver.findElement(By.id("zodiacSign"));
		assertEquals(signo_esperado, elementSigno.getText());
	}
}
