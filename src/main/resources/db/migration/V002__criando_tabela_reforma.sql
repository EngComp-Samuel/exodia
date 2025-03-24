CREATE TABLE reforma(
	id SERIAL PRIMARY KEY NOT NULL,
	data_registro DATE NOT NULL,
	descricao VARCHAR(200) NOT NULL,
	valor NUMERIC(17,2) NOT NULL,
	total_previsto NUMERIC(17,2) NOT NULL,
	total_gasto NUMERIC(17,2),
	total_gasto_material NUMERIC(17,2),
	total_gasto_mao_de_obra NUMERIC(17,2),
	saldo NUMERIC(17,2),
	id_categoria INTEGER NOT NULL,
	CONSTRAINT fk_id_categoria FOREIGN KEY(id_categoria) REFERENCES categoria(id)

);