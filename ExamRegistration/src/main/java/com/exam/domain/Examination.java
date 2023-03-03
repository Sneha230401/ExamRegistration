package com.exam.domain;

import javax.persistence.*;

@Entity
@Table(name = "Examination")

public class Examination {

    @Id
    @Column(name = "code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;

    @Column(nullable = false, name = "name")
    private String name;

    @Column(name = "duration")
    private String duration;

    @Column(name = "SRN", nullable = false)
    private String srn;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getSrn() {
        return srn;
    }

    public void setSrn(String srn) {
        this.srn = srn;
    }
}
