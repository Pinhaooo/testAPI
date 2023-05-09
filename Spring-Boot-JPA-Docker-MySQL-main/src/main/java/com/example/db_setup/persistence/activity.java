package com.example.db_setup.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "activity")
public class activity {

    @Id
    private Long id;
    private String nome;
    private String luogo;
    private String data_inizio;
    private String data_fine;
    private Integer posti_dispo;
    private Integer posti_occu;

    @Override
    public String toString(){
        return "activity{ " +
                "nome = " + nome +
                ", luogo = ''" + luogo + '\'' +
                ", data_inizio ' " + data_inizio  + '\'' +
                ", data_fine '" + data_fine + '\''+
                ", posti_disponibili '" + posti_dispo +'\'' +
                ", posti_occupati ' " + posti_occu + '}';
    }
}
