package com.example.biblioteca;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private Boolean disponivel;

    public Livro(int id, String titulo, String autor, Boolean disponivel) {
        
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public int getId() {  return id; };
    public String getTitulo() { return titulo; };
    public String getAutor() { return autor; };
    public Boolean isDisponivel() { return disponivel; };
    public void setDisponivel(Boolean disponivel) {this.disponivel = disponivel ;}

    

}
