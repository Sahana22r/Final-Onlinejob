package com.cg.jobportal.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.jobportal.entity.Jobs;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, Long>{

	Jobs findByJobTitle(@Param("Title")String jobTitle);

}
