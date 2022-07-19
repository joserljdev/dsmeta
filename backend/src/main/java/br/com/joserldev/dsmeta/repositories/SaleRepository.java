package br.com.joserldev.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joserldev.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
