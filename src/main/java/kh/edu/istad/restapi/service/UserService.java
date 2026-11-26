package kh.edu.istad.restapi.service;

import kh.edu.istad.restapi.dto.CreateUserRequest;
import kh.edu.istad.restapi.dto.UserResponse;
import kh.edu.istad.restapi.model.User;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;

public interface UserService {
    Page<UserResponse> getAllWithPaging(int pageNumber, int pageSize);
    List<UserResponse> getAll();
    UserResponse getById(UUID id);
    User create(CreateUserRequest request);
    void deleteById(UUID id);
}
