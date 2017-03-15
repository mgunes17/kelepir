package org.word.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by mustafa on 08.03.2017.
 */

@Entity
@Table(name = "word")
public class Word implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "vocable", nullable = false)
    private String vocable;

    @ManyToOne
    @JoinColumn(name = "usage", nullable = false)
    private UsageType usage;

    @Column(name = "record_date", nullable = false)
    private Date recordDate;

    @OneToMany(mappedBy = "word", targetEntity = Meaning.class,
            fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Meaning> meaningList;

    @Transient
    private String wordAndUsage;

    public Word() {
        //no-arg cons
    }

    public Word(String vocable, UsageType usage) {
        this.vocable = vocable;
        this.usage = usage;
    }

    //getter-setter
    public int getId() {
        return id;
    }

    public String getVocable() {
        return vocable;
    }

    public void setVocable(String vocable) {
        this.vocable = vocable;
    }

    public UsageType getUsage() {
        return usage;
    }

    public void setUsage(UsageType usage) {
        this.usage = usage;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public List<Meaning> getMeaningList() {
        return meaningList;
    }

    public void setMeaningList(List<Meaning> meaningList) {
        this.meaningList = meaningList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWordAndUsage() {
        return vocable + " (" + usage.getTypeName() +  ")";
    }
}
