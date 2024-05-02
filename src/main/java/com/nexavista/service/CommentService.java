package com.nexavista.service;

import com.nexavista.exception.CommentException;
import com.nexavista.exception.PostException;
import com.nexavista.exception.UserException;
import com.nexavista.model.Comments;

public interface CommentService {
	
	public Comments createComment(Comments comment,Integer postId,Integer userId) throws PostException, UserException;

	public Comments findCommentById(Integer commentId) throws CommentException;
	public Comments likeComment(Integer CommentId,Integer userId) 
			throws UserException, CommentException;
}
