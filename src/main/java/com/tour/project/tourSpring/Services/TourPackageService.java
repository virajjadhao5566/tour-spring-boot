package com.tour.project.tourSpring.Services;

import ch.qos.logback.core.util.DatePatternToRegexUtil;
import com.tour.project.tourSpring.Entities.Tour;
import com.tour.project.tourSpring.Entities.TourPackage;
import com.tour.project.tourSpring.Repositories.TourPackageRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TourPackageService {
    @Autowired
    TourPackageRepository tourPackageRepository;

//    Create a tour package
    public TourPackage createTourPackage(String code,String name){
        return tourPackageRepository.findById(code)
                .orElse(tourPackageRepository.save(new TourPackage(code,name)));
    }
//    Look up all tour packages
    public Iterable<TourPackage> lookup(){
        return tourPackageRepository.findAll();
    }

//    Count all tool packages
    public long countTourPackages(){
        return tourPackageRepository.count();
    }
}

