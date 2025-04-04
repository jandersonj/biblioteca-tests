package com.example.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class EmprestimoServiceTest {

    private Biblioteca bibliotecaMock;
    private EmprestimoService service;

    @BeforeEach
    void setUp() {
        bibliotecaMock = Mockito.mock(Biblioteca.class);
        service = new EmprestimoService(bibliotecaMock);
    }

    // Teste para verificar se o livro é emprestado corretamente
    @Test 
    void testeEmprestarLivro() {

        Livro livro = new Livro(1, "Harry Potter", "J.K Rowling", true);
        Usuario usuario = new Usuario(1, "Maria");
        // Simulando o comportamento do método getLivroPorId
        when(bibliotecaMock.getLivroPorId(1)).thenReturn(livro);
        // Simulando o comportamento do método emprestarLivro
        service.emprestarLivro(1, usuario);
        // Verificando se o livro foi emprestado corretamente 
        assertTrue(livro.isDisponivel()); 
        // Verificando se o método emprestarLivro foi chamado com os parâmetros corretos
        verify(bibliotecaMock).emprestarLivro(livro, usuario);

    }

    // Teste para verificar se o livro não é emprestado quando já está emprestado
    @Test
    void testeEmprestarLivroIndisponivel() {

        Livro livro = new Livro(1, "Harry Potter", "J.K Rowling", false);
        Usuario usuario = new Usuario(1, "João");
        // Simulando o comportamento do método getLivroPorId
        when(bibliotecaMock.getLivroPorId(1)).thenReturn(livro);
        // Tentando emprestar um livro que já está emprestado
        service.emprestarLivro(1, usuario);
        // Verificando se o livro ainda está indisponível
        assertFalse(livro.isDisponivel(), "O livro deve continuar indisponível após tentativa de empréstimo."); 
        verify(bibliotecaMock).emprestarLivro(livro, usuario);
    }


    // Teste para verificar se o livro é devolvido corretamente
    @Test
    void testDevolverLivro() {
        Livro livro = new Livro(1, "1984", "Orwell", true);
        // Simulando o comportamento do método getLivroPorId
        when(bibliotecaMock.getLivroPorId(1)).thenReturn(livro);
        //devolvendo o livro
        service.devolverLivro(1);
        // Verificando se o livro foi devolvido corretamente
        assertTrue(livro.isDisponivel());
        // Verificando se o método devolverLivro foi chamado com os parâmetros corretos
        verify(bibliotecaMock).devolverLivro(livro);
    }
}
