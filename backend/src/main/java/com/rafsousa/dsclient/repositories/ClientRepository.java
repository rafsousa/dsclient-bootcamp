package com.rafsousa.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rafsousa.dsclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>  {

}
