INSERT INTO PRODUTO(nome, preco) VALUES('Alface', '2.0');
INSERT INTO PRODUTO(nome, preco) VALUES('Brocolis', '4.0');
INSERT INTO PRODUTO(nome, preco) VALUES('Couve', '2.0');

INSERT INTO CLIENTE(nome) VALUES('José');
INSERT INTO CLIENTE(nome) VALUES('Amanda');

INSERT INTO PEDIDO(cliente_id) VALUES('1');
INSERT INTO ITEM_PEDIDO(quantidade, pedido_id, produto_id)
VALUES('4', '1', '1');
INSERT INTO ITEM_PEDIDO(quantidade, pedido_id, produto_id)
VALUES('10', '1', '3');

INSERT INTO PEDIDO(cliente_id) VALUES('2');
INSERT INTO ITEM_PEDIDO(quantidade, pedido_id, produto_id)
VALUES('12', '2', '1');
INSERT INTO ITEM_PEDIDO(quantidade, pedido_id, produto_id)
VALUES('3', '2', '2');

