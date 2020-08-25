INSERT INTO users VALUES ( 'dbuser', 'userpass', true); 
INSERT INTO users VALUES ( 'dbadmin', 'adminpass', true);

INSERT INTO authorities VALUES ( 'dbuser', 'ROLE_USER');
INSERT INTO authorities VALUES ( 'dbadmin', 'ROLE_ADMIN');