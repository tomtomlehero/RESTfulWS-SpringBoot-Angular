package fr.mla.restfulws;

import fr.mla.restfulws.dao.ItemRepository;
import fr.mla.restfulws.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    ItemRepository repository;


    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        // save a couple of items
        repository.save(new Item("Banane", true));
        repository.save(new Item("Cerise", true));
        repository.save(new Item("Fraise", true));
        repository.save(new Item("Pomme", true));
        repository.save(new Item("Abricot", true));
        repository.save(new Item("Pèche", true));

        repository.save(new Item("Salade", false));
        repository.save(new Item("Haricot", false));
        repository.save(new Item("Courge", false));
        repository.save(new Item("Patate", false));
        repository.save(new Item("Radis", false));
        repository.save(new Item("Carotte", false));

//        // fetch all customers
//        System.out.println("Items found with findAll():");
//        System.out.println("-------------------------------");
//        for (Item item : repository.findAll()) {
//            System.out.println(item);
//        }
//        System.out.println();
//
//        // fetch an individual item by ID
//        Item item = repository.findOne(1L);
//        System.out.println("Item found with findOne(1L):");
//        System.out.println("--------------------------------");
//        System.out.println(item);
//        System.out.println();
//
//        // fetch items by description
//        System.out.println("Item found with findByDescription():");
//        System.out.println("--------------------------------------------");
//        for (Item item1 : repository.findByDescription("Cerise")) {
//            System.out.println(item1);
//        }
//
//        // fetch items by description
//        System.out.println("Item found with findByChecked():");
//        System.out.println("--------------------------------------------");
//        for (Item item1 : repository.findByChecked(true)) {
//            System.out.println(item1);
//        }

    }
}
