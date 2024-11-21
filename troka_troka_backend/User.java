package br.edu.unifei.pblc01.troka_toka.troka_troka_backend.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
    @ManyToMany
    private List<Good> ownership = new ArrayList<>();
    @ManyToMany
    private List<Good> hearted = new ArrayList<>();
    @ManyToMany
    private List<Good> interestDisplayed = new ArrayList<>();
    @ManyToMany
    private List<Good> cart = new ArrayList<>();
    @ManyToMany
    private List<Message> comment = new ArrayList<>();
    @ManyToMany
    private List<Chat> chats = new ArrayList<>();
    @ManyToMany
    private List<Rating> userRating = new ArrayList<>();
    @ManyToMany
    private List<Interest> interests = new ArrayList<>();

}