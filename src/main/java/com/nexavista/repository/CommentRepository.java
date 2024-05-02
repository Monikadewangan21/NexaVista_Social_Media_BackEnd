package com.nexavista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexavista.model.Comments;


public interface CommentRepository extends JpaRepository<Comments, Integer> {

}
