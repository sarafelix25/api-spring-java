package br.com.sara.api.services;

import br.com.sara.api.domain.User;

public interface UserService {
    User findById(Integer id);
}
