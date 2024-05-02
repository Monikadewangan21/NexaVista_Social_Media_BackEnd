package com.nexavista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexavista.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {

	PasswordResetToken findByToken(String token);

}
