package pl.sda.usersviewer.service;

import pl.sda.usersviewer.model.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> showAllUsers(Integer page, Integer perPage);
}
