CREATE TABLE public.cidade
(
  idcidade integer NOT NULL,
  idestado INTEGER NOT NULL,
  nome character varying(40),
  CONSTRAINT pk_cid PRIMARY KEY (idcidade)
);

CREATE TABLE public.role
(
  idrole integer NOT NULL,
  nome character varying(30),
  descricao character varying(80),
  CONSTRAINT pk_role PRIMARY KEY (idrole)
);

--João Victor Rodrigues Alves RA:1693050
--Tentei seguir ao máximo o diagrama

CREATE TABLE public.voo
(
  idvoo INTEGER NOT NULL,
  idrota INTEGER NOT NULL,
  observacao CHARACTER varying(200),
  idaeronave INTEGER NOT NULL,
  idpassagem INTEGER NOT NULL,
  datahoraembarque DATE,
  CONSTRAINT pk_voo PRIMARY KEY (idvoo)
);

CREATE TABLE public.rota
(
  idrota INTEGER NOT NULL,
  aeroportoorigem INTEGER NOT NULL,
  aeroportodestino INTEGER NOT NULL,
  datahora_partida DATE,
  datahora_chegada DATE,
  frequencia DECIMAL,
  duracao_voo DECIMAL,
  idPromocao INTEGER NOT NULL,
  CONSTRAINT pk_rota PRIMARY KEY (idrota)
);

CREATE TABLE public.promocao
(
  idpromocao INTEGER NOT NULL,
  data DATE,
  valor DECIMAL,
  CONSTRAINT pk_promocao PRIMARY KEY (idpromocao)
);

CREATE TABLE public.aeroporto
(
  idaeroporto INTEGER NOT NULL,
  nome CHARACTER varying(50),
  sigla CHARACTER varying(10),
  latitude DECIMAL,
  longitude DECIMAL,
  CONSTRAINT pk_aeroporto PRIMARY KEY (idaeroporto)
);

CREATE TABLE public.pacotePromocional
(
  idpacote INTEGER NOT NULL,
  preco DECIMAL,
  descricao CHARACTER varying(200),
  CONSTRAINT pk_pacotePromocional PRIMARY KEY (idpacote)
);

CREATE TABLE public.aeronave
(
  id INTEGER NOT NULL,
  modelo CHARACTER varying(50),
  tempo_de_voo DATE,
  idfabricante INTEGER NOT NULL,
  qtdeassentos INTEGER,
  ano INTEGER,
  CONSTRAINT pk_aeronave PRIMARY KEY (id)
);

CREATE TABLE public.fabricante
(
  idfabricante INTEGER NOT NULL,
  nome CHARACTER varying(50),
  CONSTRAINT pk_fabricante PRIMARY KEY (idfabricante)
);

CREATE TABLE public.assento
(
  id INTEGER NOT NULL,
  codigo CHARACTER varying(10),
  fileira INTEGER,
  coluna INTEGER,
  idaeronave INTEGER NOT NULL,
  corredor INTEGER,
  janela INTEGER,
  CONSTRAINT pk_assento PRIMARY KEY (id)
);

CREATE TABLE public.agendaFretamento_R25
(
  idagenda INTEGER NOT NULL,
  antecipado BIT,
  diasolicitacao DATE,
  idSolicitante INTEGER NOT NULL,
  CONSTRAINT pk_agendaFretamento_R25 PRIMARY KEY (idagenda)
);

CREATE TABLE public.passagem
(
  idvenda INTEGER NOT NULL,
  idpassagem INTEGER NOT NULL,
  idvoo INTEGER NOT NULL,
  qtdepassageiros INTEGER,
  CONSTRAINT pk_passagem PRIMARY KEY (idpassagem)
);

CREATE TABLE public.bagagem
(
  id_bagagem INTEGER NOT NULL,
  id_aviao INTEGER NOT NULL,
  id_voo INTEGER NOT NULL,
  id_cliente INTEGER NOT NULL,
  peso INTEGER,
  codigo_barras CHARACTER varying(20),
  local CHARACTER varying(50),
  valorTotal INTEGER NOT NULL,
  CONSTRAINT pk_bagagem PRIMARY KEY (id_bagagem)
);

CREATE TABLE public.atualizacaomala_R13
(
  id INTEGER NOT NULL,
  fk_id_bagagem INTEGER NOT NULL,
  id_aviao INTEGER NOT NULL,
  id_voo INTEGER NOT NULL,
  peso INTEGER,
  data_ent DATE,
  local_atual CHARACTER varying(20),
  hora_atual DATE,
  destino_final CHARACTER varying(50),
  fk_codigo_barras CHARACTER varying(20),
  CONSTRAINT pk_atualizacaomala_R13 PRIMARY KEY (id)
);

CREATE TABLE public.cardapio
(
  idCardapio INTEGER NOT NULL,
  id_alimento INTEGER NOT NULL,
  CONSTRAINT pk_cardapio PRIMARY KEY (idCardapio)
);

CREATE TABLE public.alimento
(
  id INTEGER NOT NULL,
  idcardapio INTEGER NOT NULL,
  nome CHARACTER varying(20),
  CONSTRAINT pk_alimento PRIMARY KEY (id)
);


CREATE TABLE public.venda
(
  datahora DATE,
  idvenda INTEGER NOT NULL,
  idcliente INTEGER NOT NULL,
  valor DECIMAL,
  idusuario INTEGER NOT NULL,
  idpagamento INTEGER NOT NULL,
  CONSTRAINT pk_venda PRIMARY KEY (idvenda)
);

CREATE TABLE public.pagamento
(
  idpagamento INTEGER NOT NULL,
  idformapagamento INTEGER,
  idcliente INTEGER NOT NULL,
  data DATE,
  hora DATE,
  idboleto INTEGER,
  idcartao INTEGER,
  CONSTRAINT pk_pagamento PRIMARY KEY (idpagamento)
);

CREATE TABLE public.boleto
(
  idboleto INTEGER NOT NULL,
  idpagamento INTEGER,
  idcliente INTEGER NOT NULL,
  codbarras CHARACTER varying(20),
  codbanco CHARACTER varying(20),
  vencimento DATE,
  valor DECIMAL,
  nossonumero INTEGER,
  carteira CHARACTER varying(20),
  datadocumento DATE,
  CONSTRAINT pk_boleto PRIMARY KEY (idboleto)
);

CREATE TABLE public.cartaocredito
(
  idcartao INTEGER NOT NULL,
  numero INTEGER,
  validade DATE,
  CONSTRAINT pk_cartao PRIMARY KEY (idcartao)
);

CREATE TABLE public.usuario
(
  idusuario INTEGER NOT NULL,
  idrole INTEGER NOT NULL,
  nome CHARACTER varying(20),
  senha CHARACTER varying(20),
  datanascimento DATE,
  CONSTRAINT pk_usuario PRIMARY KEY (idusuario)
);

CREATE TABLE public.banner
(
  idbanner SERIAL NOT NULL,
  descricao VARCHAR,
  nomeimagem VARCHAR,
  ativo BOOLEAN,
  CONSTRAINT pk_banner PRIMARY KEY (idbanner)
);

CREATE TABLE public.cliente
(
  idcliente SERIAL NOT NULL,
  cpf CHARACTER varying(20),
  rg CHARACTER varying(20),
  passaporte CHARACTER varying(20),
  nome CHARACTER varying(50),
  endereco CHARACTER varying(50),
  datanascimento DATE,
  email CHARACTER varying(50),
  password CHARACTER varying(80),
  milhagem DECIMAL,
  dataColeta DATE,
  idRetina INTEGER NOT NULL,
  CONSTRAINT pk_cliente PRIMARY KEY (idcliente)
);

CREATE TABLE public.retina
(
  idretina INTEGER NOT NULL,
  pontos INTEGER,
  CONSTRAINT pk_retina PRIMARY KEY (idretina)
);

CREATE TABLE public.chat_R23
(
  idchat INTEGER NOT NULL,
  data DATE,
  hora DATE,
  conteudo CHAR varying(200),
  CONSTRAINT pk_chat PRIMARY KEY (idchat)
);

CREATE TABLE public.logchat_R23
(
  idchat INTEGER NOT NULL,
  idcliente INTEGER NOT NULL,
  idfuncionario INTEGER,
  data DATE,
  hora DATE,
  CONSTRAINT pk_logchat PRIMARY KEY (idchat)
);

CREATE TABLE public.enderecos
(
  idendereco INTEGER NOT NULL,
  idcliente INTEGER NOT NULL,
  CEP CHARACTER varying(10),
  numero INTEGER,
  observacoes CHARACTER varying(200),
  CONSTRAINT pk_enderecos PRIMARY KEY (idendereco)
);

CREATE TABLE public.logradouro
(
  idlogradouro INTEGER NOT NULL,
  CEP CHARACTER varying(10),
  nome CHARACTER varying(20),
  idcidade INTEGER NOT NULL,
  idtipologradouro INTEGER NOT NULL,
  CONSTRAINT pk_logradouro PRIMARY KEY (idlogradouro)
);

CREATE TABLE public.tipologradouro
(
  idtipologradouro INTEGER NOT NULL,
  nome CHARACTER varying(20),
  CONSTRAINT pk_tipologradouro PRIMARY KEY (idtipologradouro)
);

CREATE TABLE public.estado
(
  idestado INTEGER NOT NULL,
  nome CHARACTER varying(20),
  uf CHARACTER varying(2),
  id_pais INTEGER NOT NULL,
  CONSTRAINT pk_estado PRIMARY KEY (idestado)
);

CREATE TABLE public.pais
(
  idpais INTEGER NOT NULL,
  nome CHARACTER varying(20),
  abreviatura CHARACTER varying(5),
  CONSTRAINT pk_pais PRIMARY KEY (idpais)
);

ALTER TABLE voo ADD CONSTRAINT pf_rotavoo FOREIGN KEY (idrota) REFERENCES rota(idrota);
ALTER TABLE voo ADD CONSTRAINT  pf_aeronavevoo FOREIGN KEY (idaeronave) REFERENCES aeronave(id);
ALTER TABLE voo ADD CONSTRAINT  pf_passagemvoo FOREIGN KEY (idpassagem) REFERENCES passagem(idpassagem);
ALTER TABLE rota ADD CONSTRAINT  pf_aeroportoorigemrota FOREIGN KEY (aeroportoorigem) REFERENCES aeroporto(idaeroporto);
ALTER TABLE rota ADD CONSTRAINT  pf_aeroportodestinorota FOREIGN KEY (aeroportodestino) REFERENCES aeroporto(idaeroporto);
ALTER TABLE rota ADD CONSTRAINT  pf_promocaorota FOREIGN KEY (idPromocao) REFERENCES promocao(idpromocao);
ALTER TABLE aeronave ADD CONSTRAINT  pf_fabricanteaeronave FOREIGN KEY (idfabricante) REFERENCES fabricante(idfabricante);
ALTER TABLE assento ADD CONSTRAINT  pf_aeronaveassentoassento FOREIGN KEY (idaeronave) REFERENCES aeronave(id);
ALTER TABLE agendaFretamento_R25 ADD CONSTRAINT  pf_solicitanteagendaFretamento_R25 FOREIGN KEY (idSolicitante) REFERENCES voo(idvoo);
ALTER TABLE passagem ADD CONSTRAINT  pf_vendapassagem FOREIGN KEY (idvenda) REFERENCES venda(idvenda);
ALTER TABLE passagem ADD CONSTRAINT  pf_voopassagem FOREIGN KEY (idvoo) REFERENCES voo(idvoo);
ALTER TABLE bagagem ADD CONSTRAINT  pf_aviaobagagem FOREIGN KEY (id_aviao) REFERENCES aeronave(id);
ALTER TABLE bagagem ADD CONSTRAINT  pf_voobagagembagagem FOREIGN KEY (id_voo) REFERENCES voo(idvoo);
ALTER TABLE bagagem ADD CONSTRAINT  pf_clientebagagem FOREIGN KEY (id_cliente) REFERENCES cliente(idcliente);
ALTER TABLE atualizacaomala_R13 ADD CONSTRAINT  pf_aviaoatualizacaomala_R13 FOREIGN KEY (id_aviao) REFERENCES aeronave(id);
ALTER TABLE atualizacaomala_R13 ADD CONSTRAINT  pf_vooatualizacaoatualizacaomala_R13 FOREIGN KEY (id_voo) REFERENCES voo(idvoo);
ALTER TABLE atualizacaomala_R13 ADD CONSTRAINT  pf_bagagematualizacaomala_R13 FOREIGN KEY (fk_id_bagagem) REFERENCES bagagem(id_bagagem);
ALTER TABLE cardapio ADD CONSTRAINT  pf_alimentocardapio FOREIGN KEY (id_alimento) REFERENCES alimento(id);
ALTER TABLE alimento ADD CONSTRAINT  pf_cardapioalimento FOREIGN KEY (idcardapio) REFERENCES cardapio(idCardapio);
ALTER TABLE venda ADD CONSTRAINT  pf_clientevendavenda FOREIGN KEY (idcliente) REFERENCES cliente(idcliente);
ALTER TABLE venda ADD CONSTRAINT  pf_usuariovenda FOREIGN KEY (idusuario) REFERENCES usuario(idusuario);
ALTER TABLE venda ADD CONSTRAINT  pf_pagamentovenda FOREIGN KEY (idpagamento) REFERENCES pagamento(idpagamento);
ALTER TABLE pagamento ADD CONSTRAINT  pf_clientepagamento FOREIGN KEY (idcliente) REFERENCES cliente(idcliente);
ALTER TABLE pagamento ADD CONSTRAINT  pf_boletopagamento FOREIGN KEY (idboleto) REFERENCES boleto(idboleto);
ALTER TABLE pagamento ADD CONSTRAINT  pf_cartaopagamento FOREIGN KEY (idcartao) REFERENCES cartaocredito(idcartao);
ALTER TABLE boleto ADD CONSTRAINT  pf_clienteboleto FOREIGN KEY (idcliente) REFERENCES cliente(idcliente);
ALTER TABLE boleto ADD CONSTRAINT  pf_pagamentoboleto FOREIGN KEY (idpagamento) REFERENCES pagamento(idpagamento);
ALTER TABLE usuario ADD CONSTRAINT  pf_roleusuario FOREIGN KEY (idrole) REFERENCES role(idrole);
ALTER TABLE cliente ADD CONSTRAINT  pf_retinacliente FOREIGN KEY (idRetina) REFERENCES retina(idretina);
ALTER TABLE logchat_R23 ADD CONSTRAINT  pf_clientelogchat_R23 FOREIGN KEY (idcliente) REFERENCES cliente(idcliente);
ALTER TABLE enderecos ADD CONSTRAINT  pf_clienteenderecos FOREIGN KEY (idcliente) REFERENCES cliente(idcliente);
ALTER TABLE logradouro ADD CONSTRAINT  pf_cidadelogradouro FOREIGN KEY (idcidade) REFERENCES cidade(idcidade);
ALTER TABLE logradouro ADD CONSTRAINT  pf_tipologradourologradouro FOREIGN KEY (idtipologradouro) REFERENCES tipologradouro(idtipologradouro);
ALTER TABLE cidade ADD CONSTRAINT  pf_estadocidade FOREIGN KEY (idestado) REFERENCES estado(idestado);
ALTER TABLE estado ADD CONSTRAINT  pf_paisestado FOREIGN KEY (id_pais) REFERENCES pais(idpais);
