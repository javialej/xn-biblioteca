insert into usuario (nombre, email) values ("Javier", "javier@server.com");
insert into usuario (nombre, email) values ("Alejandro", "alejandro@server.com");

insert into libro (titulo, autor, disponible) values ("Cien años de Soledad", "Gabriel Garcia Marquez", false);
insert into libro (titulo, autor, disponible) values ("Viaje al centro de la tierra", "Julio Verne", false);
insert into libro (titulo, autor, disponible) values ("Microservices SOA", "Mike Gram", true);

insert into prestamo (id_texto, id_persona) values (1,2);
insert into prestamo (id_texto, id_persona) values (2,1);

select * from prestamo where id_persona = 1;

