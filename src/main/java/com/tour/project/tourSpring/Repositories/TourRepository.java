package com.tour.project.tourSpring.Repositories;

import com.tour.project.tourSpring.Entities.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends CrudRepository<Tour,Integer> {
}
