CREATE TABLE "User" (
   id int  NOT NULL,
   name varchar(20)  NOT NULL,
   Tuser varchar(20)  NOT NULL,
   email varchar(20)  NOT NULL,
   CONSTRAINT email UNIQUE (email) NOT DEFERRABLE  INITIALLY IMMEDIATE,
   CONSTRAINT User_pk PRIMARY KEY (id)
);

CREATE TABLE "Initiative" (
   id int  NOT NULL,
   description varchar(20)  NOT NULL,
   key_words varchar(100)  NOT NULL,
   Tstatus char(1)  NOT NULL,
   area varchar(20)  NOT NULL,
   num_votos int  NOT NULL,
   start_date date  NOT NULL,
   User_id int  NOT NULL,
   CONSTRAINT Initiative_pk PRIMARY KEY (id)
);

CREATE TABLE "Comment" (
   id int  NOT NULL,
   comment varchar(200)  NOT NULL,
   User_id int  NOT NULL,
   Initiative_id int  NOT NULL,
   CONSTRAINT Comment_pk PRIMARY KEY (id)
);

CREATE TABLE "vote" (
   User_id int  NOT NULL,
   Initiative_id int  NOT NULL,
   CONSTRAINT vote_pk PRIMARY KEY (User_id,Initiative_id)
);

--- FOREIGN KEYS

ALTER TABLE Comment ADD CONSTRAINT Comment_User
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

ALTER TABLE Initiative ADD CONSTRAINT Initiative_User
   FOREIGN KEY (User_id)
   REFERENCES "User" (id)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;

ALTER TABLE vote ADD CONSTRAINT vote_Initiative
   FOREIGN KEY (Initiative_id)
   REFERENCES Initiative (id)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;

ALTER TABLE Comment ADD CONSTRAINT Comment_Initiative
   FOREIGN KEY (Initiative_id)
   REFERENCES Initiative (id)  
   NOT DEFERRABLE 
   INITIALLY IMMEDIATE
;

