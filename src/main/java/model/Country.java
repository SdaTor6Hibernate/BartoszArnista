package model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Country implements ModelClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_ID")
    private int id;
    @Column(name = "CO_NAME")
    private String name;
    @Column(name = "CO_ALIAS")
    private String alias;

    public String toString(){
        return ""+id;
    }

    public void setCountryId(int i) {
    }
}