package IOCandDI;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:resources/app-context-xml.xml"})
@Configuration
public class HelloWorldConfigurationImportResource {
}
