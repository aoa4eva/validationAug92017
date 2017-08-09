package me.aoa4eva.validationdemo2.models;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TvShow {
    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min=3,max=20)
    private String name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
