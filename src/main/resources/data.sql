/* Dados para fazer testes no banco de dados  */

INSERT INTO restaurante (id, cep, complemento, nome) VALUES
(1L, '7300001', 'Complemento Endereco Restaurante 1', 'Restaurante 1'),
(2L, '7300002', 'Complemento Endereco Restaurante 2', 'Restaurante 2');

INSERT INTO cliente (id, cep, complemento, nome) VALUES
(1L, '7300001', 'Complemento Endereco Cliente 1', 'Cliente 1');

INSERT INTO produto (id, disponivel, nome, valor_unitario, restaurante_id) VALUES
(1L, true, 'Produto 1', 5.0, 1L),
(2L, true, 'Produto 2', 6.0, 1L),
(3L, true, 'Produto 3', 7.0, 2L);

INSERT INTO sacola (id, forma_pagamento, fechada, valor_total, cliente_id) VALUES
(1l, 0, false, 0.0, 1L);