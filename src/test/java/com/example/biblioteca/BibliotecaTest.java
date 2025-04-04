package com.example.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    void testAdicionarLivro() {
        Livro livro = new Livro(1, "Harry Potter", "J.K Rowling", true);
        biblioteca.adicionarLivro(livro);
        assertEquals(livro, biblioteca.getLivroPorId(1));
    }

    @Test
    void testEmprestarLivroDisponivel() {
        Livro livro = new Livro(1, "Harry Potter", "J.K Rowling", true);
        Usuario usuario = new Usuario(1, "João");
        biblioteca.adicionarLivro(livro);
        biblioteca.emprestarLivro(livro, usuario);
        assertFalse(livro.isDisponivel());
    }


    @Test
    void testDevolverLivro() {
        Livro livro = new Livro(1, "Harry Potter", "J.K Rowling", false);
        biblioteca.adicionarLivro(livro);
        biblioteca.devolverLivro(livro);
        assertTrue(livro.isDisponivel());
    }
}
