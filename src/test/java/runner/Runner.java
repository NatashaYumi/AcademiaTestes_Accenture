package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features", //É utilizada para ajudar o Cucumber na localização das features (especificação executáveis), que no caso está localizada em uma pasta dentro do projeto chamada “caracteristicas”;
		glue = "stepdefinitions", //É utilizada para ajudar o Cucumber na localização das classes que contém os passos 
		monochrome=true, // É utilizado para definir a formatação do resultado dos testes na saída da console. Se marcado como ”true”, o resultado dos testes sai na forma legível, mas se “false”, não sai tão legível;
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
