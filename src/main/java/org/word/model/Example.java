package org.word.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by mustafa on 09.03.2017.
 */

@Entity
@Table(name = "example")
public class Example implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "meaning", nullable = false)
    private Meaning meaning;

    @Column(name = "sentence", nullable = false)
    private String sentence;

    @Column(name = "translation")
    private String sentenceTranslation;

    public Example() {
        //no-arg cons
    }

    public Example(Meaning meaning, String sentence) {
        this.meaning = meaning;
        this.sentence = sentence;
    }

    public Example(Meaning meaning, String sentence, String sentenceTranslation) {
        this.meaning = meaning;
        this.sentence = sentence;
        this.sentenceTranslation = sentenceTranslation;
    }

    //getter-setter
    public Meaning getMeaning() {
        return meaning;
    }

    public void setMeaning(Meaning meaning) {
        this.meaning = meaning;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentenceTranslation() {
        return sentenceTranslation;
    }

    public void setSentenceTranslation(String sentenceTranslation) {
        this.sentenceTranslation = sentenceTranslation;
    }
}
