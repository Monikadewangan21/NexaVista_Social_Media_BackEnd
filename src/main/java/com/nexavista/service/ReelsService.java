package com.nexavista.service;

import java.util.List;

import com.nexavista.exception.UserException;
import com.nexavista.model.Reels;
import com.nexavista.model.User;

public interface ReelsService {
	
	public Reels createReel(Reels reel,User user);
	public List<Reels> findAllReels();
	public List<Reels> findUsersReel(Integer userId) throws UserException;

}
