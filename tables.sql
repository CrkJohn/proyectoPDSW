CREATE TABLE TypeUser (
   id int  NOT NULL,
   type_user varchar(40)  NOT NULL,
   CONSTRAINT TypeUser_uk UNIQUE (type_user) NOT DEFERRABLE  INITIALLY IMMEDIATE,
   CONSTRAINT TypeUser_pk PRIMARY KEY (id)
);

CREATE TABLE "User" (
   id int  NOT NULL,
   name varchar(50)  NOT NULL,
   email varchar(100)  NOT NULL,
   TypeUser_id varchar(40)  NOT NULL,
   CONSTRAINT email UNIQUE (email) NOT DEFERRABLE  INITIALLY IMMEDIATE,
   CONSTRAINT User_pk PRIMARY KEY (id)
);

CREATE TABLE Comment (
   id int  NOT NULL,
   comment varchar(200)  NOT NULL,
   User_id int  NOT NULL,
   Initiative_id int  NOT NULL,
   CONSTRAINT Comment_pk PRIMARY KEY (id)
);

CREATE TABLE vote (
   User_id int  NOT NULL,
   Initiative_id int  NOT NULL,
   CONSTRAINT vote_pk PRIMARY KEY (User_id,Initiative_id)
);

CREATE TABLE Initiative (
   id int  NOT NULL,
   description varchar(150)  NOT NULL,
   key_words varchar(100)  NOT NULL,
   area varchar(100)  NOT NULL,
   num_votos int  NOT NULL,
   creation_date date  NOT NULL,
   User_id int  NOT NULL,
   modify_date int  NOT NULL,
   Type_Status_id varchar(50)  NOT NULL,
   CONSTRAINT Initiative_pk PRIMARY KEY (id)
);

CREATE TABLE Type_Status (
   id int  NOT NULL,
   status varchar(50)  NOT NULL,
   CONSTRAINT Type_Status_uk UNIQUE (status) NOT DEFERRABLE  INITIALLY IMMEDIATE,
   CONSTRAINT Type_Status_pk PRIMARY KEY (id)
);

--Foreing Key

ALTER TABLE Initiative ADD CONSTRAINT Initiative_Type_Status
   FOREIGN KEY (Type_Status_id)
   REFERENCES Type_Status (status)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;

ALTER TABLE Comment ADD CONSTRAINT Comment_Initiative
   FOREIGN KEY (Initiative_id)
   REFERENCES Initiative (id)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;

ALTER TABLE vote ADD CONSTRAINT vote_Initiative
   FOREIGN KEY (Initiative_id)
   REFERENCES Initiative (id)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;

ALTER TABLE Initiative ADD CONSTRAINT Initiative_User
   FOREIGN KEY (User_id)
   REFERENCES "User" (id)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;

ALTER TABLE vote ADD CONSTRAINT vote_User
   FOREIGN KEY (User_id)
   REFERENCES "User" (id)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;

ALTER TABLE Comment ADD CONSTRAINT Comment_User
   FOREIGN KEY (User_id)
   REFERENCES "User" (id)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;

ALTER TABLE "User" ADD CONSTRAINT User_TypeUser
   FOREIGN KEY (TypeUser_id)
   REFERENCES TypeUser (type_user)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;
--Insert
INSERT into "typeuser" values (1,'Administrador');
INSERT into "typeuser" values (2,'Personal');
INSERT into "typeuser" values (3,'Proponente');
INSERT into "typeuser" values (4,'Publico');

insert into "User" values (2133,'Ana','anamariarincon1299@gmail.com','Administrador');
insert into "User" values (2143,'Santiago','santiagorocha@gmail.com','Proponente');

