package com.challenge.repository;

import com.challenge.entity.Submission;
import org.springframework.data.repository.CrudRepository;

public interface SubmissionRepository extends CrudRepository<Submission,Long> {
}
