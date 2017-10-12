package br.com.mestrep.patrimonio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mestrep.patrimonio.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
