package io.github.educontessi.hexagonalarchitecture.core.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.github.educontessi.hexagonalarchitecture.core.util.StringUtils;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Model {@link Country} to manipulate country table
 *
 * @author Eduardo Possamai Contessi
 */
@JsonIgnoreProperties(value = {"created", "changed"})
public class Country extends BaseModel{

    private Long id;

    @NotNull
    @Size(min = 3, max = 100)
    private String name;

    @NotNull
    @Size(min = 2, max = 10)
    private String acronym;

    @NotNull
    @Size(min = 2, max = 10)
    private String bacen;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = StringUtils.formatName(name);
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getBacen() {
        return bacen;
    }

    public void setBacen(String bacen) {
        this.bacen = bacen;
    }
}
