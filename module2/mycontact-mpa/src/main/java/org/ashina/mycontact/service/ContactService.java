package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.Contact;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
import java.util.List;

public interface ContactService {
    List<Contact> findByNameContaining(String term, Pageable pageable);

    List<Contact> findAll(Sort sort);

    List<Contact> findAll(Iterable<Integer> integers);

    <S extends Contact> List<S> save(Iterable<S> entities);

    void flush();

    <S extends Contact> S saveAndFlush(S entity);

    void deleteInBatch(Iterable<Contact> entities);

    void deleteAllInBatch();

    Contact getOne(Integer integer);

    <S extends Contact> List<S> findAll(Example<S> example);

    <S extends Contact> List<S> findAll(Example<S> example, Sort sort);

    Page<Contact> findAll(org.springframework.data.domain.Pageable pageable);

    <S extends Contact> S save(S entity);

    boolean exists(Integer integer);

    long count();

    void delete(Contact entity);

    void delete(Iterable<? extends Contact> entities);

    void deleteAll();

    <S extends Contact> S findOne(Example<S> example);

    <S extends Contact> Page<S> findAll(Example<S> example, org.springframework.data.domain.Pageable pageable);

    <S extends Contact> long count(Example<S> example);

    <S extends Contact> boolean exists(Example<S> example);
//
//    Iterable<Contact> findAll();
//
//    List<Contact> search(String term);
//
//    Contact findOne(Integer id);
//
//    void save(Contact contact);
//
//    void delete(Integer id);

}
