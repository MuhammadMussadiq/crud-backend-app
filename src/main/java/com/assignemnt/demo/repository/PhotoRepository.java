package com.assignemnt.demo.repository;

import com.assignemnt.demo.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {

    void deleteAllByIdNotIn(List<Long> ids);
}
