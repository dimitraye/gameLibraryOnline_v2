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
@Table(name="COMMENTARY")
public class Commentary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDCOMMENTARY")
    private long idCommentary;

    @Column(name = "COMMENTARY")
    private String commentary;

    @Column(name = "CREATION_DATE")
    private Date creationDate;


    public long getIdCommentary() {
        return idCommentary;
    }

    public void setIdCommentary(long idCommentary) {
        this.idCommentary = idCommentary;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
