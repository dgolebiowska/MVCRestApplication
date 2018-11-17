package pl.sda.usersviewer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.usersviewer.connector.ReqresSampleUserDataConnector;
import pl.sda.usersviewer.connector.User;
import pl.sda.usersviewer.model.UserDTO;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserService implements IUserService {
    private ReqresSampleUserDataConnector reqresSampleUserDataConnector;
    @Autowired
    public UserService(ReqresSampleUserDataConnector reqresSampleUserDataConnector) {
        this.reqresSampleUserDataConnector = reqresSampleUserDataConnector;
    }


    @Override
    public List<UserDTO> showAllUsers(Integer page, Integer perPage) {
            List<User> users = reqresSampleUserDataConnector.connect( page,perPage).getUsers();

            return users.stream()
                    .map(b->new UserDTO(b.getId(),b.getFirstName(),b.getLastName(),b.getAvatar(),null, 0)).collect(Collectors.toList());


        }
    }



