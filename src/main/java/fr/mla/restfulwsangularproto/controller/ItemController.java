package fr.mla.restfulwsangularproto.controller;


import fr.mla.restfulwsangularproto.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ItemController {


    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/item")
    public Item showItem(
            @RequestParam(value="desc", defaultValue = "[unknown item]")
            String description,

            @RequestParam(value="check", defaultValue = "1")
            boolean checked) {

        return new Item(counter.incrementAndGet(), description, checked);
    }


}
