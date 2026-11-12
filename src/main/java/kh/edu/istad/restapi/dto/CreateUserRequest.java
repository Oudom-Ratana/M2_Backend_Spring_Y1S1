package kh.edu.istad.restapi.dto;

public record CreateUserRequest(
        String name,
        String username,
        String password
) {
}
