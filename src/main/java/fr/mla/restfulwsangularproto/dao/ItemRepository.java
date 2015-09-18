package fr.mla.restfulwsangularproto.dao;


//import org.springframework.data.jpa.repository.JpaRepository;

import fr.mla.restfulwsangularproto.model.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemRepository extends CrudRepository<Item, Long> {

    List<Item> findByDescription(String description);
    List<Item> findByChecked(Boolean checked);



}
