package com.noname.searchTools;


import org.springframework.stereotype.Service;

import java.util.HashSet;


public class Filter {
    private HashSet<String> contractType;
    private HashSet<String> jobType;
    private HashSet<String> timeType;
    private HashSet<String> skills;
    private HashSet<String> field;

    public Filter() {
        this.contractType = new HashSet<>();
        this.jobType = new HashSet<>();
        this.timeType = new HashSet<>();
        this.skills = new HashSet<>();
        this.field = new HashSet<>();
    }

    public HashSet<String> getContractType() {
        return contractType;
    }

    public void setContractType(HashSet<String> contractType) {
        this.contractType = contractType;
    }

    public HashSet<String> getJobType() {
        return jobType;
    }

    public void setJobType(HashSet<String> jobType) {
        this.jobType = jobType;
    }

    public HashSet<String> getTimeType() {
        return timeType;
    }

    public void setTimeType(HashSet<String> timeType) {
        this.timeType = timeType;
    }

    public HashSet<String> getSkills() {
        return skills;
    }

    public void setSkills(HashSet<String> skills) {
        this.skills = skills;
    }

    public HashSet<String> getField() {
        return field;
    }

    public void setField(HashSet<String> field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Filter{" +
                "contractType=" + contractType +
                ", jobType=" + jobType +
                ", timeType=" + timeType +
                ", skills=" + skills +
                ", field=" + field +
                '}';
    }
}
