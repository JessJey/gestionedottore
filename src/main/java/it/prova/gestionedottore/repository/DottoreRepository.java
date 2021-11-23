package it.prova.gestionedottore.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import it.prova.gestionedottore.model.Dottore;


public interface DottoreRepository extends PagingAndSortingRepository<Dottore, Long>, JpaSpecificationExecutor<Dottore> {

	public Dottore findByCodiceDipendente(String codiceInput);
	
}
