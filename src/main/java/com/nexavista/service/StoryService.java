package com.nexavista.service;

import java.util.List;

import com.nexavista.exception.StoryException;
import com.nexavista.exception.UserException;
import com.nexavista.model.Story;

public interface StoryService {

	public Story createStory(Story story,Integer userId) throws UserException;
	
	public List<Story> findStoryByUserId(Integer userId) throws UserException, StoryException;
	
	
}
