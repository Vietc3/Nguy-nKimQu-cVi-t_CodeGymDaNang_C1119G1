package org.ashina.mycontact.service;

import org.ashina.mycontact.entity.Contact;
import org.ashina.mycontact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public List<Contact> findByNameContaining(String term, Pageable pageable) {
        return contactRepository.findByNameContaining(term, pageable);
    }

    @Override
    public List<Contact> findAll(Sort sort) {
        return contactRepository.findAll(sort);
    }

    @Override
    public List<Contact> findAll(Iterable<Integer> integers) {
        return contactRepository.findAll(integers);
    }

    @Override
    public <S extends Contact> List<S> save(Iterable<S> entities) {
        return contactRepository.save(entities);
    }

    @Override
    public void flush() {
        contactRepository.flush();
    }

    @Override
    public <S extends Contact> S saveAndFlush(S entity) {
        return contactRepository.saveAndFlush(entity);
    }

    @Override
    public void deleteInBatch(Iterable<Contact> entities) {
        contactRepository.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch() {
        contactRepository.deleteAllInBatch();
    }

    @Override
    public Contact getOne(Integer integer) {
        return contactRepository.getOne(integer);
    }

    @Override
    public <S extends Contact> List<S> findAll(Example<S> example) {
        return contactRepository.findAll(example);
    }

    @Override
    public <S extends Contact> List<S> findAll(Example<S> example, Sort sort) {
        return contactRepository.findAll(example, sort);
    }

    @Override
    public Page<Contact> findAll(org.springframework.data.domain.Pageable pageable) {
        return contactRepository.findAll(pageable);
    }

    @Override
    public <S extends Contact> S save(S entity) {
        return contactRepository.save(entity);
    }

    @Override
    public boolean exists(Integer integer) {
        return contactRepository.exists(integer);
    }

    @Override
    public long count() {
        return contactRepository.count();
    }

    @Override
    public void delete(Contact entity) {
        contactRepository.delete(entity);
    }

    @Override
    public void delete(Iterable<? extends Contact> entities) {
        contactRepository.delete(entities);
    }

    @Override
    public void deleteAll() {
        contactRepository.deleteAll();
    }

    @Override
    public <S extends Contact> S findOne(Example<S> example) {
        return contactRepository.findOne(example);
    }

    @Override
    public <S extends Contact> Page<S> findAll(Example<S> example, org.springframework.data.domain.Pageable pageable) {
        return contactRepository.findAll(example, pageable);
    }

    @Override
    public <S extends Contact> long count(Example<S> example) {
        return contactRepository.count(example);
    }

    @Override
    public <S extends Contact> boolean exists(Example<S> example) {
        return contactRepository.exists(example);
    }
}
