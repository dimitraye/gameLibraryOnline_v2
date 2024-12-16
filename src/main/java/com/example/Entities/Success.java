package com.example.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="SUCCESS")
public class Success {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IDSUCCESS")
    private long idSuccess;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "OWNED")
    private Boolean owned;

    public long getIdSuccess() {
        return idSuccess;
    }

    public void setIdSuccess(long idSuccess) {
        this.idSuccess = idSuccess;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getOwned() {
        return owned;
    }

    public void setOwned(Boolean owned) {
        this.owned = owned;
    }
}
