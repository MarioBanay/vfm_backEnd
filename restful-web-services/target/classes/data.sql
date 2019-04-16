insert into todo(id, username,description,target_date,is_done)
values(10001, 'in28minutes', 'Learn JPA', sysdate(), false);

insert into todo(id, username,description,target_date,is_done)
values(10002, 'in28minutes', 'Learn Data JPA', sysdate(), false);

insert into todo(id, username,description,target_date,is_done)
values(10003, 'in28minutes', 'Learn Microservices', sysdate(), false);

insert into driver(id, name, lastName, oib, date_of_birth, address, city, postalCode, email, phone, issued, expires, identity_Card_number, username, password)
values(10001, 'Mario', 'Banay', '21324354654', sysdate(), 'Borčec 66', 'Zagreb', '10090', 'banay.mario@gmail.com','091 3330 655', sysdate(), sysdate(), '123456', 'in28minutes', 'password');
	
insert into driver(id, name, lastName, oib, date_of_birth, address, city, postalCode, email, phone, issued, expires, identity_Card_number, username, password)
values(10002, 'Tanja', 'Banay', '21324354654', sysdate(), 'Borčec 66', 'Zagreb', '10090', 'banay.tanja@gmail.com','091 3330 655', sysdate(), sysdate(), '123456', 'in28minutes', 'password');

insert into driver(id, name, lastName, oib, date_of_birth, address, city, postalCode, email, phone, issued, expires, identity_Card_number, username, password)
values(10003, 'Pero', 'Perić', '75864675474', sysdate(), 'Ilica 34', 'Zagreb', '10000', 'pero.peric@mail.com','091 383 386', sysdate(), sysdate(), '436436', 'in28minutes', 'password');

insert into driver(id, name, lastName, oib, date_of_birth, address, city, postalCode, email, phone, issued, expires, identity_Card_number, username, password)
values(10004, 'Miro', 'Mirić', '21324354654', sysdate(), 'Borčec 66', 'Zagreb', '10090', 'miro.miric@gmail.com','096 346 328', sysdate(), sysdate(), '123456', 'in28minutes', 'password');
	
insert into driver(id, name, lastName, oib, date_of_birth, address, city, postalCode, email, phone, issued, expires, identity_Card_number, username, password)
values(10005, 'Paško', 'Patak', '21324354654', sysdate(), 'Borčec 66', 'Zagreb', '10000', 'patak.pasko@hotmail.com','093 256 674', sysdate(), sysdate(), '123456', 'in28minutes', 'password');

insert into driver(id, name, lastName, oib, date_of_birth, address, city, postalCode, email, phone, issued, expires, identity_Card_number, username, password)
values(10006, 'Mujo', 'Mujic', '75864675474', sysdate(), 'Ilica 34', 'Zagreb', '10000', 'mujo.mujic@mail.com','098 7653 245', sysdate(), sysdate(), '436436', 'in28minutes', 'password');

insert into vehicle(id, length, width, height, kerb_weight, maximum_power_output, maximum_speed, cylinder_capacity, co2, number_of_doors, make, model, type, body_type, type_of_fuel, vin, colour, tyres, registered_keeper, owner, registration_number, date_of_first_registration, date_of_first_registration_in_croatia, valid_through)
values(10007, 4329, 1765, 1421, 1350, 110, 212, 1995, 104, 5, 'Bmw', '118', '1 series', 'hatchback', 'diesel', 'WBA1S5100G5A85638', 'grey', '205/55/16', 'registeredKeeper', 'owner', 'ZG 1234 AA', sysdate(), sysdate(), sysdate());
