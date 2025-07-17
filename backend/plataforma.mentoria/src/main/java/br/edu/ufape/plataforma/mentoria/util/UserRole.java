package br.edu.ufape.plataforma.mentoria.util;

public enum UserRole {
    
    ADMIN("ADMIN"),
    USER("USER");

    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}