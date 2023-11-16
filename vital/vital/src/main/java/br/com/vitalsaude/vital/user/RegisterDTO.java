package br.com.vitalsaude.vital.user;

public record RegisterDTO(String login, String password, UserRole role) {
}
