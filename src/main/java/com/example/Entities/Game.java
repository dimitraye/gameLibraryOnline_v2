package com.example.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="GAME")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDGAME")
    private long idGame;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PLATEFORM")
    private Platform platform;

    @Column(name = "GAMEGENRE")
    private VideoGameGenre videoGameGenre;

    @Column(name = "DATEPURCHASE")
    private Date datePurchase;

    @Column(name = "PLAYHOURS")
    private int playHours;

    @Column(name = "STATE")
    private GameStatus state;

    @Column(name = "PICTURE")
    private String picture;


    public long getIdGame() {
        return idGame;
    }

    public void setIdGame(long idGame) {
        this.idGame = idGame;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public VideoGameGenre getVideoGameGenre() {
        return videoGameGenre;
    }

    public void setVideoGameGenre(VideoGameGenre videoGameGenre) {
        this.videoGameGenre = videoGameGenre;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
    }

    public int getPlayHours() {
        return playHours;
    }

    public void setPlayHours(int playHours) {
        this.playHours = playHours;
    }

    public GameStatus getState() {
        return state;
    }

    public void setState(GameStatus state) {
        this.state = state;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
