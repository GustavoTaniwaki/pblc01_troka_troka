package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class User {
    @Id
    private String cpf;
    private String password;
    private String name;
    private Date birthDate;
    private String phone;
    private String email;
    private String address;
    private boolean isSuspect;

    private List<Good> ownership = new ArrayList<>();
    private List<Good> hearted = new ArrayList<>();
    private List<Good> interestDisplayed = new ArrayList<>();
    private List<Good> cart = new ArrayList<>();
    private List<Message> comment = new ArrayList<>();
    private List<Chat> chats = new ArrayList<>();
    private List<Rating> userRating = new ArrayList<>();
    private List<Interest> interests = new ArrayList<>();


}