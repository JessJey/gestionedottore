package it.prova.gestionedottore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.prova.gestionedottore.model.Dottore;
import it.prova.gestionedottore.service.DottoreService;

@SpringBootApplication
public class GestionedottoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionedottoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDottori(DottoreService dottoreService) {
		return (args) -> {

			// inizializzo il Db                                        
			dottoreService.save(new Dottore("dott1", "ore1", "codice1", false, true));
			dottoreService.save(new Dottore("dott2", "ore2", "codice2", false, true));
			dottoreService.save(new Dottore("dott3", "ore3", "codice3", false, true));
			dottoreService.save(new Dottore("dott4", "ore4", "codice4", false, true));
			dottoreService.save(new Dottore("dott5", "ore5", "codice5", false, true));
			dottoreService.save(new Dottore("dott6", "ore6", "codice6", false, true));
			dottoreService.save(new Dottore("dott7", "ore7", "codice7", false, true));
			dottoreService.save(new Dottore("dott8", "ore8", "codice8", false, true));
			
			// verifico inserimento
			System.out.println("Elenco Dottori");
			dottoreService.listAll().forEach(dottItem -> {
				System.out.println(dottItem);
			});

			
		};
	}
	
	
}