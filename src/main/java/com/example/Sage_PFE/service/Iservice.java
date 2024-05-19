package com.example.Sage_PFE.service;

import com.example.Sage_PFE.entity.Myentity;
import com.example.Sage_PFE.repository.IRrepo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Iservice implements IRrepo {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Myentity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Myentity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Myentity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Event.ID> ids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Myentity getOne(Event.ID id) {
        return null;
    }

    @Override
    public Myentity getById(Event.ID id) {
        return null;
    }

    @Override
    public Myentity getReferenceById(Event.ID id) {
        return null;
    }

    @Override
    public <S extends Myentity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Myentity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Myentity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Myentity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Myentity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Myentity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Myentity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Myentity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Myentity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Myentity> findById(Event.ID id) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Event.ID id) {
        return false;
    }

    @Override
    public List<Myentity> findAll() {
        return null;
    }

    @Override
    public List<Myentity> findAllById(Iterable<Event.ID> ids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Event.ID id) {

    }

    @Override
    public void delete(Myentity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Event.ID> ids) {

    }

    @Override
    public void deleteAll(Iterable<? extends Myentity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Myentity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Myentity> findAll(Pageable pageable) {
        return null;
    }
}
