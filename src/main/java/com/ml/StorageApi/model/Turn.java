package com.ml.StorageApi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="turns")
public class Turn {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_turn")
    private int idTurn;
    private Date day;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_diary", nullable = false)
    private Diary diary;
    @ManyToOne
    @JoinColumn(name = "id_turn_status", nullable = false)
    private TurnStatus turnStatus;
    @ManyToOne
    @JoinColumn(name = "id_patient", nullable = false)
    private Patient patient;

    public Diary getDiary() {
        return diary;
    }

    public void setDiary(Diary diary) {
        this.diary = diary;
    }

    public TurnStatus getTurnStatus() {
        return turnStatus;
    }

    public void setTurnStatus(TurnStatus turnStatus) {
        this.turnStatus = turnStatus;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getIdTurn() {
        return idTurn;
    }

    public void setIdTurn(int idTurn) {
        this.idTurn = idTurn;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}

