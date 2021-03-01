package com.ml.StorageApi.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "diarys")
public class Diary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_dairy")
    private int idDairy;
    @Column(name = "start_time")
    private Date startTime;
    @Column(name = "ending_time")
    private Date endingTime;
    @ManyToOne
    @JoinColumn(name = "id_dentist", nullable = false)
    private Dentist dentist;
    @OneToMany(mappedBy = "diary")
    private List<Turn> turns;

    public List<Turn> getTurns() {
        return turns;
    }

    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }

    public int getIdDairy() {
        return idDairy;
    }

    public void setIdDairy(int idDairy) {
        this.idDairy = idDairy;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndingTime() {
        return endingTime;
    }

    public void setEndingTime(Date endingTime) {
        this.endingTime = endingTime;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }
}