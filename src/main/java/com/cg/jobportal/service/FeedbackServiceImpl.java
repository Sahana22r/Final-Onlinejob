package com.cg.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.jobportal.entity.Feedback;
import com.cg.jobportal.repository.FeedbackRepository;
@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	FeedbackRepository feedrepo;

	@Override
	public Feedback addFeedback(Feedback feedback) {
		return feedrepo.save(feedback);
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		return feedrepo.findAll();
	}

	@Override
	public Feedback updateFeedback(Feedback ent) {
		return feedrepo.save(ent);
	}

}
