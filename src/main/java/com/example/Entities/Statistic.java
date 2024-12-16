package com.example.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "ENTITY")
public class Statistic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDSTATISTIC")
    private Long id;

    @Column(name = "nbTOTALGAMES")
    private int nbTotalGames;

    @Column(name = "NGGAMESNOTSTARTED")
    private int nbGamesNotStarted;

    @Column(name = "NBGAMESFINISHED")
    private int ngGamesFinished;

    @Column(name = "NBGAMESBYPLATFORM")
    private int nbGamesByPlateform;

    @Column(name = "NBGAMESBYGENRE")
    private int nbGamesByGenre;
}
