CREATE DATABASE lojaIFPR;

USE lojaIFPR;

create table Fornecedor(
codFornec int auto_increment primary key,
nome varchar(50) not null,
endereco varchar(20) not null
);
create table Produto(
codPdto int auto_increment primary key,
codFornec int,
descricao varchar(20) unique not null,
preco float not null,
foreign key (codFornec) references Fornecedor(codFornec)
);
create table Cliente(
codCli int auto_increment primary key,
nome varchar(30) not null,
telefone varchar(10)
);
create table Fisica(
codCli int,
cpf varchar(11) unique not null,
foreign key (codCli) references Cliente(codCli)
);
create table Juridica(
codCli int,
cnpj varchar(14) unique not null,
foreign key (codCli) references Cliente(codCli)
);
create table Compra(
codPdto int,
codCli int,
qtd int not null,
dataCompra date not null,
foreign key (codPdto) references Produto(codPdto),
foreign key (codCli) references Cliente(codCli)
);