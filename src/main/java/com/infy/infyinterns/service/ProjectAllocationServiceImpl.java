package com.infy.infyinterns.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infy.infyinterns.dto.MentorDTO;
import com.infy.infyinterns.dto.ProjectDTO;
import com.infy.infyinterns.exception.InfyInternException;


@Service
public class ProjectAllocationServiceImpl implements ProjectAllocationService {

	@Override
	public Integer allocateProject(ProjectDTO project) throws InfyInternException {

		return null;
	}

	
	@Override
	public List<MentorDTO> getMentors(Integer numberOfProjectsMentored) throws InfyInternException {
		return null;
	}


	@Override
	public void updateProjectMentor(Integer projectId, Integer mentorId) throws InfyInternException {
		
	}

	@Override
	public void deleteProject(Integer projectId) throws InfyInternException {
		
	}
}