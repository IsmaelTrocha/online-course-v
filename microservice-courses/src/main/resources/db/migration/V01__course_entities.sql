-- Crear la tabla COURSES
CREATE TABLE COURSES (
    id bigserial PRIMARY KEY,
    title VARCHAR(255),
    description TEXT,
    language VARCHAR(255),
    created_by VARCHAR(255) NOT NULL,
    creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    price DECIMAL (10,2),
    have_discount boolean DEFAULT FALSE,
    discount_price DECIMAL (10,2),
    is_enabled boolean DEFAULT TRUE,
    level VARCHAR(255)
);

-- Crear la tabla COURSE_CONTENT
CREATE TABLE COURSE_CONTENT (
    id bigserial PRIMARY KEY,
    course_id BIGINT,
    title VARCHAR(255),
    duration VARCHAR(255),
    FOREIGN KEY (course_id) REFERENCES COURSES(id)
);

-- Crear la tabla VIDEOS
CREATE TABLE VIDEOS (
    id bigserial PRIMARY KEY,
    title VARCHAR(255),
    code VARCHAR(255),
    duration INT,
    course_content_id BIGINT,
    FOREIGN KEY (course_content_id) REFERENCES COURSE_CONTENT(id)
);
