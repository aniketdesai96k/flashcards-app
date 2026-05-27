package com.flashcards.flashcards.model;
import jakarta.persistence.*;

@Entity
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String front;
    private String back;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Word(){
    }
    public Long getId(){
        return id;
    }
    public String getFront(){
        return front;
    }
    public void setFront(String front){
        this.front = front;
    }
    public String getBack(){
        return back;
    }
    public void setBack(String back){
        this.back = back;
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user = user;
    }
}