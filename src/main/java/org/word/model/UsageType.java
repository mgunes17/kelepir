package org.word.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by mustafa on 10.03.2017.
 */

@Entity
@Table(name = "usage_type")
public class UsageType implements Serializable {
    @Id
    @Column(name = "type_name")
    private String typeName;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "translation", unique = true)
    private String translation;

    public UsageType() {
        //no-arg cons
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
