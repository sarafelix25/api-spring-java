package br.com.sara.api.services;

import br.com.sara.api.entity.User;

public interface UserService {
    User findById(Integer id);
}
