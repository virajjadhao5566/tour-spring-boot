package com.tour.project.tourSpring.Entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
public enum Region {
    Mumbai("Mumbai"),Delhi("Delhi"),Bangolore("Bangalore"),Kolkata("Kolkata");
    private String label;
    private Region(String label){
        this.label = label;
    }
    public static Region findByLabel(String byLabel){
        for(Region region:Region.values()){
            if(region.label.equalsIgnoreCase(byLabel)) return region;
        }
        return null;
    }
}
