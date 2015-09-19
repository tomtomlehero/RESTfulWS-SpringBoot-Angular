package fr.mla.restfulwsangularproto.controller;


import fr.mla.restfulwsangularproto.dao.ItemRepository;
import fr.mla.restfulwsangularproto.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {


    @Autowired
    ItemRepository itemRepository;


//    @RequestMapping("/item")
//    public Item showItem(
//            @RequestParam(value="desc", defaultValue = "[unknown item]")
//            String description,
//
//            @RequestParam(value="check", defaultValue = "1")
//            boolean checked) {
//
//        return new Item(description, checked);
//    }



    @RequestMapping("/items")
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

//    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//    public Item updateItem(@RequestBody Item item, @PathVariable Integer id) {
//        item.setId(id);
//        return itemRepository.saveAndFlush(item);
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//    public void deleteItem(@PathVariable Integer id) {
//        itemRepository.delete(id);
//    }


}
