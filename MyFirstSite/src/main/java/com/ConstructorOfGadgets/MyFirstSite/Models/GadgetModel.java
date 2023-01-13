package com.ConstructorOfGadgets.MyFirstSite.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class GadgetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    int mAh;
    int Hz;
    int GHz;
    String name;
    String TypeScreen;
    String ProcessorName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getmAh() {
        return mAh;
    }

    public void setmAh(int mAh) {
        this.mAh = mAh;
    }

    public int getHz() {
        return Hz;
    }

    public void setHz(int hz) {
        Hz = hz;
    }

    public int getGHz() {
        return GHz;
    }

    public void setGHz(int GHz) {
        this.GHz = GHz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeScreen() {
        return TypeScreen;
    }

    public void setTypeScreen(String typeScreen) {
        TypeScreen = typeScreen;
    }

    public GadgetModel() {
    }

    public String getProcessorName() {
        return ProcessorName;
    }

    public void setProcessorName(String processorName) {
        ProcessorName = processorName;
    }

    public GadgetModel(String name, int mAh, String typeScreen, int hz, String processorName, int GHz) {
        this.mAh = mAh;
        Hz = hz;
        this.GHz = GHz;
        this.name = name;
        TypeScreen = typeScreen;
        ProcessorName = processorName;
    }
    public GadgetModel(String name, int mAh, String typeScreen, int hz) {
        this.mAh = mAh;
        Hz = hz;
        this.name = name;
        TypeScreen = typeScreen;

    }
}
