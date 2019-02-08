create database project;
use project;

create table cliente(
	CdCliente int not null auto_increment,
    Nome varchar(45),
    Idade int,
    Endereco varchar(150),
    primary key (CdCliente)
);

create table conta (
	numConta int not null auto_increment,
    saldo double,
    cliente int not null,
    primary key (numConta)
);

ALTER TABLE conta add foreign key (cliente) references cliente(CdCliente) on delete restrict on update cascade;