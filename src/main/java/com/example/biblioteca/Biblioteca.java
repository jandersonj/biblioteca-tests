package com.example.biblioteca;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public Livro getLivroPorId(int id) {
        return livros.stream()
                .filter(livro -> livro.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void emprestarLivro(Livro livro, Usuario usuario) {
        if (livro != null && livro.isDisponivel()) {
            livro.setDisponivel(false);
        }
    }

    public void devolverLivro(Livro livro) {
        if (livro != null) {
            livro.setDisponivel(true);
        }
    }

}
