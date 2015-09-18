package fr.mla.restfulwsangularproto.controller;


import fr.mla.restfulwsangularproto.model.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {



    @RequestMapping("/item")
    public Item showItem(
            @RequestParam(value="desc", defaultValue = "[unknown item]")
            String description,

            @RequestParam(value="check", defaultValue = "1")
            boolean checked) {

        return new Item(description, checked);
    }


}
