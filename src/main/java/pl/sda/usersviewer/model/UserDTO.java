package pl.sda.usersviewer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
public class UserDTO {
    private int id;

    private String firstName;

    private String lastName;

    private String avatar;

    private Date birthday;

    private int age;
}
