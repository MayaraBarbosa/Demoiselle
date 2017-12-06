--Alysson Lopes Cordeiro - 1694120
--pais
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (1,'Brasil','BRA');
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (2,'Estados Unidos','EUA');
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (3,'Rússia','RUS');
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (4,'Canadá','CAN');
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (5,'Alemanha','ALE');
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (6,'China','CHI');
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (7,'Índia','IND');
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (8,'Japão','JAP');
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (9,'Inglaterra','ING');
INSERT INTO public.pais(idpais, nome, abreviatura) VALUES (10,'França','FRA');


--fabricante
INSERT INTO public.fabricante(idfabricante, nome) VALUES (1,'Boeing');
INSERT INTO public.fabricante(idfabricante, nome) VALUES (2,'Airbus');
INSERT INTO public.fabricante(idfabricante, nome) VALUES (3,'Bombardier');
INSERT INTO public.fabricante(idfabricante, nome) VALUES (4,'Embraer');
INSERT INTO public.fabricante(idfabricante, nome) VALUES (5,'CESSNA');
INSERT INTO public.fabricante(idfabricante, nome) VALUES (6,'Outro');

--aeronave
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (1, 'A320', '2017-02-02', 2, 300, 2014);
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (2, 'A319', '2017-02-03', 2, 300, 2014);
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (3, 'A321', '2017-02-04', 2, 300, 2014);
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (4, 'A318', '2017-02-05', 2, 300, 2014);
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (5, 'B-17', '2017-02-06', 1, 10, 1941);
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (6, 'B-17', '2017-02-07', 1, 10, 1941);
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (7, 'B-17', '2017-02-08', 1, 10, 1941);
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (8, 'Embraer 195', '2017-02-09', 4, 124, 2002);
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (9, 'Embraer 195', '2017-03-02', 4, 124, 2004);
INSERT INTO public.aeronave(id,modelo,tempo_de_voo,idfabricante,qtdeassentos,ano) VALUES (10, 'Embraer 195', '2017-04-02', 4, 124, 2005);

--select * from public.aeronave

--assento
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (1,'A101', 1, 2, 10, 1, 1);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (2,'A102', 1, 2, 9, 1, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (3,'A103', 2, 5, 8, 1, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (4,'A104', 2, 2, 7, 1, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (5,'A105', 2, 2, 6, 1, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (6,'A106', 2, 2, 10, 0, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (7,'A107', 1, 2, 10, 0, 1);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (8,'A108', 1, 2, 1, 0, 1);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (9,'A109', 1, 2, 2, 0, 1);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (10,'B101', 1, 2, 3, 1, 1);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (11,'B102', 1, 2, 4, 1, 1);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (12,'B103', 1, 2, 5, 0, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (13,'B104', 1, 2, 5, 0, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (14,'B105', 1, 2, 5, 1, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (15,'C103', 2, 2, 10, 1, 1);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (16,'C104', 2, 2, 6, 1, 1);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (17,'C111', 1, 2, 6, 1, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (18,'C164', 1, 2, 7, 1, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (19,'C109', 1, 2, 8, 1, 0);
INSERT INTO public.assento(id,codigo,fileira,coluna,idaeronave,corredor,janela) VALUES (20,'C110', 1, 2, 8, 1, 1);

--SELECT * FROM public.assento

--aeroporto
INSERT INTO public.aeroporto(idaeroporto, nome, sigla, latitude, longitude) VALUES (1, 'Aeroporto Internacional de Congonhas', 'CONG', -23.6273, -46.6566);
INSERT INTO public.aeroporto(idaeroporto, nome, sigla, latitude, longitude) VALUES (2, 'Aeroporto Internacional Tom Jobim', 'TJOB', -22.8134, -43.2494);
INSERT INTO public.aeroporto(idaeroporto, nome, sigla, latitude, longitude) VALUES (3, 'Aeroporto Internacional de Viracopos-Campinas', 'VCPS', -23.0082, -47.1376);

--select * from public.aeroporto

--pacotepromocional
INSERT INTO public.pacotepromocional(idpacote, preco, descricao) VALUES (1, 500.00, 'Pacote promocional de Natal');
INSERT INTO public.pacotepromocional(idpacote, preco, descricao) VALUES (2, 400.00, 'Pacote promocional de Ano Novo');
INSERT INTO public.pacotepromocional(idpacote, preco, descricao) VALUES (3, 300.00, 'Pacote promocional de Páscoa');
INSERT INTO public.pacotepromocional(idpacote, preco, descricao) VALUES (4, 200.00, 'Pacote promocional de Milhagem');
INSERT INTO public.pacotepromocional(idpacote, preco, descricao) VALUES (5, 100.00, 'Pacote promocional de Carnaval');

--select * from public.pacotepromocional

--promocao
INSERT INTO public.promocao(idpromocao, data, valor) VALUES (1, '2017-01-01', 350.00);
INSERT INTO public.promocao(idpromocao, data, valor) VALUES (2, '2017-07-01', 250.00);
INSERT INTO public.promocao(idpromocao, data, valor) VALUES (3, '2017-12-01', 550.00);

--select * from public.promocao

--rota
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (1, 2, 1, '2017-09-28 01:00', '2017-09-28 03:00', 10, 2.00,1);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (2, 2, 3, '2017-07-28 02:00', '2017-07-28 04:00', 10, 2.00,1);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (3, 2, 1, '2017-06-28 03:00', '2017-06-28 04:00', 20, 1.00,1);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (4, 2, 3, '2017-05-28 04:00', '2017-05-28 05:00', 20, 1.00,1);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (5, 3, 1, '2017-04-28 05:00', '2017-04-28 06:00', 20, 1.00,2);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (6, 3, 1, '2017-03-28 01:00', '2017-03-28 02:00', 30, 1.00,2);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (7, 1, 2, '2017-02-28 02:00', '2017-02-28 03:00', 30, 1.00,2);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (8, 1, 2, '2017-01-28 03:00', '2017-01-28 08:00', 40, 5.00,2);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (9, 1, 2, '2017-09-28 06:00', '2017-09-28 09:00', 10, 3.00,2);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (10, 1, 2, '2017-09-27 08:00', '2017-09-27 10:00', 10, 2.00,3);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (11, 1, 3, '2017-09-26 11:00', '2017-09-26 12:00', 10, 1.00,3);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (12, 1, 3, '2017-09-25 12:00', '2017-09-25 14:00', 30, 2.00,3);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (13, 3, 1, '2017-09-24 14:00', '2017-09-24 15:00', 40, 1.00,3);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (14, 3, 1, '2017-09-23 01:00', '2017-09-23 03:00', 40, 2.00,3);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (15, 3, 2, '2017-09-22 02:00', '2017-09-22 04:00', 50, 2.00,3);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (16, 2, 3, '2017-09-21 03:00', '2017-09-21 06:00', 60, 3.00,1);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (17, 2, 3, '2017-09-20 17:00', '2017-09-20 19:00', 80, 2.00,1);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (18, 2, 1, '2017-09-19 18:00', '2017-09-19 21:00', 90, 3.00,1);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (19, 1, 2, '2017-09-18 19:00', '2017-09-18 22:00', 90, 3.00,1);
INSERT INTO public.rota(idrota, aeroportoorigem, aeroportodestino, datahora_partida, datahora_chegada, frequencia, duracao_voo, idpromocao) VALUES (20, 3, 1, '2017-09-17 23:00', '2017-09-17 23:50', 10, 1.50,1);

--select * from public.rota

--estado
INSERT INTO public.estado(idestado, nome, uf, id_pais) VALUES (1, 'São Paulo', 'SP', 1);
INSERT INTO public.estado(idestado, nome, uf, id_pais) VALUES (2, 'Rio de Janeiro', 'RJ', 1);

--select * from public.estado

--cidade
INSERT INTO public.cidade(idcidade, idestado, nome) VALUES (1, 1, 'Campinas');
INSERT INTO public.cidade(idcidade, idestado, nome) VALUES (2, 1, 'São Paulo');
INSERT INTO public.cidade(idcidade, idestado, nome) VALUES (3, 2, 'Rio de Janeiro');

--select * from public.cidade

--tipologradouro
INSERT INTO public.tipologradouro(idtipologradouro, nome) VALUES (1, 'Logradouro Público');
INSERT INTO public.tipologradouro(idtipologradouro, nome) VALUES (2, 'Logradouro Privado');

--logradouro
INSERT INTO public.logradouro(idlogradouro, cep, nome, idcidade, idtipologradouro) VALUES (1, '01310-100', 'Aeroporto', 1, 1);
INSERT INTO public.logradouro(idlogradouro, cep, nome, idcidade, idtipologradouro) VALUES (2, '05743-150', 'Aeroporto', 2, 1);
INSERT INTO public.logradouro(idlogradouro, cep, nome, idcidade, idtipologradouro) VALUES (3, '22041-080', 'Aeroporto', 3, 2);

--retina
INSERT INTO public.retina(idretina, pontos) VALUES (1, 111);
INSERT INTO public.retina(idretina, pontos) VALUES (2, 112);
INSERT INTO public.retina(idretina, pontos) VALUES (3, 113);
INSERT INTO public.retina(idretina, pontos) VALUES (4, 114);
INSERT INTO public.retina(idretina, pontos) VALUES (5, 115);

--banner
INSERT INTO public.banner(idbanner, descricao, nomeimagem, ativo) VALUES (1, 'Banner referente ao aniversário da companhia Deimoiselle','Banner de aniversário',true);
INSERT INTO public.banner(idbanner, descricao, nomeimagem, ativo) VALUES (2, 'Banner referente ao programa de milhagem','Banner de milhagem',true);
INSERT INTO public.banner(idbanner, descricao, nomeimagem, ativo) VALUES (3, 'Banner comemorando o dia do aviador','Banner do dia do aviador',true);

--role
INSERT INTO public.role(idrole, nome, descricao) VALUES (1, 'Comissário de bordo', 'Role relacionada ao comissário de bordo');
INSERT INTO public.role(idrole, nome, descricao) VALUES (2, 'Aeromoça', 'Role relacionada a aeromoça');
INSERT INTO public.role(idrole, nome, descricao) VALUES (3, 'Piloto', 'Role relacionada ao piloto');
INSERT INTO public.role(idrole, nome, descricao) VALUES (4, 'Copiloto', 'Role relacionada ao copiloto');
INSERT INTO public.role(idrole, nome, descricao) VALUES (5, 'Passageiro', 'Role lacionada ao passageiro');

--usuario
INSERT INTO public.usuario(idusuario, idrole, nome, senha, datanascimento) VALUES (1,1,'José Firmino','a123456','1970-02-03');
INSERT INTO public.usuario(idusuario, idrole, nome, senha, datanascimento) VALUES (2,1,'João Victor','b1234567','1980-01-01');
INSERT INTO public.usuario(idusuario, idrole, nome, senha, datanascimento) VALUES (3,2,'Edson Ferreira','adsdassad','1998-02-02');
INSERT INTO public.usuario(idusuario, idrole, nome, senha, datanascimento) VALUES (4,3,'João da Silva','adasasd','1960-02-02');
INSERT INTO public.usuario(idusuario, idrole, nome, senha, datanascimento) VALUES (5,4,'Darth Silveira','deted','1958-02-02');
INSERT INTO public.usuario(idusuario, idrole, nome, senha, datanascimento) VALUES (6,5,'Wesley Minguado','fdtre23','1998-02-02');
INSERT INTO public.usuario(idusuario, idrole, nome, senha, datanascimento) VALUES (7,1,'Trajano Lopes','fredge','1998-02-02');
INSERT INTO public.usuario(idusuario, idrole, nome, senha, datanascimento, email) VALUES (8,1,'admin','8C6976E5B5410415BDE908BD4DEE15DFB167A9C873FC4BB8A81F6F2AB448A918','1998-02-02', 'admin');

--cartaocredito
INSERT INTO public.cartaocredito(idcartao, numero, validade) VALUES (1,12323,'2020-02-02');
INSERT INTO public.cartaocredito(idcartao, numero, validade) VALUES (2,23324,'2022-03-03');
INSERT INTO public.cartaocredito(idcartao, numero, validade) VALUES (3,33444,'2024-04-04');
INSERT INTO public.cartaocredito(idcartao, numero, validade) VALUES (4,43344,'2025-06-07');

--chat_r23
INSERT INTO public.chat_r23(idchat, data, hora, conteudo) VALUES (1,'2017-01-01 ','2017-01-01 01:00','Foi discutido problemas sobre o agendamento de viagem');
INSERT INTO public.chat_r23(idchat, data, hora, conteudo) VALUES (2,'2017-02-01 ','2017-01-01 05:00','Foi discutido problemas sobre o agendamento de viagem');
INSERT INTO public.chat_r23(idchat, data, hora, conteudo) VALUES (3,'2017-03-01 ','2017-01-01 04:00','Foi discutido problemas sobre o agendamento de viagem');

--cliente
INSERT INTO public.cliente(idcliente,cpf,rg,passaporte,nome,endereco,datanascimento,email,password,milhagem,datacoleta,idretina,idrole) VALUES (1,09999965444, 134325443, 3434343, 'José da Silva Pender', 'Av. Joaquim Barbosa, 103, Centro', '1960-02-20', 'jojo@gmailcom', 'a12345', 990.00,'2017-08-09',1,5);
INSERT INTO public.cliente(idcliente,cpf,rg,passaporte,nome,endereco,datanascimento,email,password,milhagem,datacoleta,idretina,idrole) VALUES (2,09999965444, 138325443, 3434342, 'João da Silva Pender', 'Av. Joaquim Barbosa, 103, Centro', '1980-02-20', 'jojo2@gmailcom', 'a12345', 990.00,'2017-08-09',1,5);
INSERT INTO public.cliente(idcliente,cpf,rg,passaporte,nome,endereco,datanascimento,email,password,milhagem,datacoleta,idretina,idrole) VALUES (3,09999965444, 136325443, 3434341, 'Joaquim Ferreira', 'Av. Joao Paulo, 109, Baixada', '1966-02-10', 'ferreira@gmailcom', 'a12345', 990.00,'2017-08-07',1,5);
INSERT INTO public.cliente(idcliente,cpf,rg,passaporte,nome,endereco,datanascimento,email,password,milhagem,datacoleta,idretina,idrole) VALUES (4,09994467444, 135325443, 3434347, 'José Utah', 'Av. Joaquim Ferreira, 103, Centro', '1970-02-20', 'utah@gmailcom', 'a12345', 990.00,'2017-08-06',1,5);

--logchat_r23
INSERT INTO public.logchat_r23(idchat, idcliente, idfuncionario, data, hora) VALUES (1, 2, 1, '2017-01-01 01:30', '2017-01-01 01:30');
INSERT INTO public.logchat_r23(idchat, idcliente, idfuncionario, data, hora) VALUES (2, 2, 1, '2017-01-01 01:30', '2017-01-01 01:30');
INSERT INTO public.logchat_r23(idchat, idcliente, idfuncionario, data, hora) VALUES (3, 2, 1, '2017-01-01 01:30', '2017-01-01 01:30');

--enderecos
INSERT INTO public.enderecos(idendereco, idcliente, cep, numero, observacoes) VALUES (1, 1, '097838-000', 123, 'Cliente mora no apartamento 22');
INSERT INTO public.enderecos(idendereco, idcliente, cep, numero, observacoes) VALUES (2, 2, '097668-000', 183, 'Cliente mora no apartamento 89');
INSERT INTO public.enderecos(idendereco, idcliente, cep, numero, observacoes) VALUES (3, 3, '097838-000', 922, 'Cliente mora no apartamento 20');

--alimento e cardapio
ALTER TABLE public.cardapio ALTER COLUMN id_alimento DROP NOT NULL;
ALTER TABLE public.alimento ALTER COLUMN idcardapio DROP NOT NULL;

INSERT INTO public.alimento VALUES(1, null, 'Batata');
INSERT INTO public.alimento VALUES(2, null, 'Carne');
INSERT INTO public.alimento VALUES(3, null, 'Frango');
INSERT INTO public.alimento VALUES(4, null, 'Peixe');

INSERT INTO public.cardapio VALUES(1,1);
INSERT INTO public.cardapio VALUES(2,2);
INSERT INTO public.cardapio VALUES(3,3);

--voo
ALTER TABLE public.voo ALTER COLUMN idpassagem DROP NOT NULL;

INSERT INTO public.voo(idvoo,idrota,observacao,idaeronave,idpassagem,datahoraembarque) VALUES (1,1,'Nenhuma',1,null,'2017-08-09');
INSERT INTO public.voo(idvoo,idrota,observacao,idaeronave,idpassagem,datahoraembarque) VALUES (2,1,'Nenhuma',1,null,'2017-08-09');
INSERT INTO public.voo(idvoo,idrota,observacao,idaeronave,idpassagem,datahoraembarque) VALUES (3,1,'Nenhuma',1,null,'2017-04-09');
INSERT INTO public.voo(idvoo,idrota,observacao,idaeronave,idpassagem,datahoraembarque) VALUES (4,2,'Nenhuma',3,null,'2017-05-09');
INSERT INTO public.voo(idvoo,idrota,observacao,idaeronave,idpassagem,datahoraembarque) VALUES (5,2,'Nenhuma',3,null,'2017-06-09');
INSERT INTO public.voo(idvoo,idrota,observacao,idaeronave,idpassagem,datahoraembarque) VALUES (6,2,'Nenhuma',3,null,'2017-07-09');

--boleto
ALTER TABLE public.boleto ALTER COLUMN idpagamento DROP NOT NULL;
INSERT INTO public.boleto(idboleto,idpagamento,idcliente,codbarras,codbanco,vencimento,valor,nossonumero,carteira,datadocumento) VALUES (1,null,1,1111111,111,'2017-05-05',980.00,10,10,'2017-04-04');
INSERT INTO public.boleto(idboleto,idpagamento,idcliente,codbarras,codbanco,vencimento,valor,nossonumero,carteira,datadocumento) VALUES (2,null,1,3111111,111,'2017-05-05',980.00,10,10,'2017-04-04');
INSERT INTO public.boleto(idboleto,idpagamento,idcliente,codbarras,codbanco,vencimento,valor,nossonumero,carteira,datadocumento) VALUES (3,null,1,2111111,111,'2017-05-05',980.00,10,10,'2017-04-04');


--pagamento
ALTER TABLE public.pagamento ALTER COLUMN idboleto DROP NOT NULL;
INSERT INTO public.pagamento(idpagamento, idformapagamento, idcliente, data, hora, idboleto, idcartao) VALUES (1,1,1,'2017-08-08','2017-08-02 11:00',1,1);

--venda
ALTER TABLE public.venda ALTER COLUMN idpagamento DROP NOT NULL;
INSERT INTO public.venda(datahora, idvenda, idcliente, valor, idusuario, idpagamento) VALUES ('2017-08-07', 1, 1, 1000.90, 1, 1);
INSERT INTO public.venda(datahora, idvenda, idcliente, valor, idusuario, idpagamento) VALUES ('2017-08-07', 2, 1, 1000.90, 1, 1);
INSERT INTO public.venda(datahora, idvenda, idcliente, valor, idusuario, idpagamento) VALUES ('2017-08-07', 3, 1, 1000.90, 1, 1);

--passagem
INSERT INTO public.passagem(idvenda, idpassagem, idvoo,qtdepassageiros) VALUES (1,1,1,200);
INSERT INTO public.passagem(idvenda, idpassagem, idvoo,qtdepassageiros) VALUES (1,2,1,200);
INSERT INTO public.passagem(idvenda, idpassagem, idvoo,qtdepassageiros) VALUES (1,3,1,200);

--agendafretamento_r25
INSERT INTO public.agendafretamento_r25(idagenda, antecipado, diasolicitacao, idsolicitante) VALUES (1, null, '2017-08-09',1);

--bagagem
INSERT INTO public.bagagem VALUES (1, 1, 1, 1, 10, 1111111, 'Campinas', 250.00);

--atualizacaomala_r13
INSERT INTO public.atualizacaomala_r13(id, fk_id_bagagem, id_aviao, id_voo, peso, data_ent, local_atual, hora_atual, destino_final, fk_codigo_barras) VALUES (1, 1, 1, 1, 10, '2017-08-07', 'Campinas', '2017-08-07 11:00', 'Viracopos', 1); 





