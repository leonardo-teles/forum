INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '$2a$10$Da4uphovDINVTzA08WtU/u3zcQVHnI1e/xmVOwcSmNPeHXr1KgD.m');
INSERT INTO USUARIO(nome, email, senha) VALUES('Moderador', 'moderador@email.com', '$2a$10$Da4uphovDINVTzA08WtU/u3zcQVHnI1e/xmVOwcSmNPeHXr1KgD.m');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ALUNO');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_MODERADOR');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1, 1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(2, 2);

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML 5', 'Front-End');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)VALUES('Dúvida', 'Erro ao criar projeto', '2020-05-25 23:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)VALUES('Dúvida 2', 'Projeto não compila', '2020-05-26 00:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id)VALUES('Dúvida 3', 'Tag HTML', '2020-05-25 22:00:00', 'NAO_RESPONDIDO', 1, 2);