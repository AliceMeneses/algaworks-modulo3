INSERT INTO COZINHA (NOME) VALUES ('Tailandesa');
INSERT INTO COZINHA (NOME) VALUES ('Indiana');
INSERT INTO COZINHA (NOME) VALUES ('Brasileira');
INSERT INTO COZINHA (NOME) VALUES ('Argentina');

insert into estado (id, nome) values (1, 'Minas Gerais');
insert into estado (id, nome) values (2, 'São Paulo');
insert into estado (id, nome) values (3, 'Ceará');

insert into cidade (id, nome, estado_id) values (1, 'Uberlândia', 1);
insert into cidade (id, nome, estado_id) values (2, 'Belo Horizonte', 1);
insert into cidade (id, nome, estado_id) values (3, 'São Paulo', 2);
insert into cidade (id, nome, estado_id) values (4, 'Campinas', 2);
insert into cidade (id, nome, estado_id) values (5, 'Fortaleza', 3);

insert into forma_pagamento (id, descricao) values (1, 'Cartão de crédito');
insert into forma_pagamento (id, descricao) values (2, 'Cartão de débito');
insert into forma_pagamento (id, descricao) values (3, 'Dinheiro');

INSERT INTO RESTAURANTE (NOME, TAXA_FRETE, COZINHA_ID, FORMA_PAGAMENTO_ID) VALUES ('Thai Gourmet', 10, 1, 1);
INSERT INTO RESTAURANTE (NOME, TAXA_FRETE, COZINHA_ID, FORMA_PAGAMENTO_ID) VALUES ('Thai Delivery', 9.50, 1, 2);
INSERT INTO RESTAURANTE (NOME, TAXA_FRETE, COZINHA_ID, FORMA_PAGAMENTO_ID) VALUES ('Tuk Tuk Comida Indiana', 15, 2, 3);

insert into permissao (id, nome, descricao) values (1, 'CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
insert into permissao (id, nome, descricao) values (2, 'EDITAR_COZINHAS', 'Permite editar cozinhas');
