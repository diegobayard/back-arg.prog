package com.argProg.portfolio.registration.token;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ConfirmationTokenService {

	private final ConfirmationTokenRepo confirmationTokenRepo;

	public ConfirmationTokenService(ConfirmationTokenRepo confirmationTokenRepo) {
		this.confirmationTokenRepo = confirmationTokenRepo;
	}

	public void saveConfirmationToken(ConfirmationToken token) {
		confirmationTokenRepo.save(token);
	}

	public Optional<ConfirmationToken> getToken(String token) {
		return confirmationTokenRepo.findByToken(token);
	}

	public int setConfirmedAt(String token) {
		return confirmationTokenRepo.updateConfirmedAt(token, LocalDateTime.now());
	}
}
