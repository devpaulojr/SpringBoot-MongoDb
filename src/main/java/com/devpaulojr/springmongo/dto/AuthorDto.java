package com.devpaulojr.springmongo.dto;

import com.devpaulojr.springmongo.model.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class AuthorDto implements Serializable {

    @Id
    private String id;

    private String name;
    private String email;

    public AuthorDto(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }
}
