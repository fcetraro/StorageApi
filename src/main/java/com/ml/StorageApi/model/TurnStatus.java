package com.ml.StorageApi.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "turn_status")
public class TurnStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_turn_status")
    private int idTurnStatus;
    private String name;
    private String description;
    @OneToMany(mappedBy = "turnStatus")
    private List<Turn> turns;

    public List<Turn> getTurns() {
        return turns;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }

    public int getIdTurnStatus() {
        return idTurnStatus;
    }

    public void setIdTurnStatus(int idTurnStatus) {
        this.idTurnStatus = idTurnStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}