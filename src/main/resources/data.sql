INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '12345');

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML 5', 'Front-End');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)VALUES('Dúvida', 'Erro ao criar projeto', '2020-05-25 23:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)VALUES('Dúvida 2', 'Projeto não compila', '2020-05-26 00:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)VALUES('Dúvida 3', 'Tag HTML', '2020-05-25 22:00:00', 'NAO_RESPONDIDO', 1, 2);