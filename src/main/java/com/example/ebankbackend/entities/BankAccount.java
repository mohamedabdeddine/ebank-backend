package com.example.ebankbackend.entities;

import com.example.ebankbackend.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 4)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
    @Id
    private String id;
    private double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    @ManyToOne
    private Customer customer;
    //relation bidiriectionnelle
    @OneToMany(mappedBy = "bankAccount")
    private List<BankAccountOperation> bankAccountOperations;

}
//mapping heritage:
//single table : en cree une seul table  au niveau de la base de donnees qui s'appelle compte on ajoutant une collone qui s'appelle type (descriminator column) [regroupe les ]
//table per classe :en cree deux table compte epargne et compte courrant
//joined table : en cree trois table compte epargne et compte courrant et compte