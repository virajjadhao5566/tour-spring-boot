package com.tour.project.tourSpring.Services;

import com.tour.project.tourSpring.Entities.TourPackage;
import com.tour.project.tourSpring.Repositories.TourRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TourService {
    @Autowired
    TourRepository tourRepository;
}
