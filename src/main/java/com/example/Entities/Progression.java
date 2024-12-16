package com.example.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="PROGRESSION")
public class Progression {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDPROGRESSION")
    private long idProgression;

    @Column(name = "DETAILS_PROGRESSION")
    private String detailsProgression;

    @Column(name = "PERCENTAGE_COMPLETION")
    private int percentageCompletion;

    public long getIdProgression() {
        return idProgression;
    }

    public void setIdProgression(long idProgression) {
        this.idProgression = idProgression;
    }

    public String getDetailsProgression() {
        return detailsProgression;
    }

    public void setDetailsProgression(String detailsProgression) {
        this.detailsProgression = detailsProgression;
    }

    public int getPercentageCompletion() {
        return percentageCompletion;
    }

    public void setPercentageCompletion(int percentageCompletion) {
        this.percentageCompletion = percentageCompletion;
    }
}
