package com.example.biblioteca;

import org.junit.jupiter.api.Test;

public class LivroTest {

    @Test
    void testCriarLivro(){

        Livro livro = new Livro(1, "Harry Potter", "J.K Rowling", true);
        assert(livro.getId() == 1);
        assert(livro.getTitulo().equals("Harry Potter"));
        assert(livro.getAutor().equals("J.K Rowling"));
        assert(livro.isDisponivel());
    }

}
