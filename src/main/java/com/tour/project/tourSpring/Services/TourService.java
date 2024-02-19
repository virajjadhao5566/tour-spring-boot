package com.tour.project.tourSpring.Services;

import com.tour.project.tourSpring.Entities.Difficulty;
import com.tour.project.tourSpring.Entities.Region;
import com.tour.project.tourSpring.Entities.Tour;
import com.tour.project.tourSpring.Entities.TourPackage;
import com.tour.project.tourSpring.Repositories.TourPackageRepository;
import com.tour.project.tourSpring.Repositories.TourRepository;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TourService {
    @Autowired
    private TourRepository tourRepository;
    @Autowired
    private TourPackageRepository tourPackageRepository;

//    Create a tour
    public Tour createTour(Integer id, String title, String description, String blurb, Integer price,
                           String bullets, String keywords, String tourPackageName,
                           Difficulty difficulty, Region region){
        TourPackage tourPackage = tourPackageRepository.findById(tourPackageName)
                .orElseThrow(()-> new RuntimeException("Tour package not found"));
        return tourRepository.save(new Tour(id,title,description,blurb,price,bullets,
                keywords,tourPackageName,difficulty,region));
    }
//    Total number of tour
    public long totalTours(){
        return tourRepository.count();
    }
}

