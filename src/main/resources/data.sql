DROP TABLE IF EXISTS book_table;

CREATE TABLE book_table (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) NOT NULL,
  author VARCHAR(250) NOT NULL,
  pages int DEFAULT NULL
);

INSERT INTO book_table (title, author, pages) VALUES
  ('Lalka', 'Prus', 540),
  ('Krzyzacy', 'Sienkiewicz', 750),
  ('Pan Tadeusz', 'Mickiewicz', 610);