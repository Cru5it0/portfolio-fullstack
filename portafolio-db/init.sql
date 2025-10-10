-- ========================================
--   SCHEMA: PORTAFOLIO DE EVIDENCIAS
-- ========================================

-- Tabla de usuarios
CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name_user TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL,
    tel TEXT UNIQUE NOT NULL,
    bio TEXT,
    github TEXT,
    linkedin TEXT,
    role TEXT DEFAULT 'user',
    created_at TIMESTAMP DEFAULT now()
);

-- Usuario inicial (puedes modificar los datos)
INSERT INTO users (name_user, email, tel, bio, github, linkedin, role)
VALUES ('Isaac Aranda', 'cruzisaacervantes@hotmail.com', '477-399-1363', 
    'I am a software development and management engineer graduated from the University of León (UTL), 
    with a solid background in technologies and agile methodologies. My professional experience includes 
    working with agile methodologies like Scrum, which has allowed me to collaborate effectively in multidisciplinary 
    teams and adapt to changes in projects in an agile and efficient manner.', 
    'https://github.com/Cru5it0', 'https://www.linkedin.com/in/cruz-isaac-aranda-cervantes-314b93197/', 'admin');

-- Tabla de tecnologías
CREATE TABLE tecnologis (
    id SERIAL PRIMARY KEY,
    name_tec TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT now()
);

-- Tabla de proyectos
CREATE TABLE projects (
    id SERIAL PRIMARY KEY,
    title TEXT NOT NULL,
    description_project TEXT,
    tech_stack TEXT[],
    start_date DATE,
    end_date DATE,
    public BOOLEAN DEFAULT true,
    user_id INT REFERENCES users(id),
    created_at TIMESTAMP DEFAULT now()
);

-- Tabla de evidencias (archivos o enlaces)
CREATE TABLE evidences (
    id SERIAL PRIMARY KEY,
    project_id INT REFERENCES projects(id) ,
    file_url TEXT NOT NULL,
    notes TEXT,
    uploaded_at TIMESTAMP DEFAULT now()
);


