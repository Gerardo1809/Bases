INSERT INTO users (id,enabled,password,username) 
VALUES(1,0,'$2a$04$mTuPl3eFUbARUcYcVyGPVuNCBPdG4W4bf5fgQPbTqr6q3NTC6asXq','admin');

INSERT INTO users (id,enabled,password,username) 
VALUES(2,0,'$2a$04$mTuPl3eFUbARUcYcVyGPVuNCBPdG4W4bf5fgQPbTqr6q3NTC6asXq','user');


INSERT INTO authority (id,authority) VALUES (1,'ROLE_ADMIN');
INSERT INTO authority (id,authority) VALUES (2,'ROLE_USER');
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (1,1);
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (1,2);
INSERT INTO authorities_users (usuario_id, authority_id) VALUES (2,2);

--select * from authorities_users;
--select * from users;
--select * from authorities;