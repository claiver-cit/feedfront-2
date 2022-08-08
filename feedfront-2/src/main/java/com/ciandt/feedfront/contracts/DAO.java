package com.ciandt.feedfront.contracts;

import com.ciandt.feedfront.excecoes.EntidadeNaoSerializavelException;
import com.ciandt.feedfront.models.Employee;
import com.ciandt.feedfront.models.Feedback;

import java.io.IOException;
import java.util.List;

public interface DAO<E> {
    boolean tipoImplementaSerializable();

    List<E> listar() throws IOException, EntidadeNaoSerializavelException;

    E buscar(String id) throws IOException, EntidadeNaoSerializavelException;

    E salvar(E e) throws IOException, EntidadeNaoSerializavelException;

    boolean apagar(String id) throws IOException, EntidadeNaoSerializavelException;

}