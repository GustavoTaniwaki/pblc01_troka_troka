package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

//import java.awt.image.BufferedImage;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Good {
    @Id
    @GeneratedValue
    private int cod;
    private String category;
    private String name;
    private float value;
    private String stateConservation; //Definir Estados
    private String avaliability; // Definir Estados
    //private List<BufferedImage> images = new ArrayList<>();
}
