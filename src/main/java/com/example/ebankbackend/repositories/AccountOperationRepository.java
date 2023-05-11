package com.example.ebankbackend.repositories;

import com.example.ebankbackend.entities.BankAccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository  extends JpaRepository<BankAccountOperation,Long> {
}
