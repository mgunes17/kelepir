package org.word.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by mustafa on 09.03.2017.
 */

@Entity
@Table(name = "meaning")
public class Meaning implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "word", nullable = false)
    private Word word;

    @Column(name = "lexical_meaning", nullable = false)
    private String lexicalMeaning;

    @Column(name = "translation")
    private String translation;

    @OneToMany(mappedBy = "meaning", targetEntity = Example.class,
            fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Example> exampleList;

    public Meaning() {
        //no-arg cons
    }

    public Meaning(Word word, String lexicalMeaning) {
        this.word = word;
        this.lexicalMeaning = lexicalMeaning;
    }

    public Meaning(Word word, String lexicalMeaning, String translation) {
        this.word = word;
        this.lexicalMeaning = lexicalMeaning;
        this.translation = translation;
    }

    //getter-setter
    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public String getLexicalMeaning() {
        return lexicalMeaning;
    }

    public void setLexicalMeaning(String lexicalMeaning) {
        this.lexicalMeaning = lexicalMeaning;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public List<Example> getExampleList() {
        return exampleList;
    }

    public void setExampleList(List<Example> exampleList) {
        this.exampleList = exampleList;
    }
}
