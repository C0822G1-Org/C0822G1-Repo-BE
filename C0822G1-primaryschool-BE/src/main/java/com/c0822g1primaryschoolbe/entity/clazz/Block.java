package com.c0822g1primaryschoolbe.entity.clazz;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Block {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "block_id")
    private Long blockId;
    @Column(columnDefinition = "varchar(45)")
    private Integer blockName;
    @JsonBackReference
    @OneToMany(mappedBy = "block")
    private Set<Clazz> clazz;


    public Long getBlockId() {
        return blockId;
    }

    public void setBlockId(Long blockId) {
        this.blockId = blockId;
    }

    public Integer getBlockName() {
        return blockName;
    }

    public void setBlockName(Integer blockName) {
        this.blockName = blockName;
    }

    public Set<Clazz> getClazz() {
        return clazz;
    }

    public void setClazz(Set<Clazz> clazz) {
        this.clazz = clazz;
    }
}
