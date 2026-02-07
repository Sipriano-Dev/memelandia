-- =========================
-- USUARIOS
-- =========================
INSERT INTO usuario (id, nome, email, data_cadastro) VALUES
(1, 'João Silva', 'joao@memelandia.com', CURRENT_DATE),
(2, 'Maria Oliveira', 'maria@memelandia.com', CURRENT_DATE);

-- =========================
-- CATEGORIAS DE MEME
-- =========================
INSERT INTO categoria_meme (
    id,
    nome,
    descricao,
    data_cadastro,
    usuario_id
) VALUES
(1, 'Programação', 'Memes sobre código e bugs', CURRENT_DATE, 1),
(2, 'Vida Dev', 'Memes sobre rotina de dev', CURRENT_DATE, 2);

-- =========================
-- MEMES
-- =========================
INSERT INTO meme (
    id,
    nome,
    descricao,
    data_cadastro,
    categoria_meme_id,
    usuario_id
) VALUES
(1, 'Compila de primeira', 'Quando o código funciona sem erro', CURRENT_DATE, 1, 1),
(2, 'Deploy na sexta', 'O clássico erro do deploy sexta-feira', CURRENT_DATE, 2, 2);

