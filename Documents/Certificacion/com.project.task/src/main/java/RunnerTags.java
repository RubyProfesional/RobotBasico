
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features = "src/test/resources/features/Reto07.feature", tags = "  @Reto07")
@CucumberOptions(features = "src/test/resources/features/ServiciosSofka.feature", tags = "@NavegacionBasica")
//@CucumberOptions(features = "src/test/resources/features/buscarOficinaBanco.feature", tags = "@Buscar")
//@CucumberOptions(features = "src/test/resources/features/calcularLeasing.feature", tags = "@CasoExitosoB")
public class RunnerTags {

}
