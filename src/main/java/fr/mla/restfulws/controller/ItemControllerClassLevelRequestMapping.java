package fr.mla.restfulws.controller;


import fr.mla.restfulws.dao.ItemRepository;
import fr.mla.restfulws.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/items")
public class ItemControllerClassLevelRequestMapping {


    @Autowired
    private ItemRepository itemRepository;


    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Item> findItems() {
        return itemRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Item addItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Item updateItem(@RequestBody Item item, @PathVariable Integer id) {
        item.setId(id);
        return itemRepository.save(item);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteItem(@PathVariable Long id) {
        itemRepository.delete(id);
    }







}
