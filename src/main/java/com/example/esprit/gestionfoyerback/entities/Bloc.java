package com.example.esprit.gestionfoyerback.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private long idBloc ;
    private String nomBloc ;
    private long capaciteBloc ;

    @ManyToOne
    private Foyer foyer ;

    @JsonBackReference
    @OneToMany(mappedBy = "bloc",cascade = CascadeType.ALL)
    private List<Chambre> chambres ;

}
