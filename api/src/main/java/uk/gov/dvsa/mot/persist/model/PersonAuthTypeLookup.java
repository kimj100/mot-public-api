package uk.gov.dvsa.mot.persist.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The persistent class for the person_auth_type_lookup database table.
 */
public class PersonAuthTypeLookup implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private String code;
    private String name;
    private int createdBy;
    private Timestamp createdOn;
    private int lastUpdatedBy;
    private Timestamp lastUpdatedOn;
    private int version;

    public PersonAuthTypeLookup() {

    }

    public String getId() {

        return this.id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getCode() {

        return this.code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public int getCreatedBy() {

        return this.createdBy;
    }

    public void setCreatedBy(int createdBy) {

        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn() {

        return this.createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {

        this.createdOn = createdOn;
    }

    public int getLastUpdatedBy() {

        return this.lastUpdatedBy;
    }

    public void setLastUpdatedBy(int lastUpdatedBy) {

        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Timestamp getLastUpdatedOn() {

        return this.lastUpdatedOn;
    }

    public void setLastUpdatedOn(Timestamp lastUpdatedOn) {

        this.lastUpdatedOn = lastUpdatedOn;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getVersion() {

        return this.version;
    }

    public void setVersion(int version) {

        this.version = version;
    }
}