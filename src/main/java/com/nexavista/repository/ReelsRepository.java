package com.nexavista.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexavista.model.Reels;

public interface ReelsRepository extends JpaRepository<Reels, Long> {
	
	public List<Reels> findByUserId(Integer  userId);

}
