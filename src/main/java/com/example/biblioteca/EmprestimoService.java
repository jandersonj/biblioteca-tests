package com.example.biblioteca;

public class EmprestimoService {
    private Biblioteca biblioteca;

    public EmprestimoService(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void emprestarLivro(int livroId, Usuario usuario) {
        Livro livro = biblioteca.getLivroPorId(livroId);
        biblioteca.emprestarLivro(livro, usuario);
    }

    public void devolverLivro(int livroId) {
        Livro livro = biblioteca.getLivroPorId(livroId);
        biblioteca.devolverLivro(livro);
    }
}