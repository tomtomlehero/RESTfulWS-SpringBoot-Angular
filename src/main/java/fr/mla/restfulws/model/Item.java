package fr.mla.restfulws.model;

import javax.persistence.*;

@Entity
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String description;

    @Column
    private boolean checked;


    public Item() {
    }

    public Item(String description, boolean checked) {
        this.description = description;
        this.checked = checked;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }


    @Override
    public String toString() {
        return String.format("Item [ id=%d - description = %s - checked = %b ]", id, description, checked);
    }
}
