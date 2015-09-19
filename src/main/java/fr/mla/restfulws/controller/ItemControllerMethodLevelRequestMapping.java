package fr.mla.restfulws.controller;


import fr.mla.restfulws.dao.ItemRepository;
import fr.mla.restfulws.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemControllerMethodLevelRequestMapping {


    @Autowired
    ItemRepository itemRepository;


    @RequestMapping("/getitems")
    public Iterable<Item> findItems() {
        return itemRepository.findAll();
    }

    @RequestMapping("/additem")
    public Item addItem(
            @RequestParam(value = "desc")
            String description,

            @RequestParam(value = "check", defaultValue = "1")
            boolean checked) {

        Item item = new Item(description, checked);
        return itemRepository.save(item);
    }



}
