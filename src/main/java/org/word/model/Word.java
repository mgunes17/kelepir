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

    @Column(name = "usage", nullable = false)
    private String usage;

    @Column(name = "record_date", nullable = false)
    private Date recordDate;

    @OneToMany(mappedBy = "word", targetEntity = Meaning.class,
            fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Meaning> meaningList;

    public Word() {
        //no-arg cons
    }

    public Word(String vocable, String usage) {
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

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
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
}
