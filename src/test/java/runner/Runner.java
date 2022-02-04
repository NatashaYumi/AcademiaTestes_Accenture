package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", //� utilizada para ajudar o Cucumber na localiza��o das features (especifica��o execut�veis), que no caso est� localizada em uma pasta dentro do projeto chamada �caracteristicas�;
		glue = "stepdefinitions", //� utilizada para ajudar o Cucumber na localiza��o das classes que cont�m os passos 
		monochrome=true, // � utilizado para definir a formata��o do resultado dos testes na sa�da da console. Se marcado como �true�, o resultado dos testes sai na forma leg�vel, mas se �false�, n�o sai t�o leg�vel;
		tags = "@swag_login or @bancoXYZ",
		plugin = {
				"pretty", // Pretty Format (HTML Report) Pretty Format generates the Cucumber test report in the HTML format, i.e. an HTML file. It is the most readable report format.
				"html:target/cucumber-reports/cucumber-pretty.html",
				"json:target/cucumber-reports/CucumberTestReport.json",
				"junit:target/cucumber-reports/CucumberTestReport.xml"
		}
		)
public class Runner {

}
